package com.nexon.signupexample_0408

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_edit_name.*

class EditNameActivity : AppCompatActivity() {
//   요청코드는 원래 숫자로 적지만, 숫자만 적으면 나중에 구분이 어렵기때문에 보통 이유를 멤버 변수로 만들어서
//   startActivityForResult 함수에 사용함, 코드에 넣을 숫자는 고유해야 함
    val REQ_FOR_ADDRESS = 1000

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

        inputAddressBtn.setOnClickListener {
            val myIntent2 = Intent(this,EditAddressActivity::class.java)
            startActivityForResult(myIntent2, REQ_FOR_ADDRESS)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
//      인텐트 요청 코드가 내가 셋팅한 것과 일치하는지 확인
        if ( requestCode == REQ_FOR_ADDRESS) {
//       해당 코드의 결과값도 정상(RESULT_OK)라면
            if (resultCode == Activity.RESULT_OK) {
                val mainAddress = data?.getStringArrayExtra("mainAddress")
                val detailAddress = data?.getStringArrayExtra("detailAddress")

                addressText.text = "${mainAddress} / ${detailAddress}"
            }
        }
    }
}
