package com.aybukefirat.capstoneproject.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.aybukefirat.capstoneproject.R
import com.aybukefirat.capstoneproject.adapter.CategoriesAdapter
import com.aybukefirat.capstoneproject.databinding.FragmentCategoryBinding
import com.aybukefirat.capstoneproject.retrofit.Product
import com.aybukefirat.capstoneproject.retrofit.ProductAPIService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class CategoryFragment : Fragment() {

   private lateinit var categoryBinding : FragmentCategoryBinding
   private lateinit var pdi : ProductAPIService

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        categoryBinding = FragmentCategoryBinding.inflate(inflater, container,false)
        return categoryBinding.root


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        categoryBinding.categoryrecv.layoutManager = GridLayoutManager(activity,1, GridLayoutManager.VERTICAL, false)
        //categoryBinding.categoryrecv.adapter = CategoriesAdapter(Li)
        getCategories()
    }

    fun getCategories(){
        pdi.getCategories().enqueue(object : retrofit2.Callback<List<Product>> {
            override fun onResponse(call: Call<List<Product>>, response: Response<List<Product>>) {

            }

            override fun onFailure(call: Call<List<Product>>, t: Throwable) {

            }

        })
    }

    fun searchCategories(searchCategory : String ){

    }




}