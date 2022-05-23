package com.example.isoloc

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.isoloc.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button.setOnClickListener {
            val myIntent = Intent(this@MainActivity,More::class.java)
            this@MainActivity.startActivity(myIntent) }
        binding.imageView5.setOnClickListener {  val myIntent = Intent(this@MainActivity,Search::class.java)
            this@MainActivity.startActivity(myIntent) }
        binding.imageView3.setOnClickListener {   val myIntent = Intent(this@MainActivity,Detail::class.java)
            this@MainActivity.startActivity(myIntent) }
        binding.imageView4.setOnClickListener { val myIntent = Intent(this@MainActivity,Detail::class.java)
            this@MainActivity.startActivity(myIntent) }
        binding.imageView6.setOnClickListener {  val myIntent = Intent(this@MainActivity,Detail::class.java)
            this@MainActivity.startActivity(myIntent)}
        binding.imageView7.setOnClickListener {  val myIntent = Intent(this@MainActivity,Detail::class.java)
            this@MainActivity.startActivity(myIntent)}

    }
}