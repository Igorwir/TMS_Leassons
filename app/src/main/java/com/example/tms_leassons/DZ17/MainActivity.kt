package com.example.tms_leassons.DZ17

import android.opengl.Visibility
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import com.example.tms_leassons.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var timer: CountDownTimer? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.drawTimer.visibility = View.INVISIBLE
        binding.btStartTime.setOnClickListener {
            run(30000)
        }
    }

    fun run(millisForStart: Long) {
        timer?.cancel()
        timer = object : CountDownTimer(30000, 1000) {

            override fun onTick(millis: Long) {
                binding.tvDisplayCounter.setText("timer: " + millis / 1000)
                //binding.drawTimer.visibility = View.INVISIBLE
            }

            override fun onFinish() {
                binding.tvDisplayCounter.setText("done!")
                binding.drawTimer.visibility = View.VISIBLE
            }
        }.start()
    }
}