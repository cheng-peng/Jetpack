package com.cxp.jetpack.ui.fragment.login

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.cxp.jetpack.R
import com.cxp.jetpack.ui.activity.MainActivity
import kotlinx.android.synthetic.main.fragment_login.*

/**
 * 文 件 名: LoginFragment
 * 创 建 人: CXP
 * 创建日期: 2019-07-29 10:07
 * 描    述:
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
class LoginFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initView()
    }

    private fun initView() {
        val name = arguments?.getString("name")
        login_tv.text = name

        btn_login.setOnClickListener {
            val intent = Intent(context, MainActivity::class.java)
            context!!.startActivity(intent)
        }
    }
}