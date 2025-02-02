package com.example.finalprojectpam

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.finalprojectpam.databinding.ActivityMainBinding
import com.example.finalprojectpam.DependenciesInjection.PencatatanApplication

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val appContainer by lazy {
        // Pastikan ini hanya diakses setelah aplikasi sepenuhnya berjalan
        (applicationContext as PencatatanApplication).container
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navView: BottomNavigationView = binding.navView

        val navController = findNavController(R.id.nav_host_fragment_activity_main)
        val appBarConfiguration = AppBarConfiguration(setOf(
            R.id.navigation_home,
            R.id.navigation_asset,
            R.id.navigation_kategori,
            R.id.navigation_pendapatan,
            R.id.navigation_pengeluaran))
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
    }
}
