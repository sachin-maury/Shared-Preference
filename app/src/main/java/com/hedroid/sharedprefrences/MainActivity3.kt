package com.hedroid.sharedprefrences

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.hedroid.sharedprefrences.databinding.ActivityMain3Binding

class MainActivity3 : AppCompatActivity() {
    private lateinit var binding: ActivityMain3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val sharedPreferences = getPreferences(MODE_PRIVATE)
        binding.name.setText(sharedPreferences.getString("name", ""))
        binding.checkBox.isChecked = sharedPreferences.getBoolean("checked", false)

        binding.save.setOnClickListener {
            val editor = sharedPreferences.edit()
            editor.putString("name", binding.name.text.toString())
            editor.putBoolean("checked", binding.checkBox.isChecked)
            editor.apply()
        }
    }
}
