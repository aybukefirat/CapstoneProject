package com.aybukefirat.capstoneproject.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.aybukefirat.capstoneproject.R
import com.aybukefirat.capstoneproject.databinding.FragmentMainPageBinding
import com.aybukefirat.capstoneproject.databinding.MainpageCardDesignBinding
import com.aybukefirat.capstoneproject.retrofit.Product

class MainPageAdapter (var products: List<Product>) : RecyclerView.Adapter<MainPageAdapter.ProductViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val inflater = LayoutInflater.from(parent.context)//SORULACAK
        val mainPageBinding = MainpageCardDesignBinding.inflate(inflater,parent,false)
        return ProductViewHolder(mainPageBinding) //binding olmasaydı burada inflater return edilecekti


    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        val product = products[position]
        holder.mainPageBinding.apply{
            productTitleText.text = product.productTitle
            productPriceText.text = product.productPrice
            //image.setImageResource(Product.image)


        }
    }

    override fun getItemCount(): Int {
        return products.size
    }

    class ProductViewHolder(val mainPageBinding: MainpageCardDesignBinding) :
        RecyclerView.ViewHolder(mainPageBinding.root)

}