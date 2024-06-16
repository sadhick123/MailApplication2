@

import com.sadhick.mailapplication2.R

-0,0 +1,40 @@
package com.rohit.tenth_application

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    var emailme : Button? = null
    var sms : Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        emailme = findViewById(R.id.emailme)
        sms = findViewById(R.id.sms)
        emailme?.setOnClickListener(){

            val intent = Intent(Intent.ACTION_SENDTO)
            intent.setData(Uri.parse("mailto:"))
            intent.putExtra(Intent.EXTRA_EMAIL , arrayOf("pylarohit123@gmail.com"))
            intent.putExtra(Intent.EXTRA_SUBJECT,"Code For Email")
            intent.putExtra(Intent.EXTRA_TEXT,"Hello This code is working")
            startActivities(arrayOf(intent))

        }

        sms?.setOnClickListener()
        {
            val intent = Intent(Intent.ACTION_SENDTO)
            intent.setData(Uri.parse("smsto:8309071173"))
            intent.putExtra("sms_body","hello")
            startActivities(arrayOf(intent))
        }
    }
}