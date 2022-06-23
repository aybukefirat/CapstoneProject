package com.aybukefirat.capstoneproject.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.aybukefirat.capstoneproject.R
import com.aybukefirat.capstoneproject.databinding.FragmentShopBagBinding


class ShopBagFragment : Fragment() {

    private lateinit var shopbagBinding : FragmentShopBagBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        shopbagBinding = FragmentShopBagBinding.inflate(inflater,container,false)
        return shopbagBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        shopbagBinding.orderButton.setOnClickListener {
            findNavController().navigate(R.id.action_shopBagFragment_to_lastFragment)
        }
    }



}