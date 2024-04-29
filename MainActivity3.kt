package com.example.myassignment2

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AlphaAnimation
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView

class MainActivity3 : AppCompatActivity() {
    private var petHealth = 100
    private var petHunger = 25
    private var petCleanliness = 45

    @SuppressLint("WrongViewCast", "CutPasteId", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        // GET THE BUTTONS AND TEXT VIEWS
        val btnFeed = findViewById<Button>(R.id.btnFeed)
        val btnClean = findViewById<Button>(R.id.btnClean)
        val btnPlay = findViewById<Button>(R.id.btnPlay)
        val txtHunger = findViewById<EditText>(R.id.txtHunger)
        val txtClean = findViewById<EditText>(R.id.txtClean)
        val txtPlay = findViewById<EditText>(R.id.txtPlay)
        val petImage = findViewById<ImageView>(R.id.petImage)

        //SET THE INITIAL TEXT VALUES
        txtHunger.setText(petHunger.toString())
        txtClean.setText(petCleanliness.toString())
        txtPlay.setText(petHealth.toString())

        // HANDLE BUTTON CLICKS
        btnFeed.setOnClickListener {
            petHunger -= 10
            petCleanliness += 25
            petHealth += 15
            txtHunger.setText(petHunger.toString())
            animateImagechange(petImage, R.drawable.eat_eating_icon)
        }

        btnClean.setOnClickListener {
            petHealth += 15
            petCleanliness += 25

            txtClean.setText(petCleanliness.toString())
            animateImagechange(petImage, R.drawable.dog_cleaning_icon)
        }

        btnPlay.setOnClickListener {
            petHealth += 25
            petCleanliness -= 10
            petHunger -= 5
            txtPlay.setText(petHealth.toString())
            animateImagechange(petImage, R.drawable.happy_dog_icon)
        }
    }

    private fun animateImagechange(imageView: ImageView, newImageResources: Int) {
        val animation = AlphaAnimation(0.0f, 1.0f)
        animation.duration = 500
        animation.fillAfter = true
        imageView.startAnimation(animation)
        imageView.setImageResource(newImageResources)
    }
}