package com.example.flowerkotlin


import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
import com.example.flowerkotlin.R.id.my_list_view
import java.util.ArrayList

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myListView = findViewById<View>(my_list_view) as ListView
        val layoutID = R.layout.row_view
        val myStringArray = ArrayList<String>()
        val myAdapterInstance: ArrayAdapter<String> = ArrayAdapter(this, layoutID, myStringArray)
        myListView.adapter = myAdapterInstance
        val myClassesArray = ArrayList<MyClass>()
        myClassesArray.add(MyClass(R.drawable.blue,"Blue flower"))
        myClassesArray.add(MyClass(R.drawable.orange,"Orange Rose"))
        myClassesArray.add(MyClass(R.drawable.purple,"Purple"))
        myClassesArray.add(MyClass(R.drawable.red,"Rose"))
        myClassesArray.add(MyClass(R.drawable.white,"Tulip"))

        val myArrayAdapter = MyArrayAdapter(
            this,
            myClassesArray
        )
        myListView.adapter = myArrayAdapter
    }
}