package com.nexon.signupexample_0408

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_edit_address.*

class EditAddressActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_address)

        okBtn.setOnClickListener {
//       주소 입력을 완료함을 의미함, 이전 화면으로 돌아가면서 주소 데이터를 반환해야 함
//       데이터 반환용 인텐트는 출발지, 도착지를 함수에 적지않아도 됨
            val resultIntent = Intent()
            resultIntent.putExtra("mainAddress", mainAddressEdit.text.toString())
            resultIntent.putExtra("detailAddress", detailAddressEdit.text.toString())
            
//          위에서 가공한 데이터를 이전 화면으로 돌리기 위한 setResult함수 (입력완료를 의미하는 RESULT_OK 호출)
            setResult(Activity.RESULT_OK, resultIntent)
//          finish를 통해 이전화면으로 이동함
            finish()

        }
        
        
    }
}
