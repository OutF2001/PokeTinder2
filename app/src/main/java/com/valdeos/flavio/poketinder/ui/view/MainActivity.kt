package com.valdeos.flavio.poketinder.ui.view

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import androidx.navigation.Navigation.findNavController
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.valdeos.flavio.poketinder.R
import com.valdeos.flavio.poketinder.ui.viewmodel.HomeViewModel
import com.valdeos.flavio.poketinder.data.model.PokemonResponse
import com.valdeos.flavio.poketinder.databinding.ActivityMainBinding
import com.valdeos.flavio.poketinder.ui.adapter.PokemonAdapter

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navController = findNavController(R.id.nav_host_fragment)
        binding.navView.setupWithNavController(navController)
    }

}
