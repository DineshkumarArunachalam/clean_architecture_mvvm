package com.example.entiretutorial.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController

import com.example.entiretutorial.MainViewModel
import com.example.entiretutorial.R
import com.example.entiretutorial.databinding.FragmentFirstBinding
import com.example.entiretutorial.util.SearchResult
import com.example.entiretutorial.util.startNavigation
import dagger.hilt.android.AndroidEntryPoint

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
@AndroidEntryPoint
class FirstFragment : Fragment(R.layout.fragment_first) {


    private val viewModel:MainViewModel by viewModels()
    private lateinit var fragmentFirstBinding:FragmentFirstBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fragmentFirstBinding= FragmentFirstBinding.bind(view)
        initViewModel()
      //  navigationToFragment()
    }

    private fun initViewModel() {
        viewModel.doImageOperation()
        viewModel.getData().observe(viewLifecycleOwner, Observer {


                val data= it.data
                fragmentFirstBinding.textviewFirst.text=data?.get(0)?.pantoneValue.toString()


        })
    }

    private fun navigationToFragment() {
       fragmentFirstBinding.buttonFirst.setOnClickListener {
           findNavController().startNavigation(
               FirstFragmentDirections.actionFirstFragmentToSecondFragment(
                   "firstfragment"
               )
           )

       }

    }


}