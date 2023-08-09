package io.amntoppo.stepstracker.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import dagger.hilt.android.AndroidEntryPoint
import io.amntoppo.stepstracker.R
import io.amntoppo.stepstracker.database.StepsDAO
import io.amntoppo.stepstracker.databinding.ActivityMainBinding
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.apply {
            setSupportActionBar(toolbar)
            val navView: BottomNavigationView = bottomNavigationView
            val navController = findNavController(R.id.navHostFragment)
//            binding.nav
            navView.setupWithNavController(navController)
////            flFragment.findNavController()
            navController
                .addOnDestinationChangedListener { controller, destination, argument ->
                    when (destination.id) {
                        R.id.settingFragment, R.id.runFragment, R.id.statsFragment ->
                            bottomNavigationView.visibility = View.VISIBLE
                        else ->
                            bottomNavigationView.visibility = View.GONE
                    }
                }
        }

    }
}