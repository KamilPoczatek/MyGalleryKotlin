package com.example.mygallerykotlin

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

class MyImageTabbedFragment : Fragment() {
    internal lateinit var image: ImageEntity

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val currentView = inflater.inflate(R.layout.fragment_image_tabbed, container, false)

        (currentView.findViewById<View>(R.id.textViewTitle2) as TextView).text = image.title
        (currentView.findViewById<View>(R.id.textViewAuthor2) as TextView).text = image.author
        (currentView.findViewById<View>(R.id.textViewPlace2) as TextView).text = image.place
        (currentView.findViewById<View>(R.id.textViewDescription2) as TextView).text = image.description
        (currentView.findViewById<View>(R.id.imageView2) as ImageView).setImageResource(image.image)

        return currentView
    }
}