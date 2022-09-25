package ru.sfedu.aston3kotlin

import android.annotation.SuppressLint
import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import com.bumptech.glide.Glide
import com.bumptech.glide.load.DataSource
import com.bumptech.glide.load.engine.GlideException
import com.bumptech.glide.request.RequestListener
import com.bumptech.glide.request.target.Target

class ImageGlide : AppCompatActivity(), TextWatcher {

    lateinit var editText: EditText
    lateinit var imageView: ImageView
    lateinit var url: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lesson_two)

        imageView = findViewById(R.id.image)
        editText = findViewById(R.id.edit_text)
        editText.addTextChangedListener(this)

    }

    fun makeErrorToast() {
        Toast.makeText(this, getString(R.string.toast_error), Toast.LENGTH_SHORT).show()
    }



    fun loadImage() {
        url = editText.text.toString()
        if (url.isNotEmpty()) {
            //Glide.with(this).load(url).into(imageView)

            Glide.with(this).load(url).listener(object : RequestListener<Drawable> {
                override fun onLoadFailed(
                    e: GlideException?,
                    model: Any?,
                    target: Target<Drawable>?,
                    isFirstResource: Boolean): Boolean {
                    makeErrorToast()
                    return false
                }

                override fun onResourceReady(
                    resource: Drawable?,
                    model: Any?,
                    target: Target<Drawable>?,
                    dataSource: DataSource?,
                    isFirstResource: Boolean
                ): Boolean {
                    return false
                }
            }).into(imageView)
        }
    }

    override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

    }

    override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

    }

    override fun afterTextChanged(p0: Editable?) {
        loadImage()
    }
}