package com.example.entiretutorial.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.fragment.findNavController
import com.example.entiretutorial.R

import com.example.entiretutorial.databinding.FragmentSecondBinding
import com.example.entiretutorial.util.startNavigation
import dagger.hilt.android.AndroidEntryPoint

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
@AndroidEntryPoint
class SecondFragment : Fragment(R.layout.fragment_second) {

    private lateinit var fragmentSecondBinding: FragmentSecondBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fragmentSecondBinding= FragmentSecondBinding.bind(view)
        fragmentSecondBinding.textviewSecond.text= arguments?.get("prevfragmentname").toString()
        navigateToFragment()
    }

    private fun navigateToFragment() {
        fragmentSecondBinding.buttonSecond.setOnClickListener {
            findNavController().startNavigation(
                SecondFragmentDirections.actionSecondFragmentToThirdFragment(
                    "secondFragment"
                )
            )
        }
    }


}