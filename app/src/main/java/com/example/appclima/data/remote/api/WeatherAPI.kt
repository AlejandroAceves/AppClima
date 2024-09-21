package com.example.appclima.data.remote.api

import retrofit2.http.Query

interface WeatherAPI {
    @GET("weather?")
    fun getWeather(@Query("lat") lat: String,
        @Query("lon") lon: String,@Query("appid")apikey:String ):Observable<WeatherResponse>

    @GET("forecast?")
    fun getForecast(@Query("id") id: String,
                    @Query("appid") appkey: String ): Observable<ForecastResponse>
}