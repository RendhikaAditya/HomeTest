package com.rendhika.hometest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import com.google.android.material.tabs.TabLayout
import com.rendhika.hometest.adapter.MainMenuAdapter
import com.rendhika.hometest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)

        binding.tabLayout.addTab(binding.tabLayout.newTab().setText("Imbal Hasil"))
        binding.tabLayout.addTab(binding.tabLayout.newTab().setText("Dana Kelolaan"))

        binding.tabLayout.tabGravity = TabLayout.GRAVITY_FILL
        val adapter = MainMenuAdapter(this, supportFragmentManager,
            binding.tabLayout.tabCount)
        binding.viewPager.adapter = adapter
        binding.viewPager.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(binding.tabLayout))
        binding.tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab) {
                binding.viewPager.currentItem = tab.position
            }
            override fun onTabUnselected(tab: TabLayout.Tab) {}
            override fun onTabReselected(tab: TabLayout.Tab) {}
        })
    }
}



