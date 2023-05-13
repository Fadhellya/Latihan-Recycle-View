package com.fadhel.recmuhamadfadhel

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class FoodAdapter () : RecyclerView.Adapter<FoodAdapter.FoodHolder>() {
    var items : List<FoodData> = ArrayList()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodHolder {
        val view : View = LayoutInflater.from(parent.context).inflate(R.layout.food_item,parent,false)

        return FoodHolder(view)

    }

    override fun onBindViewHolder(holder: FoodHolder, position: Int) {
        when(holder){
            is FoodHolder -> {
                holder.bind(items.get(position))
            }
        }



    }
    fun submitList(foodList: List<FoodData>){
        items=foodList
    }

    override fun getItemCount(): Int {
        return items.size
    }

    inner class FoodHolder(itemView: View):RecyclerView.ViewHolder(itemView){

        var name : TextView = itemView.findViewById(R.id.txtnamamakanan)
        var price : TextView = itemView.findViewById(R.id.txthargamakanan)
        var image : ImageView=itemView.findViewById(R.id.foodimage)
        var judulket : TextView=itemView.findViewById(R.id.txtjudulket)
        var ket : TextView=itemView.findViewById(R.id.txtket)

        fun bind(foodData:FoodData){
            Glide
                .with(itemView.context)
                .load(foodData.foodImage)
                .into(image);
            name.setText(foodData.foodNama)
            price.setText(foodData.foodPrice)
            judulket.setText(foodData.foodjudulket)
            ket.setText(foodData.foodket)


        }

    }



}