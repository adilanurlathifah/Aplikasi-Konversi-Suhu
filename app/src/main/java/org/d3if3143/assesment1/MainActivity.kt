package org.d3if3143.assesment1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import org.d3if3143.assesment1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonKonversi.setOnClickListener {
            konversiSuhu() }

        binding.buttonReset.setOnClickListener {
            resetKonversi() }
        }

    private fun resetKonversi() {
        Log.d("MainActivity", "Tombol diklik!")
    }

    private fun konversiSuhu() {
        Log.d("MainActivity", "Tombol diklik!")
    }

}