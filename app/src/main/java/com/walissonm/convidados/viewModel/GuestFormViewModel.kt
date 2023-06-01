package com.walissonm.convidados.viewModel

import androidx.lifecycle.ViewModel
import com.walissonm.convidados.repository.GuestRepository

class GuestFormViewModel : ViewModel() {
    private val repository = GuestRepository.getInstance()
}