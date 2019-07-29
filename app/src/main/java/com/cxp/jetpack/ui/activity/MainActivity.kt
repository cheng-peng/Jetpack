package com.cxp.jetpack.ui.activity

import android.os.Bundle
import android.widget.Toast
import android.widget.Toast.LENGTH_SHORT
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.cxp.jetpack.R
import kotlinx.android.synthetic.main.activity_main.*

/**
 * 文 件 名: MainActivity
 * 创 建 人: CXP
 * 创建日期: 2019-07-29 10:03
 * 描    述:
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val host: NavHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        val navController = host.navController

        initBottomNavigationView(navController)
    }

    private fun initBottomNavigationView(navController: NavController) {
        btm_nav.setupWithNavController(navController)
        navController.addOnDestinationChangedListener { controller, destination, arguments ->
            when (destination.id) {
                R.id.home -> {
                    Toast.makeText(this,"首页",LENGTH_SHORT).show()
                }
                R.id.favourite-> {
                    Toast.makeText(this,"喜欢",LENGTH_SHORT).show()
                }
                else -> {
                    Toast.makeText(this,"我的",LENGTH_SHORT).show()
                }
            }
        }
    }
}