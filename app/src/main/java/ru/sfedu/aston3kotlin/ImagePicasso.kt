package ru.sfedu.aston3kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import com.squareup.picasso.Callback
import com.squareup.picasso.Picasso
import java.lang.Exception

class ImagePicasso : AppCompatActivity(), TextWatcher {

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

    fun loadImage(){
        url = editText.text.toString()
        if(url.isNotEmpty()){
            Picasso.get().load(url).into(imageView,object : Callback{
                override fun onSuccess() {

                }

                override fun onError(e: Exception?) {
                    makeErrorToast()
                }
            })
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