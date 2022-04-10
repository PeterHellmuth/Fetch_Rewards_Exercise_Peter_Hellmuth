package com.example.fetch_rewards_exercise_peter_hellmuth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fetch_rewards_exercise_peter_hellmuth.databinding.ActivityMainBinding



class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val jsonString = "Test"


        binding.mainText.text = jsonString
    }

}