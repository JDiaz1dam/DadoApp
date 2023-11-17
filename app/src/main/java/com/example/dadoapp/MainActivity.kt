package com.example.dadoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    class MainActivity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

        }

        class DiceRoller : AppCompatActivity() {
            override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_main)

                initComponents()

                initListeners()
            }

            private lateinit var rollbutton: Button
            private lateinit var textnum: TextView

            private fun initComponents() {
                rollbutton = findViewById(R.id.button)
                textnum = findViewById(R.id.textnum)
            }

            private fun initListeners() {
                rollbutton.setOnClickListener {
                    rollDice()
                }
            }

            private fun rollDice() {
                val dice = Dice(10)
                val diceRoll = dice.roll()
                val resultTextView: TextView = findViewById(R.id.textnum)
                resultTextView.text = diceRoll.toString()
            }
        }

        class Dice(val numSides: Int) {

            fun roll(): Int {
                return (1..numSides).random()
            }
        }
    }
}