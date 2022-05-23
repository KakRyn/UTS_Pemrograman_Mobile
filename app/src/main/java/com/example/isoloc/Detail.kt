package com.example.isoloc

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.isoloc.databinding.DetailBinding

class Detail : AppCompatActivity() {
    private lateinit var binding: DetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}