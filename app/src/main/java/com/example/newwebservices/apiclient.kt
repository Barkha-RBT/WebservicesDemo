package com.example.newwebservices
import com.google.gson.GsonBuilder
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object apiClient
{


    var BaseUrl:String="https://jsonplaceholder.typicode.com/"
    val getclient: apiInterface
        get()
        {
            val gson=GsonBuilder().setLenient().create()
            val interceptor=HttpLoggingInterceptor()
            interceptor.setLevel(HttpLoggingInterceptor.Level.BODY)
            val client=OkHttpClient.Builder().addInterceptor(interceptor).build()
            var retrofit=Retrofit.Builder().baseUrl(BaseUrl).client(client).addConverterFactory(GsonConverterFactory.create(gson)).build()
            return retrofit.create(apiInterface::class.java)
        }
}