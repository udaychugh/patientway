package com.udaychugh.patientway

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout

class payments : AppCompatActivity() {

    lateinit var paylater : LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payments)

        paylater=findViewById(R.id.paylater)

        paylater.setOnClickListener {
            val intent =Intent(this, driverinfo::class.java)
            startActivity(intent)
            finish()
        }
    }
}