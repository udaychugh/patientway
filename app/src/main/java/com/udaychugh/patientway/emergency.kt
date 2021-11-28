package com.udaychugh.patientway

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class emergency : AppCompatActivity() {

    lateinit var getcurentlocation : RelativeLayout
    lateinit var pickvechile : RelativeLayout
    lateinit var confirmbooking : RelativeLayout
    lateinit var locationtext : TextView
    lateinit var confirmtext : TextView
    lateinit var progressbar : ProgressBar
    lateinit var progressbar2 : ProgressBar
    lateinit var type1 : LinearLayout
    lateinit var type2 : LinearLayout
    lateinit var type3 : LinearLayout
    lateinit var type4 : LinearLayout
    lateinit var type5 : LinearLayout
    lateinit var type6 : LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_emergency)

        getcurentlocation=findViewById(R.id.getcurentlocation)
        pickvechile=findViewById(R.id.pickvechile)
        confirmbooking=findViewById(R.id.confirmbooking)
        locationtext=findViewById(R.id.locationtext)
        confirmtext=findViewById(R.id.confirmtext)
        progressbar=findViewById(R.id.progressbar)
        progressbar2=findViewById(R.id.progressbar2)

        type1=findViewById(R.id.type1)
        type2=findViewById(R.id.type2)
        type3=findViewById(R.id.type3)
        type4=findViewById(R.id.type4)
        type5=findViewById(R.id.type5)
        type6=findViewById(R.id.type6)

        getcurentlocation.setOnClickListener {
            locationtext.visibility = View.INVISIBLE
            progressbar.visibility = View.VISIBLE
            Thread.sleep(2000)
            Toast.makeText(applicationContext, "Location Found, Pick Ambulance Now", Toast.LENGTH_SHORT).show()
            pickvechile.visibility = View.VISIBLE
            getcurentlocation.visibility = View.INVISIBLE
        }

        type1.setOnClickListener {
            type1.setBackgroundColor(resources.getColor(R.color.teal_200))
            showconfirmbutton()
        }

        type2.setOnClickListener {
            type2.setBackgroundColor(resources.getColor(R.color.teal_200))
            showconfirmbutton()
        }

        type3.setOnClickListener {
            type3.setBackgroundColor(resources.getColor(R.color.teal_200))
            showconfirmbutton()
        }

        type4.setOnClickListener {
            type4.setBackgroundColor(resources.getColor(R.color.teal_200))
            showconfirmbutton()
        }

        type5.setOnClickListener {
            type5.setBackgroundColor(resources.getColor(R.color.teal_200))
            showconfirmbutton()
        }

        type6.setOnClickListener {
            type6.setBackgroundColor(resources.getColor(R.color.teal_200))
            showconfirmbutton()
        }

        confirmbooking.setOnClickListener {
            confirmtext.visibility = View.INVISIBLE
            progressbar2.visibility = View.VISIBLE
            Thread.sleep(2000)
            val intent = Intent(this, payments::class.java)
            startActivity(intent)
        }






    }

    private fun showconfirmbutton() {
        confirmbooking.visibility = View.VISIBLE
    }
}