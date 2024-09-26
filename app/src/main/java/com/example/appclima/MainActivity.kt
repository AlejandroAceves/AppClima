package com.example.appclima

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.annotation.Nullable
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.appclima.ui.MainContract
import com.example.appclima.ui.MainPresenter
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity(),MainContract.View {

    private var presenter: MainPresenter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        presenter = MainPresenter(this,this)
        getInitialData()

        override fun getInitialData() {
            presenter?.getWeather()
        }

        override fun showWeather(climate: String) {
            findViewById<TextView>(R.id.climaActual).text=climate
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}