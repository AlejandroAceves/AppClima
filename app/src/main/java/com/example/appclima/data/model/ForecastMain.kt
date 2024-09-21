package com.example.appclima.data.model

class ForecastMain {
    class ForecastMain(
        val temp : Double,
        val feels_like : Double
    ) : Parcelable {
        constructor(parcel: Parcel) : this(
            parcel.readDouble(),
            parcel.readDouble()
        ) {
        }

        override fun writeToParcel(parcel: Parcel, flags: Int) {
            parcel.writeDouble(temp)
            parcel.writeDouble(feels_like)
        }

        override fun describeContents(): Int {
            return 0
        }

        companion object CREATOR : Parcelable.Creator<ForecastMain> {
            override fun createFromParcel(parcel: Parcel): ForecastMain {
                return ForecastMain(parcel)
            }

            override fun newArray(size: Int): Array<ForecastMain?> {
                return arrayOfNulls(size)
            }
        }
    }
}