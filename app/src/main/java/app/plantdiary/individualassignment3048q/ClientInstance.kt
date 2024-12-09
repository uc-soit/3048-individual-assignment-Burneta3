package app.plantdiary.individualassignment3048q

import android.util.Log
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ClientInstance {

    private var retrofit: Retrofit? = null
    private var BASE_URL = "https://pkgstore.datahub.io"

    val instance : Retrofit?
        get(){
            if (retrofit == null) {
                Log.d("ClientInstance", "retrofit is null. Building.")
                retrofit = Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
            }
            return retrofit
        }

}