package com.example.mygallerykotlin

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter

import java.util.ArrayList

class MyImageTabbedAdapter constructor(
    fragmentManager: FragmentManager,
    images: Array<ImageEntity>
) : FragmentStatePagerAdapter(fragmentManager) {
    private val mFragmentList = ArrayList<Fragment>()

    init {
        for (image in images) {
            mFragmentList.add(createFragment(image))
        }
    }

    private fun createFragment(image: ImageEntity): MyImageTabbedFragment {
        val fragment = MyImageTabbedFragment()
        fragment.image = image
        return fragment
    }

    override fun getItem(position: Int): Fragment {
        return mFragmentList[position]
    }

    override fun getCount(): Int {
        return mFragmentList.size
    }
}