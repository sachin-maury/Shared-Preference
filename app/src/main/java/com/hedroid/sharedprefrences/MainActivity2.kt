package com.hedroid.sharedprefrences

import android.annotation.SuppressLint
import android.os.Bundle

import androidx.appcompat.app.AppCompatActivity
import com.hedroid.sharedprefrences.databinding.ActivityMain2Binding


class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        val editor=getSharedPreferences("MY_SETTINGS", MODE_PRIVATE)
        binding.textView.text = "Hey your E-Mail Is ${editor.getString("email",null)}" + " " +
                "And your Password is ${editor.getString("Password",null)}"

    }
}

