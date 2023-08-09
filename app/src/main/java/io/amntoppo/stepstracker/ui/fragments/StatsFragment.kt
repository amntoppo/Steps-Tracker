package io.amntoppo.stepstracker.ui.fragments

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import dagger.hilt.android.AndroidEntryPoint
import io.amntoppo.stepstracker.R
import io.amntoppo.stepstracker.ui.viewmodels.MainViewModel
import io.amntoppo.stepstracker.ui.viewmodels.StatsViewModel

@AndroidEntryPoint
class StatsFragment: Fragment(R.layout.fragment_stats) {

    private val viewModel: StatsViewModel by viewModels()

}