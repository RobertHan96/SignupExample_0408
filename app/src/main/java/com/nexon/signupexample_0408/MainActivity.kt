package com.nexon.signupexample_0408

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nextBtn.setOnClickListener {
//            Intent함수로 하나의 화면을 객체하함, 출발점(this/self), 도착점
            val myIntent = Intent(this, MyPageActivity::class.java)
            startActivity(myIntent)
        }

    }
}
