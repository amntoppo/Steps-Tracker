package io.amntoppo.stepstracker.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import dagger.hilt.android.AndroidEntryPoint
import io.amntoppo.stepstracker.R
import io.amntoppo.stepstracker.databinding.FragmentRunBinding
import io.amntoppo.stepstracker.ui.viewmodels.MainViewModel

@AndroidEntryPoint
class RunFragment: Fragment(R.layout.fragment_run) {
    private lateinit var binding: FragmentRunBinding
    private val viewModel: MainViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentRunBinding.inflate(layoutInflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            fab.setOnClickListener { 
                findNavController().navigate(R.id.action_runFragment_to_trackingFragment)
            }
        }
    }
}