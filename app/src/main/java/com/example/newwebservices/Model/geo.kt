package com.example.newwebservices.Model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class geo (

    @SerializedName("lat")
    @Expose
    var lat: String? = null,
    @SerializedName("lng")
    @Expose
    var lng: String? = null

)
