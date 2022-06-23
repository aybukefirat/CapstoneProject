package com.aybukefirat.capstoneproject.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.aybukefirat.capstoneproject.databinding.FragmentShopBagBinding
import com.aybukefirat.capstoneproject.retrofit.Bag


class ShopBagAdapter (var baglist : List<Bag>) : RecyclerView.Adapter<ShopBagAdapter.ShopBagViewHolder>() {
    override fun onCreateViewHolder(  //LİST BAG DATA CLASS A GÖRE Mİ YOKSA PRODUCTS A GÖRE Mİ?
        parent: ViewGroup,
        viewType: Int
    ): ShopBagAdapter.ShopBagViewHolder {

    }

    override fun onBindViewHolder(holder: ShopBagAdapter.ShopBagViewHolder, position: Int) {
        val product = baglist[position]
        holder.shopBagBinding.apply{

        }
    }

    override fun getItemCount(): Int {
        return baglist.size
    }

    class ShopBagViewHolder  (val shopBagBinding: FragmentShopBagBinding){
        RecyclerView.ViewHolder()

    }


}