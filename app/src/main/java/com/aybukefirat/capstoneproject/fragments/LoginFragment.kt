package com.aybukefirat.capstoneproject.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.aybukefirat.capstoneproject.R
import com.aybukefirat.capstoneproject.databinding.FragmentLoginBinding
import com.google.firebase.auth.FirebaseAuth


class LoginFragment : Fragment() {

    private lateinit var loginBinding: FragmentLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        loginBinding = FragmentLoginBinding.inflate(inflater, container, false)

        return loginBinding.root

    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loginBinding.apply {

            loginButton.setOnClickListener {
                loginValidation(
                    loginEmail.text.toString(),
                    loginPass.text.toString()
                )

            }

            loginBinding.fpButton.setOnClickListener {
                findNavController().navigate(R.id.action_loginFragment_to_forgotPassFragment)
            }
        }

        fun loginValidation(email: String, password: String) {
            val emailControl = email.trim { it <= ' ' }
            val passwordControl = password.trim { it <= ' ' }

            FirebaseAuth.getInstance()
                .signInWithEmailAndPassword(emailControl, passwordControl)
                .addOnCompleteListener { task ->
                    if (task.isSuccessful) {
                        Toast.makeText(activity, "Login Sucessful", Toast.LENGTH_LONG).show()
                        findNavController().navigate(R.id.action_loginFragment_to_mainActivity2)
                    } else {
                        Toast.makeText(activity, "Please Try Again", Toast.LENGTH_LONG).show()
                    }

                }

        }

    }
}






