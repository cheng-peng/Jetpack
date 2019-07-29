package com.cxp.jetpack.ui.fragment.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.cxp.jetpack.R

/**
 * 文 件 名: MeFragment
 * 创 建 人: CXP
 * 创建日期: 2019-07-29 15:10
 * 描    述:
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
class MeFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_me, container, false)
    }

}