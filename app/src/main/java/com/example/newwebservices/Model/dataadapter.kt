package com.example.newwebservices.Model

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.newwebservices.R
import kotlinx.android.synthetic.main.cardview.view.*

class dataadapter(private var datalist:List<addressdata>,private val contax:Context):RecyclerView.Adapter<dataadapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(contax).inflate(R.layout.cardview,parent,false))
    }

    override fun getItemCount(): Int {
        return datalist.size
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
      var datamodel=datalist.get(position)
        holder.id.text= "Id:  "+datamodel.id.toString()
        holder.name.text="Name: "+datamodel.name.toString()
        holder.useranme.text="Username: "+datamodel.username.toString()
        holder.email.text="Email: "+datamodel.email.toString()
        holder.street.text= "Street: "+datamodel.address?.street.toString()
        holder.suite.text="Suite: "+datamodel.address?.suite.toString()
        holder.city.text="City: "+datamodel.address?.city.toString()
        holder.zipcode.text="Zipcode: "+datamodel.address?.zipcode.toString()

    }

    class ViewHolder(itemLayoutview: View) :RecyclerView.ViewHolder(itemLayoutview){

            var id=itemLayoutview.findViewById(R.id.txtid) as TextView
            var name=itemLayoutview.findViewById(R.id.txtname)as TextView
            var useranme=itemLayoutview.findViewById(R.id.txtusername) as TextView
            var email=itemLayoutview.findViewById(R.id.txtemail)as TextView
            var street=itemLayoutview.findViewById(R.id.txtstreet)as TextView
            var suite=itemLayoutview.findViewById(R.id.txtsuite)as TextView
            var city=itemLayoutview.findViewById(R.id.txtcity)as TextView
            var zipcode=itemLayoutview.findViewById(R.id.txtzipcode)as TextView


    }
}

