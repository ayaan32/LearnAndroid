package com.example.flowerkotlin

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class MyArrayAdapter(private val context: Context, private val arrayList: java.util.ArrayList<MyClass>) : BaseAdapter() {
    private lateinit var name: TextView
    private lateinit var image: ImageView
    override fun getCount(): Int {
        return arrayList.size
    }
    override fun getItem(position: Int): Any {
        return position
    }
    override fun getItemId(position: Int): Long {
        return position.toLong()
    }
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View? {
        var convertView = convertView
        convertView = LayoutInflater.from(context).inflate(R.layout.row_view, parent, false)
        name = convertView.findViewById(R.id.TextView1)
        image = convertView.findViewById(R.id.image1)
        name.text = arrayList[position].name
        image.setImageResource(arrayList[position].image)
        return convertView
    }
}