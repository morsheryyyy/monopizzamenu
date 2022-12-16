package com.example.monopizzamenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.monopizzamenu.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        supportFragmentManager.beginTransaction()
//            .replace(binding.listFragment.id, ListFragment())
//            .addToBackStack(null)
//            .commit()
    }

}