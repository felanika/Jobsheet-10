package com.example.jobsheet10

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        // Ambil data dari intent
        val nama = intent.getStringExtra("NAMA")
        val nim = intent.getStringExtra("NIM")
        val kelas = intent.getStringExtra("KELAS")

        // Temukan TextView dan atur teksnya
        val resultView = findViewById<TextView>(R.id.resultView)
        resultView.text = "Nama: $nama\nNIM: $nim\nKelas: $kelas"
    }
}