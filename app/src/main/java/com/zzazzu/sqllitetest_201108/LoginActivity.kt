package com.zzazzu.sqllitetest_201108

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        back_Btn.setOnClickListener {
            startActivity<MainActivity>()
        }
        list_Btn.setOnClickListener {
            startActivity<MemberList>()
        }

        register1_Btn.setOnClickListener {
            startActivity<RegisterActivity>()
        }

        delete_Btn.setOnClickListener {
            startActivity<RemoveMember>()
        }

        change_Btn.setOnClickListener {
            startActivity<ChangeMember>()
        }
    }
}