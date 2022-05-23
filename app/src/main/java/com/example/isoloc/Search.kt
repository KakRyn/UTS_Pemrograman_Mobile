package com.example.isoloc

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.isoloc.databinding.SearchBinding

class Search : AppCompatActivity() {
    private lateinit var binding: SearchBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = SearchBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}