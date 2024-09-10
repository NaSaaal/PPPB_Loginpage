package com.example.loginpage

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.loginpage.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
            fun getName() : String{
                return binding.inputFullname.text.toString()
            }
            binding.btnSign.setOnClickListener {
                Toast.makeText(this, "Selamat bergabung " + getName(), Toast.LENGTH_SHORT).show()
            }
        }
    }