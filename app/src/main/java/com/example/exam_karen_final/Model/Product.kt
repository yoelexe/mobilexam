package com.example.exam_karen_final.Model

var productList = mutableListOf<Product>()

class Product {

    var cover: Int? = null
    var title_detail: String? = null
    var detail_description: String? = null
    val id: Int? = productList.size
}