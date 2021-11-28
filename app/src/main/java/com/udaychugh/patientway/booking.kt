package com.udaychugh.patientway

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.Toast

class booking : AppCompatActivity() {

    lateinit var emergencyhai : ImageView
    lateinit var later : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_booking)

        emergencyhai=findViewById(R.id.em)
        later=findViewById(R.id.ad)

        later.setOnClickListener {
            Toast.makeText(applicationContext, "Advance Booking is not started yet", Toast.LENGTH_SHORT).show()
        }

        emergencyhai.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {
                val intent = Intent(this@booking, emergency::class.java)
                startActivity(intent)
            }
        })

    }
}