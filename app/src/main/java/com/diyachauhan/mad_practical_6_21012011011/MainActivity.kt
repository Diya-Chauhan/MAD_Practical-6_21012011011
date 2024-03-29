package com.diyachauhan.mad_practical_6_21012011011

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Start= findViewById<FloatingActionButton>(R.id.play_button)
        Start.setOnClickListener(){
            play()
        }
        val Stop= findViewById<FloatingActionButton>(R.id.stop_button)
        Stop.setOnClickListener(){
            pause()
        }

    }
    fun play(){
        val intent = Intent(applicationContext,MyService::class.java)
        intent.putExtra(MyService.PLAYERCONSTANT,"PLAY")
        startService(intent)

    }
    fun pause(){
        val intent = Intent(applicationContext,MyService::class.java)
        intent.putExtra(MyService.PLAYERCONSTANT,"PAUSE")
        stopService(intent)

    }

}