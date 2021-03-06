package com.example.homework.data.DO.file

import android.os.Parcel
import android.os.Parcelable
import com.example.homework.data.DO.WithId
import com.google.gson.annotations.SerializedName
import paperparcel.PaperParcel

/**
 * Created by Administrator on 2017/11/8 0008.
 */
@PaperParcel
data class MyFile(
        @SerializedName("_id")   var id: String,
        @SerializedName("fname")var fname: String,
        @SerializedName("url")var url: String
) : Parcelable {

    companion object {
        @JvmField val CREATOR = PaperParcelMyFile.CREATOR
    }

    override fun describeContents() = 0

    override fun writeToParcel(dest: Parcel, flags: Int) {
        PaperParcelMyFile.writeToParcel(this, dest, flags)
    }
}