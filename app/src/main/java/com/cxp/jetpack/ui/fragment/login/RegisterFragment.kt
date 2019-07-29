package com.cxp.jetpack.ui.fragment.login

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.cxp.jetpack.R
import kotlinx.android.synthetic.main.fragment_register.*

/**
 * 文 件 名: RegisterFragment
 * 创 建 人: CXP
 * 创建日期: 2019-07-29 10:07
 * 描    述:
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
class RegisterFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_register, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initView()
    }

    private fun initView() {
        initData()

        btn_register.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("name", "Register_CXP")
            findNavController().navigate(R.id.login, bundle, null)
        }
    }

    private fun initData() {
        // SafeArgs的使用
        val safeArgs: RegisterFragmentArgs by navArgs()
        val email = safeArgs.email
        register_tv.text = email
    }
}