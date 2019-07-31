package com.cxp.jetpack.db.data

import androidx.room.*
import java.util.*

/**
 * 文 件 名: FavouriteShoe
 * 创 建 人: CXP
 * 创建日期: 2019-07-30 16:12
 * 描    述:
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
@Entity(
    tableName = "fav_shoe"
    , foreignKeys = [ForeignKey(entity = Shoe::class, parentColumns = ["id"], childColumns = ["shoe_id"])
        , ForeignKey(entity = User::class, parentColumns = ["id"], childColumns = ["user_id"])
    ], indices = [Index("shoe_id")]
)
data class FavouriteShoe(
    @ColumnInfo(name = "shoe_id") val shoeId: Long // 外键 鞋子的id
    , @ColumnInfo(name = "user_id") val userId: Long // 外键 用户的id
    , @ColumnInfo(name = "fav_date") val date: Date // 创建日期

) {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    var id: Long = 0
}