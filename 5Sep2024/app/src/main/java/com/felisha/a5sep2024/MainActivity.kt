package com.felisha.a5sep2024

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.felisha.a5sep2024.model.ModelMovie

class MainActivity : AppCompatActivity() {
    private lateinit var eUser : EditText
    private lateinit var ePassword : EditText
    private lateinit var btnLogin : Button
    private lateinit var btnList : Button
    private lateinit var btnRecycle : Button
    private lateinit var btnRecycleBuah : Button
    private lateinit var btnMovie: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        eUser = findViewById(R.id.eUser)
        ePassword = findViewById(R.id.ePassword)
        btnLogin = findViewById(R.id.btnLogin)
        btnList = findViewById(R.id.btnList)
        btnRecycle = findViewById(R.id.btnRecycle)
        btnRecycleBuah = findViewById(R.id.btnRecycleBuah)
        btnMovie = findViewById(R.id.btnRecycleMovie)

        btnLogin.setOnClickListener(){
            val nUsername = eUser.text.toString()
            val nPassword = ePassword.text.toString()

            val intentPassingData = Intent(this@MainActivity,WelcomPage::class.java)

            intentPassingData.putExtra("username", nUsername)
            intentPassingData.putExtra("password", nPassword)

            Log.d("cek data username", nUsername)
            Log.d("cek data password", nPassword)
            startActivity(intentPassingData)

        }

        btnList.setOnClickListener{
            val intent = Intent(this@MainActivity, ListView::class.java)
            startActivity(intent)
        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btnRecycle.setOnClickListener() {
            //intent --> pindah dari satu activity ke activity lain
            //intent implicit : pindah yg ada project
            //intent expilicit : pindah keluar app dan manggil apps lain
            val intentMenu2 = Intent(
                this@MainActivity,
                RecycleView::class.java
            )
            startActivity(intentMenu2)
        }

        btnRecycleBuah.setOnClickListener() {
            //intent --> pindah dari satu activity ke activity lain
            //intent implicit : pindah yg ada project
            //intent expilicit : pindah keluar app dan manggil apps lain
            val intentMenu2 = Intent(
                this@MainActivity, RecycleBuah::class.java
            )
            startActivity(intentMenu2)
        }

        btnMovie.setOnClickListener() {
            //intent --> pindah dari satu activity ke activity lain
            //intent implicit : pindah yg ada project
            //intent expilicit : pindah keluar app dan manggil apps lain
            val intentMenu2 = Intent(
                this@MainActivity, MovieActivity::class.java
            )
            startActivity(intentMenu2)
        }
    }
}