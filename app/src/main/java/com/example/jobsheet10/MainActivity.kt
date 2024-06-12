package com.example.jobsheet10

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val namaEdit = findViewById<EditText>(R.id.namaEdit)
        val nimEdit = findViewById<EditText>(R.id.nimEdit)
        val kelasEdit = findViewById<EditText>(R.id.kelasEdit)
        val submitBtn = findViewById<Button>(R.id.submitBtn)

        submitBtn.setOnClickListener {
            // Ambil teks dari EditText
            val nama = namaEdit.text.toString()
            val nim = nimEdit.text.toString()
            val kelas = kelasEdit.text.toString()

            // Buat Intent dan masukkan data
            val intent = Intent(this, ResultActivity::class.java).apply {
                putExtra("NAMA", nama)
                putExtra("NIM", nim)
                putExtra("KELAS", kelas)
            }

            // Mulai ResultActivity
            startActivity(intent)
        }
    }
}