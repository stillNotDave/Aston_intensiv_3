package ru.sfedu.aston3kotlin

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageView

class ImageLoader : AppCompatActivity() {

    lateinit var editText: EditText
    lateinit var imageView: ImageView
    lateinit var url: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lesson_two)

        imageView = findViewById(R.id.image)
        editText = findViewById(R.id.edit_text)

        url = editText.text.toString()
        //ImageView = BitmapFactory.decodeStream(url.openConnection().getInputStream());

    }
}