package com.udaychugh.patientway

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RelativeLayout

class getstarted : AppCompatActivity() {

    lateinit var getstart : RelativeLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_getstarted)

        getstart=findViewById(R.id.get_started)

        getstart.setOnClickListener {
            val intent =Intent(this, login::class.java)
            startActivity(intent)
        }

    }
}