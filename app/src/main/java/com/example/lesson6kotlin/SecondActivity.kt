package com.example.lesson6kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lesson6kotlin.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val musicTitle = intent.getStringExtra("key1")
        binding.tvShow.text = musicTitle
    }



}