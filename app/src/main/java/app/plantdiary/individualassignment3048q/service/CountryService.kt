package app.plantdiary.individualassignment3048q.service

import android.util.Log
import androidx.lifecycle.MutableLiveData
import app.plantdiary.individualassignment3048q.ClientInstance
import app.plantdiary.individualassignment3048q.dao.CountryDAO
import app.plantdiary.individualassignment3048q.dto.Country
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class CountryService {

    fun fetchCountries() : MutableLiveData<ArrayList<Country>> {
        var countries = MutableLiveData<ArrayList<Country>>()
        val service = ClientInstance.instance?.create(CountryDAO::class.java)
        val call = service?.getAllCountries()
        call?.enqueue(object: Callback<ArrayList<Country>> {
            override fun onResponse(
                call: Call<ArrayList<Country>>,
                response: Response<ArrayList<Country>>
            ) {
                Log.d("CountryService", "Response received. setting the value of countries.value to the response body.")
                countries.value = response.body()
            }

            override fun onFailure(call: Call<ArrayList<Country>>, t: Throwable) {
                Log.e("CountryService", "enqueue failure")
            }

        })

        return countries
    }
}