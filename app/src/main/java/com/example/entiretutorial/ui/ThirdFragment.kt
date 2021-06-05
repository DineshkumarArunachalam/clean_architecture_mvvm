package com.example.entiretutorial.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.entiretutorial.R

import com.example.entiretutorial.databinding.FragmentThirdBinding
import com.example.entiretutorial.util.startNavigation
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ThirdFragment : Fragment(R.layout.fragment_third) {

    private lateinit var fragmentThirdBinding: FragmentThirdBinding


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fragmentThirdBinding= FragmentThirdBinding.bind(view)
        fragmentThirdBinding.textviewSecond.text= arguments?.get("prevfragmentname").toString()
        navigateToFragment()
    }

    private fun navigateToFragment() {
        fragmentThirdBinding.buttonSecond.setOnClickListener {
            findNavController().startNavigation(
                ThirdFragmentDirections.actionThirdFragmentToFirstFragment(
                    "Thirdfragment"
                )
            )
        }
    }
}