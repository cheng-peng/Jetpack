package com.cxp.jetpack

import android.content.Context
import android.content.Intent
import android.widget.Toast
import androidx.databinding.ObservableField

/**
 * 文 件 名: LoginModel
 * 创 建 人: CXP
 * 创建日期: 2019-07-29 17:39
 * 描    述:
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
class LoginModel constructor(name:String,pwd:String,context: Context) {
    val n=ObservableField<String>(name)
    val p=ObservableField<String>(pwd)
    val context:Context=context

    /**
     * 用户名改变回调的函数
     */
    fun onNameChanged(s: CharSequence) {
        n.set(s.toString())
    }

    /**
     * 密码改变的回调函数
     */
    fun onPwdChanged(s: CharSequence, start: Int, before: Int, count: Int) {
        p.set(s.toString())
    }

    fun login() {
        if (n.get().equals("CXP")
            && p.get().equals("123456")
        ) {
            Toast.makeText(context, "账号密码正确", Toast.LENGTH_SHORT).show()
            val intent = Intent(context, MainActivity::class.java)
            context.startActivity(intent)
        }
    }


}