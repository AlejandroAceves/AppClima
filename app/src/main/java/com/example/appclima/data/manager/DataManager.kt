package com.example.appclima.data.manager

import android.content.Context
import com.example.appclima.data.model.ForecastResponse
import com.example.appclima.data.model.WeatherResponse
import com.example.appclima.data.remote.api.WeatherAPI
import com.example.appclima.data.remote.client.ServiceGenerator
import com.example.appclima.util.SharedPreferencesConnector
import rx.Observable

class DataManager (val context: Context) {
    private val connector = SharedPreferencesConnector.getInstance(context)

    fun getWeather () : Observable<WeatherResponse> {
        return ServiceGenerator.createService(WeatherAPI::class.java, context).getWeather("32.7617","-115.4129352")
    }

    fun getForecast():Observable<ForecastResponse>{
        return ServiceGenerator.createService(WeatherAPI::class.java, context).getForecast()
    }
}