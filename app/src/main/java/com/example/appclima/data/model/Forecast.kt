package com.example.appclima.data.model

class Forecast {
    data class Forecast (
        val dt: Long,
        val main: ForecastMain?
    ): Parcelable {
        constructor(parcel: Parcel) : this(
            parcel.readLong(),
            parcel.readParcelable(ForecastMain::class.java.classLoader)
        ) {
        }

        override fun writeToParcel(parcel: Parcel, flags: Int) {
            parcel.writeLong(dt)
            parcel.writeParcelable(main, flags)
        }

        override fun describeContents(): Int {
            return 0
        }

        companion object CREATOR : Parcelable.Creator<Weather> {
            override fun createFromParcel(parcel: Parcel): Weather {
                return Weather(parcel)
            }

            override fun newArray(size: Int): Array<Weather?> {
                return arrayOfNulls(size)
            }
        }
    }
}