package com.example.drawapp

import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.Toast
import com.example.drawapp.PaintView.Companion.colorList
import com.example.drawapp.PaintView.Companion.currentBrush
import com.example.drawapp.PaintView.Companion.pathList

class MainActivity : AppCompatActivity() {

    companion object{
        var path = Path()
        var paintBrush = Paint()

    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        window.decorView.apply{systemUiVisibility=
            View.SYSTEM_UI_FLAG_HIDE_NAVIGATION or View.SYSTEM_UI_FLAG_FULLSCREEN}


        val redBtn = findViewById<ImageButton>(R.id.redColor)
        val blueBtn = findViewById<ImageButton>(R.id.blueColor)
        val blackBtn = findViewById<ImageButton>(R.id.blackColor)
        val yellowBtn = findViewById<ImageButton>(R.id.yellowColor)
        val greenBtn = findViewById<ImageButton>(R.id.greenColor)
        val whiteBtn = findViewById<ImageButton>(R.id.redColor)

        redBtn.setOnClickListener{
            Toast.makeText(this,"You clicked red",Toast.LENGTH_SHORT).show()
            paintBrush.color = Color.RED
            currentColor(paintBrush.color)

        }
        blueBtn.setOnClickListener{
            Toast.makeText(this,"You clicked blue",Toast.LENGTH_SHORT).show()
            paintBrush.color = Color.BLUE
            currentColor(paintBrush.color)

        }
        blackBtn.setOnClickListener{
            Toast.makeText(this,"You clicked black",Toast.LENGTH_SHORT).show()
            paintBrush.color = Color.BLACK
            currentColor(paintBrush.color)

        }
        yellowBtn.setOnClickListener{
            Toast.makeText(this,"You clicked yellow",Toast.LENGTH_SHORT).show()
            paintBrush.color = Color.YELLOW
            currentColor(paintBrush.color)

        }
        greenBtn.setOnClickListener{
            Toast.makeText(this,"You clicked green",Toast.LENGTH_SHORT).show()
            paintBrush.color = Color.GREEN
            currentColor(paintBrush.color)

        }
        whiteBtn.setOnClickListener{
            Toast.makeText(this,"You clicked clear",Toast.LENGTH_SHORT).show()
            pathList.clear()
            colorList.clear()
            path.reset()

        }

    }

    private fun currentColor(color: Int){
        currentBrush = color
        path = Path()

    }
}