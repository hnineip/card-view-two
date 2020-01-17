package com.hnineiphyu.recyclerviewtuto1.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.hnineiphyu.recyclerviewtuto1.R
import com.hnineiphyu.recyclerviewtuto1.model.ShoeOne
import kotlinx.android.synthetic.main.shoe_item.view.*

class ShowsViewHolder (itemView: View):RecyclerView.ViewHolder(itemView){

    var shoeImage = itemView.findViewById<ImageView>(R.id.shoe_image)
    var shoeName = itemView.findViewById<TextView>(R.id.shoe_name)
    var shoeQuality = itemView.findViewById<TextView>(R.id.shoe_quality)
    var shoePrice = itemView.findViewById<TextView>(R.id.shoe_price)

}

class ShoesAdapter (val shoesList: ArrayList<ShoeOne>):RecyclerView.Adapter<ShowsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShowsViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.shoe_item, parent,false)
        return ShowsViewHolder(view)
    }


    override fun getItemCount(): Int {
        return shoesList.size
    }

    override fun onBindViewHolder(holder: ShowsViewHolder, position: Int) {

        holder.shoeImage.setImageResource(shoesList[position].image)
        holder.shoeName.text = shoesList[position].name
        holder.shoeQuality.text = shoesList[position].quality
        holder.shoePrice.text = shoesList[position].price

    }
}