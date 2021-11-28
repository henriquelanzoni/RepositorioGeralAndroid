package com.example.aplicationtestinglayout

import android.content.Intent
import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Gradiente mudando de cor
        val constraintLayout: ConstraintLayout = findViewById(R.id.primeiroBack)
        var animationDraw: AnimationDrawable = constraintLayout.background as AnimationDrawable
        animationDraw.setEnterFadeDuration(2500)
        animationDraw.setExitFadeDuration(5000)
        animationDraw.start()
        // Gradiente mudando de cor


        val viewFirstScreen: View = findViewById(R.id.LoginButton)
        val intent = Intent(this, CenterMenu::class.java)

        viewFirstScreen.setOnClickListener{

            startActivity(intent)

        }

    }
}