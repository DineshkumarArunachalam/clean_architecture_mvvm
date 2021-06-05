package com.example.entiretutorial.util

import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.NavDirections
import androidx.navigation.fragment.findNavController
import com.example.entiretutorial.R


fun NavController.startNavigation(direction: NavDirections){
    this.navigate(direction)
}