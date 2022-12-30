package com.example.roomwithdihilt.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.roomwithdihilt.data.entity.User
import com.example.roomwithdihilt.repository.UserRepo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val repo: UserRepo) : ViewModel() {
    private val _users = MutableLiveData<List<User>>()
    val user: LiveData<List<User>> = _users
    init {
        loadUser()
    }
    private fun loadUser() {
        viewModelScope.launch {
            _users.value = repo.allUsers()
        }
    }
}