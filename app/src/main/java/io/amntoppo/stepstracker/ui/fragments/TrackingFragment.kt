package io.amntoppo.stepstracker.ui.fragments

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import dagger.hilt.android.AndroidEntryPoint
import io.amntoppo.stepstracker.R
import io.amntoppo.stepstracker.ui.viewmodels.MainViewModel

@AndroidEntryPoint
class TrackingFragment: Fragment(R.layout.fragment_tracking) {

    private val viewModel: MainViewModel by viewModels()

}