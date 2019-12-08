package com.example.mygallerykotlin

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.AdapterView
import android.widget.ListView

class ImageListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_list)

        val images = ImageGenerator().generateImages()

        val myImageListAdapter = MyImageListAdapter(this, R.layout.fragment_image_list, images)
        val listView = findViewById<ListView>(R.id.imagesList)

        listView.adapter = myImageListAdapter

        listView.onItemClickListener = AdapterView.OnItemClickListener { _, _, position, _ ->
            val intent = Intent(applicationContext, ImageTabbedActivity::class.java)
            intent.putExtra("imageSelected", position)
            startActivity(intent)
        }
    }
}
