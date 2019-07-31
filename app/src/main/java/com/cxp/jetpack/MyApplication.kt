package com.cxp.jetpack

import android.app.Application
import com.facebook.stetho.Stetho

/**
 * 文 件 名: MyApplication
 * 创 建 人: CXP
 * 创建日期: 2019-07-31 9:31
 * 描    述:
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
class MyApplication:Application() {

    override fun onCreate() {
        super.onCreate()

        //谷歌调试工具
        Stetho.initializeWithDefaults(this)
    }
}