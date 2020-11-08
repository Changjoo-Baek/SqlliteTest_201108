package com.zzazzu.sqllitetest_201108

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var dbHelper: DBHelper = DBHelper(applicationContext, "MEMBER.db", null, 1)

        login_Btn.setOnClickListener {
            if(dbHelper.getResult1(editText.getText().toString(), editText2.getText().toString()) == true){
                toast("로그인 성공")
                startActivity<LoginActivity>()
            }else{
                toast("로그인 실패")
            }
        }


        register_Btn.setOnClickListener {
            startActivity<RegisterActivity>()
        }


    }
}