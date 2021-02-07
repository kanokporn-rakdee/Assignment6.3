package com.example.assign6_3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val clear = Toast.makeText(applicationContext,"All fields are cleared.", Toast.LENGTH_LONG)
        var sumall:Double
        var suminter:Double
        var y1:Double = 0.00
        var y2:Double = 0.00
        var y3:Double = 0.00
        var I1:Double
        var I2:Double
        var I3:Double

        ocal.setOnClickListener(){
            val M = inpM.getText().toString().toDouble()
            for (N in 1..10){
                if (N >= 1 && N <= 3){
                    I1 = M * 3 / 100
                    y1 = y1 + I1
                    I1 = 0.00
                    Y1.setText("$y1")
                }else if (N >= 4 && N <= 7){
                    I2 = M * 5 / 100
                    y2 = y2 + I2
                    I2 = 0.00
                    Y2.setText("$y2")
                }else if (N >= 8 && N <= 10){
                    I3 = M * 7 / 100
                    y3 = y3 + I3
                    I3 = 0.00
                    Y3.setText("$y3")
                }
            }
            suminter = y1 + y2 + y3
            sumall = M + suminter
            Sinter.setText("$suminter")
            sum.setText("$sumall")
        }
        oclear.setOnClickListener(){
            inpM.setText(null)
            Y1.setText(null)
            Y2.setText(null)
            Y3.setText(null)
            Sinter.setText(null)
            sum.setText(null)
            clear.show()
        }
    }
}