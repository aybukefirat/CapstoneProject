package com.aybukefirat.capstoneproject.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.aybukefirat.capstoneproject.R
import com.aybukefirat.capstoneproject.databinding.FragmentLastBinding

class LastFragment : Fragment() {

    private lateinit var lastfragBinding: FragmentLastBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        lastfragBinding = FragmentLastBinding.inflate(inflater,container,false)
        return lastfragBinding.root


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        lastfragBinding.button.setOnClickListener {
            findNavController().navigate(R.id.action_lastFragment_to_mainPageFragment)
        }
    }



}