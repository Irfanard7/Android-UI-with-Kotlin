package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.tugas2layout)
//        setContentView(R.layout.activity_main)
//        findViewById<TextView>(R.id.helloworld_text).setText("Activity sudah pernah melewati onCreate()")
//        Log.i("MainActivity", "onCreate()")
//    }
//    override fun onStart(){
//        super.onStart()
//        findViewById<TextView>(R.id.helloworld_text2).setText("Activity sudah pernah melewati onStart()")
//        Log.i("MainActivity", "onStart()")
//    }
//    override fun onResume() {
//        super.onResume()
//        findViewById<TextView>(R.id.helloworld_text3).setText("Activity sudah pernah melewati onResume()")
//        Log.i("MainActivity", "onResume()")
//    }
//    override fun onPause() {
//        super.onPause()
//        findViewById<TextView>(R.id.helloworld_text4).setText("Activity sudah pernah melewati onPause()")
//        Log.i("MainActivity", "onPause()")
//    }
//    override fun onStop() {
//        super.onStop()
//        findViewById<TextView>(R.id.helloworld_text5).setText("Activity sudah pernah melewati onStop()")
//        Log.i("MainActivity", "onStop()")
//    }
//    override fun onRestart() {
//        super.onRestart()
//        findViewById<TextView>(R.id.helloworld_text6).setText("Activity sudah pernah melewati onRestart()")
//        Log.i("MainActivity", "onRestart()")
//    }
//    override fun onDestroy() {
//        super.onDestroy()
//        findViewById<TextView>(R.id.helloworld_text7).setText("Activity sudah pernah melewati onDestroy()")
//        Log.i("MainActivity", "onDestroy()")
    }
}