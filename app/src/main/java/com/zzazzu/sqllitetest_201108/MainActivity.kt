package com.zzazzu.sqllitetest_201108

import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.toast

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