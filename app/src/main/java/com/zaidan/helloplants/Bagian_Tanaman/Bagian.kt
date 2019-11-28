package com.zaidan.helloplants.Bagian_Tanaman

import android.os.Parcel
import android.os.Parcelable

data class Bagian (
    var BagianBunga : String? = "",
    var bag1 : String? = "",
    var bag2 : String? = "",
    var bag3 : String? = "",
    var bag4 : String? = "",
    var bag5 : String? = "",
    var gambar1 : String? = "bgn_anggrek1.png",
    var gambar2 : String? = "bgn_anggrek2.jpg"
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
        parcel.writeString(BagianBunga)
        parcel.writeString(bag1)
        parcel.writeString(bag2)
        parcel.writeString(bag3)
        parcel.writeString(bag4)
        parcel.writeString(bag5)
        parcel.writeString(gambar1)
        parcel.writeString(gambar2)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Bagian> {
        override fun createFromParcel(parcel: Parcel): Bagian {
            return Bagian(parcel)
        }

        override fun newArray(size: Int): Array<Bagian?> {
            return arrayOfNulls(size)
        }
    }

}