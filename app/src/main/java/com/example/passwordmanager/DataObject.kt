package com.example.passwordmanager

import kotlinx.android.synthetic.main.view.view.*


object DataObject {
    var listdata = mutableListOf<CardInfo>()

    fun setData(title: String, password: String) {
        listdata.add(CardInfo(title, password))
    }

    fun getAllData(): List<CardInfo> {
        return listdata
    }

    fun deleteAll(){
        listdata.clear()
    }

    fun getData(pos:Int): CardInfo {
        return listdata[pos]
    }

    fun deleteData(pos:Int){
        listdata.removeAt(pos)
    }

    fun updateData(pos:Int,title:String,password:String)
    {
        listdata[pos].title=title
        listdata[pos].password=password
    }

}