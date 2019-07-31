package com.cxp.jetpack.db.data

import android.location.Address
import androidx.room.*

/**
 * 文 件 名: User
 * 创 建 人: CXP
 * 创建日期: 2019-07-30 16:09
 * 描    述: 用户表
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
@Entity(tableName = "user")
data class User(
    @ColumnInfo(name = "user_account") val account: String // 账号
    , @ColumnInfo(name = "user_pwd") val pwd: String // 密码
    , @ColumnInfo(name = "user_name") val name: String
    , @Embedded val address: Address // 地址
    , @Ignore val state: Int // 状态只是临时用，所以不需要存储在数据库中
) {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    var id: Long = 0
}