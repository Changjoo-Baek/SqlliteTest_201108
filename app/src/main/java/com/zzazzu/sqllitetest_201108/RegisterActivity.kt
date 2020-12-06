package com.zzazzu.sqllitetest_201108

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        var dbHelper: DBHelper = DBHelper(applicationContext, "MEMBER.db", null,1)

        save_Btn.setOnClickListener

    }
}