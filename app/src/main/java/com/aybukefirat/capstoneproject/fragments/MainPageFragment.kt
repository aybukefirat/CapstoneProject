package com.aybukefirat.capstoneproject.fragments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.HorizontalScrollView
import android.widget.Toast
import android.widget.Toolbar
import androidx.recyclerview.widget.GridLayoutManager
import com.aybukefirat.capstoneproject.R
import com.aybukefirat.capstoneproject.adapter.MainPageAdapter
import com.aybukefirat.capstoneproject.databinding.FragmentMainPageBinding
import com.aybukefirat.capstoneproject.retrofit.APIInstance
import com.aybukefirat.capstoneproject.retrofit.Product
import com.aybukefirat.capstoneproject.retrofit.ProductAPIService
import com.google.android.gms.common.util.CollectionUtils.listOf
import retrofit2.Call
import retrofit2.Response


class MainPageFragment : Fragment() {

    private lateinit var mainPageBinding: FragmentMainPageBinding
    private lateinit var mainpageAdapter : MainPageAdapter
    private lateinit var pdi : ProductAPIService

    private var products = listOf<Product>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mainPageBinding = FragmentMainPageBinding.inflate(inflater,container,false)
        return mainPageBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        getPoducts()

    }

    fun getPoducts(){
        pdi = APIInstance.getInstance().create(ProductAPIService :: class.java)
        pdi.getProducts().enqueue(object : retrofit2.Callback<List<Product>> {
            override fun onResponse(call: Call<List<Product>>, response: Response<List<Product>>) {

                mainPageBinding.mainpageRecview.layoutManager = GridLayoutManager(activity,1, GridLayoutManager.HORIZONTAL,false)
                mainPageBinding.mainpageRecview.adapter = MainPageAdapter(response.body()!!)

            }

            override fun onFailure(call: Call<List<Product>>, t: Throwable) {

                Toast.makeText(activity, "Data Error",Toast.LENGTH_LONG).show()
            }

        })
    }


}