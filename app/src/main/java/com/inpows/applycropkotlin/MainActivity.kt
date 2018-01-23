package com.inpows.applycropkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    val dev = Person(null, null, null)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        val person = dev.apply {
            nama = "Inpows"
            umur = 23
            jeniskelamin = "Laki-Laki"
        }
        val person2 = dev.copy(nama = "Inpows 2", umur = 22)

        println("Person 1 : $person \nPerson 2 : $person2")
    }

    data class Person (
            var nama:String?,
            var umur:Int?,
            var jeniskelamin :String?
    )

}
