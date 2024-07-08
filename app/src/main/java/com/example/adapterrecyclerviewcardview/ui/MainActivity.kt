package com.example.adapterrecyclerviewcardview.ui

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.adapterrecyclerviewcardview.R
import com.example.adapterrecyclerviewcardview.databinding.ActivityMainBinding
import com.example.adapterrecyclerviewcardview.fragment.GridLayoutHorizontalFragment
import com.example.adapterrecyclerviewcardview.fragment.GridLayoutVerticalFragment
import com.example.adapterrecyclerviewcardview.fragment.LinearLayoutHorizontalFragment
import com.example.adapterrecyclerviewcardview.fragment.LinearLayoutVerticalFragment
import nl.joery.animatedbottombar.AnimatedBottomBar


class MainActivity : AppCompatActivity() {


    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)



        binding.bottomNavigationView.setOnTabSelectListener(object : AnimatedBottomBar.OnTabSelectListener {
            override fun onTabSelected(
                lastIndex: Int,
                lastTab: AnimatedBottomBar.Tab?,
                newIndex: Int,
                newTab: AnimatedBottomBar.Tab
            ) {
                when (newTab.id) {
                    R.id.tabGridH -> replaceFragment(GridLayoutHorizontalFragment())
                    R.id.tabGridV -> replaceFragment(GridLayoutVerticalFragment())
                    R.id.tabLinearH -> replaceFragment(LinearLayoutHorizontalFragment())
                    R.id.tabLinearV -> replaceFragment(LinearLayoutVerticalFragment())
                }
            }
        })

        replaceFragment(GridLayoutHorizontalFragment())
    }


    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().replace(R.id.frameLayout, fragment).commit()
    }
}
