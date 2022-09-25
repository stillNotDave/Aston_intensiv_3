package ru.sfedu.aston3kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.squareup.picasso.Picasso

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonLessonOne = findViewById<Button>(R.id.lesson_1)
        buttonLessonOne.setOnClickListener(){
            val intent = Intent(this, LessonOne::class.java)
            startActivity(intent)
        }
        val buttonGlide = findViewById<Button>(R.id.glide)
        buttonGlide.setOnClickListener{
            val intent = Intent(this, ImageGlide::class.java)
            startActivity(intent)
        }
        val buttonPicasso = findViewById<Button>(R.id.picasso)
        buttonPicasso.setOnClickListener{
            val intent = Intent(this, ImagePicasso::class.java)
            startActivity(intent)
        }
    }
}