package com.zaidan.helloplants.Nama_Tanaman

import android.os.Parcel
import android.os.Parcelable

data class Tanaman(
    var nama: String? = "",
    var namalatin: String? = "",
    var namaGambar: String? = "Orchid.jpg",
    var deskripsi: String? = "",
    var GambarBG: String? ="kebun_anggrek.jpg"
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(nama)
        parcel.writeString(namalatin)
        parcel.writeString(namaGambar)
        parcel.writeString(deskripsi)
        parcel.writeString(GambarBG)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Tanaman> {
        override fun createFromParcel(parcel: Parcel): Tanaman {
            return Tanaman(parcel)
        }

        override fun newArray(size: Int): Array<Tanaman?> {
            return arrayOfNulls(size)
        }
    }

}
