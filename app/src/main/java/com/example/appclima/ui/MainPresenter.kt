package com.example.appclima.ui

import android.content.Context
import com.example.appclima.data.manager.DataManager
import com.example.appclima.data.model.WeatherResponse
import com.google.common.base.Throwables
import rx.Scheduler
import rx.Subscriber
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers

class MainPresenter(
    private val view : MainContract.View,
    private val context: Context
    ):MainContract.Presenter{
    private val dataManager = DataManager(context)

    override fun getWeather(){
        val observable = dataManager.getWeather()
        observable.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
            .subscribe(object:Subscriber<WeatherResponse>(){
                override fun onCompleted() {
                    TODO("Not yet implemented")
                }

                override fun onError(e: Throwable?) {
                    TODO("Not yet implemented")
                }

                override fun onNext(t: WeatherResponse?) {
                    TODO("Not yet implemented")
                }

            })
    }

    }

}