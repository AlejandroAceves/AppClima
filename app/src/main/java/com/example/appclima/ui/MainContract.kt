package com.example.appclima.ui

interface MainContract {
    interface View{
        fun getInitialData()
        fun showWeather(climate: String)
    }

    interface Presenter{
        fun getWeather()
    }
}