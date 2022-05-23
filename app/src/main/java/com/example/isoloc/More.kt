package com.example.isoloc

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.isoloc.databinding.MoreBinding

class More : AppCompatActivity() {
    private lateinit var binding: MoreBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MoreBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}