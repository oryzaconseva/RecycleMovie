package com.felisha.a5sep2024

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.felisha.a5sep2024.adapter.BukuAdapter
import com.felisha.a5sep2024.model.ModelBuku

private lateinit var rev_data : RecyclerView
class RecycleView : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_recycle_view)
        rev_data = findViewById(R.id.rv_data)

        val listBuku = listOf(
            ModelBuku(judul = "Buku Android 1 20204", penulis = "Oryza Conseva"),
            ModelBuku(judul = "Buku Android 2 20204", penulis = "Oryza Conseva"),
            ModelBuku(judul = "Buku Android 3 20204", penulis = "Oryza Conseva"),
            ModelBuku(judul = "Buku Android 4 20204", penulis = "Oryza Conseva"),
            ModelBuku(judul = "Buku Android 5 20204", penulis = "Oryza Conseva"),
            ModelBuku(judul = "Buku Android 6 20204", penulis = "Oryza Conseva"),
            ModelBuku(judul = "Buku Android 7 20204", penulis = "Oryza Conseva"),
        )

        //baru kita set adapter
        val nBukuAdapter = BukuAdapter(listBuku)
        rev_data.apply {
            layoutManager = LinearLayoutManager(this@RecycleView)
            adapter = nBukuAdapter
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}