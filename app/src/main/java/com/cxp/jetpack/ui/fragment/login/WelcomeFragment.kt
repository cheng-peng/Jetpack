package com.cxp.jetpack.ui.fragment.login

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.navOptions
import com.cxp.jetpack.R
import kotlinx.android.synthetic.main.fragment_welcome.*

/**
 * 文 件 名: WelcomeFragment
 * 创 建 人: CXP
 * 创建日期: 2019-07-29 10:08
 * 描    述:
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
class WelcomeFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_welcome, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        welcome_login.setOnClickListener {
            // 设置动画参数
            val navOption = navOptions {
                anim {
                    enter = R.anim.common_slide_in_right
                    exit = R.anim.common_slide_out_left
                    popEnter = R.anim.common_slide_in_left
                    popExit = R.anim.common_slide_out_right
                }
            }

            // Navigation 传递参数
            val bundle = Bundle()
            bundle.putString("name","CXP")
            findNavController().navigate(R.id.login, bundle,navOption)
        }

        welcome_register.setOnClickListener {
            // 利用SafeArgs传递参数
            val action = WelcomeFragmentDirections
                    .actionWelcomeToRegisterFragment()
                    .setEMAIL("978515743@qq.com")
            findNavController().navigate(action)
        }
    }
}