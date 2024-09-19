package com.felisha.a5sep2024.model

import com.felisha.a5sep2024.R

data class ModelBuah(
    val image: Int,
    val judul : String
)

//kita bikin array
object Mocklist{
    fun getModel(): List<ModelBuah> {
        val item1 = ModelBuah(
            R.drawable.apple,
            "Apel"
        )
        val item2 = ModelBuah(
            R.drawable.grapes,
            "Anggur"
        )
        val item3 = ModelBuah(
            R.drawable.orange,
            "Jeruk"
        )
        val item4 = ModelBuah(
            R.drawable.pear,
            "Per"
        )
        val item5 = ModelBuah(
            R.drawable.strawberry,
            "Strowberry"
        )
        val item6 = ModelBuah(
            R.drawable.apple,
            "Apel"
        )

        val itemList: ArrayList<ModelBuah> = ArrayList()
        itemList.add(item1)
        itemList.add(item2)
        itemList.add(item3)
        itemList.add(item4)
        itemList.add(item5)
        itemList.add(item6)
        return itemList

    }
}