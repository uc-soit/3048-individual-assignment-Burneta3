package app.plantdiary.individualassignment3048q.dto

import android.util.Log

class Country (val code: String, val name: String) {

    override fun toString(): String {
        Log.d("Country", "toString called. returns $name $code")
        return ("$name $code")
    }
}