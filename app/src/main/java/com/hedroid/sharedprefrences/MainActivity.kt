package com.hedroid.sharedprefrences

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle

import androidx.appcompat.app.AppCompatActivity
import com.hedroid.sharedprefrences.databinding.ActivityMainBinding


@Suppress("NAME_SHADOWING")
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    @SuppressLint("CommitPrefEdits")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val editor=getSharedPreferences("MY_SETTINGS", MODE_PRIVATE)
        binding.email.setText(editor.getString("email",null))
        binding.pass.setText(editor.getString("password",null))
        binding.settingsButton.setOnClickListener{
           startActivity(Intent(this,SettingsActivity::class.java))
        }
        binding.logIn.setOnClickListener{
            val editor=getSharedPreferences("MY_SETTINGS", MODE_PRIVATE).edit()
            editor.putString("email",binding.email.text.toString())
            editor.putString("password",binding.pass.text.toString())
            editor.apply()
            startActivity(Intent(this,MainActivity2::class.java))


        }


    }
}