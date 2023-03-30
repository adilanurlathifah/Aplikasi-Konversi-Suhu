package org.d3if3143.assesment1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.d3if3143.assesment1.databinding.ActivityMainBinding
import java.text.DecimalFormat

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
        val inputCelcius = binding.celciusInp.text.toString()
        if(inputCelcius.isNotEmpty()) {
            binding.celciusInp.text = null
            binding.hitungTextView.text = null
            binding.radioGroup.clearCheck()
        }
    }

    private fun konversiSuhu() {
        val df = DecimalFormat("#.##")
        val inputCelcius = binding.celciusInp.text.toString()
        val result: String

        if(inputCelcius.isNotEmpty()) {
            val selectedRadioButtonId: Int =
                binding.radioGroup.checkedRadioButtonId

            if(R.id.FahrenheitRadioButton == selectedRadioButtonId) {
                result = df.format((inputCelcius.toDouble() * 9/5) + 32)
                binding.hitungTextView.text = "Hasil Konversi : $result°F"

            }
            else if(R.id.ReamurRadioButton == selectedRadioButtonId) {
                result = df.format((inputCelcius.toDouble() * 4/5))
                binding.hitungTextView.text = "Hasil Konversi : $result°Ré"
            }

            else {
                result = df.format((inputCelcius.toDouble() + 273.15))
                binding.hitungTextView.text = "Hasil Konversi: $result°K"
            }
        }
    }
}