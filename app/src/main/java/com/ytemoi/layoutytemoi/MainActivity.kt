package com.ytemoi.layoutytemoi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_dangnhap.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dangnhap)

        btndangnhap.setOnClickListener {
            lldangnhap.visibility = View.GONE;
            llotp.visibility = View.VISIBLE;
        }
        btnxacthuc.setOnClickListener {
            lldangnhap.visibility = View.VISIBLE;
            llotp.visibility = View.GONE;
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
    }
}