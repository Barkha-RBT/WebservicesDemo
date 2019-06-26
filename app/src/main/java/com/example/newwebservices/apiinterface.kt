package com.example.newwebservices



import com.example.newwebservices.Model.addressdata
import retrofit2.Call
import retrofit2.http.GET


interface apiInterface{
    @GET("users")
    fun getuser():Call<List<addressdata>>

}