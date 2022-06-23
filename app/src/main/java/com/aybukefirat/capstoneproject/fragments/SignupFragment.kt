package com.aybukefirat.capstoneproject.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.aybukefirat.capstoneproject.R
import com.aybukefirat.capstoneproject.databinding.FragmentSignupBinding
import com.google.firebase.auth.FirebaseAuth


class SignupFragment : Fragment() {

    private lateinit var signupBinding : FragmentSignupBinding


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        signupBinding = FragmentSignupBinding.inflate(inflater,container,false)
        return signupBinding.root



    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        signupBinding.apply {

            registerButton.setOnClickListener {
                registerValidation(registerEmail.text.toString(), registerPass.text.toString())

            }
        }
        signupBinding.registerButton.setOnClickListener {
            findNavController().navigate(R.id.action_signupFragment_to_loginFragment)
        }
    }


    private fun registerValidation(email : String , password : String){

        val emailControl = email.trim { it <= ' '}
        val passwordControl = password.trim { it <= ' '}

        FirebaseAuth.getInstance()
                .createUserWithEmailAndPassword(emailControl, passwordControl)
                .addOnCompleteListener { task ->
            if (task.isSuccessful){
                Toast.makeText(activity, "Register Sucessful", Toast.LENGTH_LONG).show()
                findNavController().navigate(R.id.action_signupFragment_to_loginFragment)

            } else {
                Toast.makeText(activity, task.exception !!.message.toString(), Toast.LENGTH_LONG).show()
            }
        }

    }

}


