package com.example.tests

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        if(savedInstanceState == null){
            supportFragmentManager.beginTransaction()
                .replace(R.id.main_container_for_fragments, FirstFragment())
                .commit()
        }

//        var mojeCiastka = mutableListOf(
//            "W-Z",
//            "Kremówka",
//            "Pączek z nadzieniem pistacjowym"
//        )
//
//        val myList =findViewById<ListView>(R.id.mojalista)
//        val mojeCele = resources.getStringArray(R.array.mojecele)
//        var arrayAdapter = ArrayAdapter(this,
//            android.R.layout.simple_list_item_1,
//            mojeCele
//            )
//        var arrayAdapterCiatka = ArrayAdapter(this,
//            android.R.layout.simple_list_item_1,
//            mojeCiastka
//        )
//        //myList.adapter=arrayAdapter
//        myList.adapter=arrayAdapterCiatka
    }
}