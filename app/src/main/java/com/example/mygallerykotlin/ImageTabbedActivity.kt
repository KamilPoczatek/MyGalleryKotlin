package com.example.mygallerykotlin

import android.support.design.widget.TabLayout
import android.support.v4.view.ViewPager
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class ImageTabbedActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_tabbed)

        val images = ImageGenerator().generateImages()

        val tabAdapter = MyImageTabbedAdapter(supportFragmentManager, images)
        val viewPager = findViewById<ViewPager>(R.id.viewPager)
        val tabLayout = findViewById<TabLayout>(R.id.tabLayout)
        val selectedImage = intent.getIntExtra("imageSelected", 0)

        viewPager.adapter = tabAdapter
        viewPager.currentItem = selectedImage
        tabLayout.setupWithViewPager(viewPager)
    }
}