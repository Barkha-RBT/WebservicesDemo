package com.example.newwebservices.Model

import android.location.Address

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class addressdata(

    @SerializedName("id")
    @Expose
    var id: Int? = null,
    @SerializedName("name")
    @Expose
    var name: String? = null,
    @SerializedName("username")
    @Expose
    var username: String? = null,
    @SerializedName("email")
    @Expose
    var email: String? = null,
    @SerializedName("address")
    @Expose
    var address: address? = null,
    @SerializedName("phone")
    @Expose
    var phone: String? = null,
    @SerializedName("website")
    @Expose
    var website: String? = null,
    @SerializedName("company")
    @Expose
    var company: company? = null

)