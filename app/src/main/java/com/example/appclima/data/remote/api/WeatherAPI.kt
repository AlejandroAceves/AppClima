package com.example.appclima.data.remote.api

import com.example.appclima.data.model.ForecastResponse
import com.example.appclima.data.model.WeatherResponse
import retrofit2.http.GET
import retrofit2.http.Query
import rx.Observable

interface WeatherAPI {
    @GET("weather?")
    fun getWeather(@Query("lat") lat: String,
                   @Query("lon") lon: String,
                   @Query("appid") apikey:String ): Observable<WeatherResponse>("32.7617","-115.4129352","e2dd1bc1f45a59fd581e1f01044e6e31")

    @GET("forecast?")
    fun getForecast(@Query("id") id: String,
                    @Query("appid") apikey: String ): Observable<ForecastResponse>("524901","e2dd1bc1f45a59fd581e1f01044e6e31")
}