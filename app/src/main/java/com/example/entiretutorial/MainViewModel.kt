package com.example.entiretutorial

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.entiretutorial.model.MainData
import com.example.entiretutorial.repository.MainRepository
import com.example.entiretutorial.util.SearchResult
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val repository: MainRepository) : ViewModel() {

    private val data : MutableLiveData<MainData> = MutableLiveData()

    fun getData()=data

    fun doImageOperation(){
        viewModelScope.launch {
            val result= repository.doImageSearch()
            data.postValue(result)

        }

    }
}