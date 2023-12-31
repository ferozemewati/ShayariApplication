package com.example.shayariapp

class AppRepository private constructor(){

    val list = SimpleData.data

    companion object{
        var instant = AppRepository()
    }
}