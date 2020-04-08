package com.nexon.signupexample_0408

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_edit_name.*

class EditNameActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_name)
        getUserName.setOnClickListener {
            val inputName = name.text.toString()
            val inputBirthYear = birthYear.text.toString().toInt()

            val newIntent = Intent(this, MyPageActivity::class.java)
            newIntent.putExtra("userName", inputName)
            newIntent.putExtra("userAge", 2020-inputBirthYear+1)
            startActivity(newIntent)
        }
    }
}
