package com.ytemoi.layoutytemoi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import kotlinx.android.synthetic.main.activity_sukien.*

class MainActivity2 : AppCompatActivity() {
    private lateinit var adpter:Item_Sukien_Adapter
    private lateinit var data:ArrayList<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sukien)
        data = ArrayList()
        var grlayout = GridLayoutManager(this , 2)
        rc_data_item_sukien.layoutManager = grlayout
        for ( i in 0..10){
            data.add("")
        }
        adpter = Item_Sukien_Adapter(data)
        rc_data_item_sukien.adapter = adpter
    }
}