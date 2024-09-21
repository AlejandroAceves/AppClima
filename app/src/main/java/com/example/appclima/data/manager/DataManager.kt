package com.example.appclima.data.manager

import android.content.Context
import rx.Observable

class DataManager (val context: Context) {
    private val connector = SharedPreferencesConnector.getInstance(context)

    fun getWeather () : Observable<WeatherResponse> {
        return ServiceGenerator.createService(WeatherAPI::class java,context).getWeather()
    }

    fun getForecast():Observable<ForcastResponse>{
        return ServiceGenerator.createService(WeatherAPI::class java,context).getForecast()
    }
}