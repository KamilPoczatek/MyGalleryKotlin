package com.example.mygallerykotlin

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class MyImageListAdapter constructor(
    private val appContext: Context,
    private val layoutResourceId: Int,
    private val images: Array<ImageEntity>
) : ArrayAdapter<ImageEntity>(appContext, layoutResourceId, images) {

    @SuppressLint("ViewHolder")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val inflater = (appContext as Activity).layoutInflater
        val currentView = inflater.inflate(layoutResourceId, parent, false)
        val image = images[position]

        (currentView.findViewById<View>(R.id.textViewTitle) as TextView).text = image.title
        (currentView.findViewById<View>(R.id.textViewAuthor) as TextView).text = image.author
        (currentView.findViewById<View>(R.id.textViewPlace) as TextView).text = image.place
        (currentView.findViewById<View>(R.id.textViewDescription) as TextView).text = image.description
        (currentView.findViewById<View>(R.id.imageView) as ImageView).setImageResource(image.image)

        return currentView
    }
}