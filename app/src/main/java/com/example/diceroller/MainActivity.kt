package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // RollButton Activity
        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener{
            rollDice()
//            val toast = Toast.makeText(this, "Dice Rolled", Toast.LENGTH_SHORT)
//            toast.show()
//            Toast.makeText(this, "Dice Rolled", Toast.LENGTH_SHORT).show()
//            val resultTextView: TextView = findViewById(R.id.textView)
//            resultTextView.text = "6"
        }
    }
    private fun rollDice(){
        val dice = Dice(6)
        val cubeRoll = dice.rollDice()

//        val resultTextView: TextView = findViewById(R.id.textView)
//        resultTextView.text = cubeRoll.toString()
        val diceImageView: ImageView = findViewById(R.id.imageView)
        diceImageView.setImageResource(R.drawable.dice_1)

        when (cubeRoll){
            1 -> diceImageView.setImageResource(R.drawable.dice_1)
            2 -> diceImageView.setImageResource(R.drawable.dice_2)
            3 -> diceImageView.setImageResource(R.drawable.dice_3)
            4 -> diceImageView.setImageResource(R.drawable.dice_4)
            5 -> diceImageView.setImageResource(R.drawable.dice_5)
            6 -> diceImageView.setImageResource(R.drawable.dice_6)


        }
    }
    class Dice (private val numSide: Int) {
        fun rollDice(): Int{
            return (1..numSide).random()
        }
    }
}