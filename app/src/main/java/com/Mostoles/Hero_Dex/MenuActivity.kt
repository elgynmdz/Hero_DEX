package com.Mostoles.Hero_Dex

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.Mostoles.Hero_Dex.superheroapp.SuperHeroListActivity



class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        val btnSuperhero = findViewById<Button>(R.id.btnSuperhero)

        btnSuperhero.setOnClickListener { navigateToSuperheroApp() }
    }

    private fun navigateToSuperheroApp(){
        val intent = Intent(this, SuperHeroListActivity::class.java)
        startActivity(intent)
    }
}