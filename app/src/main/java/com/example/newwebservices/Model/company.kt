package com.example.newwebservices.Model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class company(

    @SerializedName("name")
    @Expose
    var name: String? = null,
    @SerializedName("catchPhrase")
    @Expose
    var catchPhrase: String? = null,
    @SerializedName("bs")
    @Expose
    var bs: String? = null

)