package com.thudlm.vegetarianres.dependencies.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(
    tableName = "product", foreignKeys = [
        ForeignKey(
            entity = Category::class,
            parentColumns = arrayOf("id"),
            childColumns = arrayOf("category_id"),
            onDelete = ForeignKey.CASCADE
        )
    ]
)
class Product {

    @PrimaryKey(autoGenerate = true)
    var id: Long = 0

    @ColumnInfo(name = "name")
    var name: String? = null

    @ColumnInfo(name = "category_id")
    var categoryId: Int? = null

    @ColumnInfo(name = "thumbnail")
    var thumbnail: String? = null

    @ColumnInfo(name = "price")
    var price: Double = ((1 until 99).random()).toDouble()

    @ColumnInfo(name = "weight")
    var weight: Int = (1 until 9).random() * 100

    @ColumnInfo(name = "description")
    var description: String? = "Very delicious"

    @ColumnInfo(name = "ingredients")
    var ingredients: String? = "Blah blah blah blah blah"

    @ColumnInfo(name = "calories")
    var calories: Int = (10 until 50).random() * 10

    @ColumnInfo(name = "protein")
    var protein: Int = (1 until 10).random() * 10

    @ColumnInfo(name = "total_fat")
    var totalFat: Int = (5 until 50).random()

    @ColumnInfo(name = "total_carbs")
    var totalCarbs: Int = (1 until 10).random() * 10

    @ColumnInfo(name = "total_time")
    var totalTime: Int = (2 until 5).random() * 10

    @ColumnInfo(name = "total_people")
    var totalPeople: Int = (1 until 4).random()

}