package com.cxp.jetpack.db.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * 文 件 名: Shoe
 * 创 建 人: CXP
 * 创建日期: 2019-07-31 9:34
 * 描    述: 鞋表
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
@Entity(tableName = "shoe")
data class Shoe(
    @ColumnInfo(name = "shoe_name") val name: String // 鞋名
    , @ColumnInfo(name = "shoe_description") val description: String// 描述
    , @ColumnInfo(name = "shoe_price") val price: Float // 价格
    , @ColumnInfo(name = "shoe_brand") val brand: String // 品牌
    , @ColumnInfo(name = "shoe_imgUrl") val imageUrl: String // 图片地址
) {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    var id: Long = 0
}