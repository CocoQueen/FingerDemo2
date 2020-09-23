package com.example.wissdom.fingerdemo

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class Main2Activity : AppCompatActivity() {

    //变量
    var a = 10 //类型声明省略
    var b: Int = 10//显示指定变量类型
    lateinit var name: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val name by lazy { "test" }

        val log = "name:$name"

        ShowToast("")

        max(10, 2)
        setAccount("name", 10)
        setAccount("name", 11, "sex")


        val list = mutableListOf<String>()
        for (index in 0..100) {
            list.add(index, "test" + index)
        }
        Log.log("kfkfk")
    }

    fun max(a: Int, b: Int): Int {
        return if (a > b) a else b
    }

    fun setAccount(name: String, age: Int, sex: String = "sex") {

    }

    fun Context.ShowToast(toastMsg: String): Toast {
        var toast = Toast.makeText(this, toastMsg, Toast.LENGTH_SHORT)
        toast.show()
        return toast
    }
}
