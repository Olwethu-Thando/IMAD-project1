package com.example.imadproject1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

private operator fun String.invoke(value: () -> Unit) {

}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val ageNumber = findViewById<EditText>(R.id.ageNumber)
        val btnGenerate=findViewById<Button>(R.id.btnGenerate)
        val btnClear=findViewById<Button>(R.id.btnClear)
        val txtResult=findViewById<TextView>(R.id.txtResult)
        btnGenerate.setOnClickListener {
            val age =ageNumber.text.toString().toIntOrNull()
            if (age!=null){
                val result=when (age){
                    in 20..29->"Tupac Shakur"
                    in 30..39->"John Keats"
                    in 40..49->"Nelson Mandela"
                    in 50..59->"Babe Ruth "
                    in 60..64->"Dlego Maradona"
                    in 65..69->"Eddie"
                    in 70..79->"Mulamba Ndoya"
                    in 80..89->"John lewis"
                    in 90..99->"Desmond Tutu"
                    in 100..100->"Rose Parks "
                    else-> "age out of range"
                }
             txtResult.text=
              when (result){
                  "Tupac Shakur" -> "you are in your 20's which is the same age asTupac Shakurdied .Tupac Shakur died at the sage of 20 "
                  "John Keats "->" you are in your 30's which is the same age as John Keats died . John Keats died at the age of 35"
                  "Nelson Mandela "->"you are in your 40's which is the same age as Nelson Mandela die. Nelson Mandela died at the age of 40"
                  "Babe Ruth "->" you are in your 50's which is the same age as Babe Ruth died Babe Ruth died at the age of 58"
                  "Dlego Maradona"->" you  are in you early 60's which is the same age as Dlego Maradona died .Dlego Maradonadied at the age 64"
                  " Eddie"->" you are in you late 60's which the same age as Eddie died .Eddie died at the age of 68"
                  "Mulamba Nyado"->" you are in your 70's which is the same age as Mulamba Nyado died. Mulamba Nyado died at the age of 70"
                  "Jonh Lewis "->" you are in your 80's which is the same age as Jonh Lewis died.Jonh Lewis died at the age of 82"
                  "Desmond Tutu "->"you are in you 90's which ids the same age as Desmond Tutu died Desmond Tutu died at the age of 90"
                  "Rose Parks "->" you are 100 years old which is the same age as Rose Parks died Rose Parks  died at the age of 100"
                  else->result
                }
            }
        }
    }
}
