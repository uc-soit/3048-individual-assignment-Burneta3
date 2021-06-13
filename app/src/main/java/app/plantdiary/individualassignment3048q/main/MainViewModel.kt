package app.plantdiary.individualassignment3048q.main

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import app.plantdiary.individualassignment3048q.dto.Country
import app.plantdiary.individualassignment3048q.service.CountryService

class MainViewModel : ViewModel() {
    var countries: MutableLiveData<ArrayList<Country>> = MutableLiveData<ArrayList<Country>>()
    var countryService: CountryService = CountryService()

    init{
        fetchCountries()
    }

    fun fetchCountries() {
        Log.d("MainViewModel", "fetchCountries: called.")
        countries = countryService.fetchCountries()
    }
}
