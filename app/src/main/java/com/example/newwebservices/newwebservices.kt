package com.example.newwebservices
import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.newwebservices.Model.addressdata
import com.example.newwebservices.Model.dataadapter
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class newwebservices : AppCompatActivity() {
    var datalist = ArrayList<addressdata>()
    lateinit var recyclreview:RecyclerView
    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_newwebservices)
         recyclreview= findViewById(R.id.recyclerview_1)
        recyclreview.adapter=dataadapter(datalist,this)
        recyclreview.layoutManager=LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        getData()
    }

    private fun getData() {
        val call: Call<List<addressdata>> = apiClient.getclient.getuser()
        call.enqueue(object : Callback<List<addressdata>> {
            override fun onResponse(call: Call<List<addressdata>>?, response: Response<List<addressdata>>?) {
                datalist.addAll(response!!.body()!!)
                recyclreview.adapter?.notifyDataSetChanged()
                if (response!!.isSuccessful) {

                    for (index in 0..datalist.size - 1) {
                        Log.e("Id", "" + datalist[index].id)
                        Log.e("Name", "" + datalist[index].name)
                        Log.e("Username", "" + datalist[index].username)
                        Log.e("Email", "" + (datalist[index].address?.street))

                    }
                } else {
                    Log.e("123", "No Data")
                }
            }

            override fun onFailure(call: Call<List<addressdata>>, t: Throwable) {
                Log.e("1234", "No Data")
            }
        })

    }
}