package com.nexon.signupexample_0408

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_my_page.*

class MyPageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_page)
        val name = intent.getStringExtra("userName")
//       Int형은 null을 대비해서 defaultValue를 하나더 추가해야 값을 가져올 수 있음
        val age = intent.getIntExtra("userAge", -1)
        userName.text = "${name} : ${age}세"
    }
}
