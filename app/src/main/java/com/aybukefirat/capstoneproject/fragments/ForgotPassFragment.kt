package com.aybukefirat.capstoneproject.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class ForgotPassFragment : Fragment() {

    private lateinit var fpassBinding : FragmentForgotPassBinding



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        fpassBinding = FragmentForgotPassBinding.inflate(inflater,container,false)
        return fpassBinding.root

    }


}