package io.amntoppo.stepstracker.ui.viewmodels

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import io.amntoppo.stepstracker.repository.MainRepository
import javax.inject.Inject

@HiltViewModel
class StatsViewModel @Inject constructor(
    val mainRepository: MainRepository
): ViewModel() {
}