package com.enterprise.acy.presentation.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.enterprise.acy.data.db.ObjectEntity
import com.enterprise.acy.domain.repository.Repository

class LoginViewModel : ViewModel() {
    private var repository: Repository = Repository()

    private val objectsLiveData: LiveData<List<ObjectEntity>> = MutableLiveData()

    private fun getObjectsLiveData(): LiveData<List<ObjectEntity>>{
       return repository.getAllObjects()
    }


}
