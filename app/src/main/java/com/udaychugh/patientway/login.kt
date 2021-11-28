package com.udaychugh.patientway

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import android.widget.RelativeLayout

class login : AppCompatActivity() {

    lateinit var getotp : RelativeLayout
    lateinit var enterotp : LinearLayout
    lateinit var login: RelativeLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        getotp=findViewById(R.id.next)
        enterotp=findViewById(R.id.enterotp)
        login=findViewById(R.id.login)

        getotp.setOnClickListener {
            enterotp.visibility = View.VISIBLE
            login.visibility = View.VISIBLE
            getotp.visibility = View.INVISIBLE
        }

        login.setOnClickListener {
            val intent = Intent(this, booking::class.java)
            startActivity(intent)
            finish()
        }

    }
}