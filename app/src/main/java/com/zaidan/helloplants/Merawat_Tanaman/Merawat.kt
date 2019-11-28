package com.zaidan.helloplants.Merawat_Tanaman

import android.os.Parcel
import android.os.Parcelable

data class Merawat (
    var gambarperawatan : String? = "kebun_anggrek.jpg",
    var gambar : String? = "",
    var dirawat : String? = "",
    var cara1 : String? = "",
    var cara2 : String? = "",
    var cara3 : String? = "",
    var cara4 : String? = "",
    var cara5 : String? = ""
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(gambarperawatan)
        parcel.writeString(gambar)
        parcel.writeString(dirawat)
        parcel.writeString(cara1)
        parcel.writeString(cara2)
        parcel.writeString(cara3)
        parcel.writeString(cara4)
        parcel.writeString(cara5)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Merawat> {
        override fun createFromParcel(parcel: Parcel): Merawat {
            return Merawat(parcel)
        }

        override fun newArray(size: Int): Array<Merawat?> {
            return arrayOfNulls(size)
        }
    }

}
