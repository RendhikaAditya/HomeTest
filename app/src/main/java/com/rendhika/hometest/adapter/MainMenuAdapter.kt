package com.rendhika.hometest.adapter

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.rendhika.hometest.fragment.DanaKelolaanFragment
import com.rendhika.hometest.fragment.ImbalHasilFragment

@Suppress("DEPRECATION")
internal class MainMenuAdapter(
    var context: Context,
    fm: FragmentManager,
    var totalTabs: Int
) :
    FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> {
                ImbalHasilFragment()
            }
            1 -> {
                DanaKelolaanFragment()
            }
            else -> getItem(position)
        }
    }
    override fun getCount(): Int {
        return totalTabs
    }
}