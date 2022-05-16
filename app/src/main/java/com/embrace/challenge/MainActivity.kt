package com.embrace.challenge

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.embrace.challenge.databinding.ActivityMainBinding
import com.embrace.logger.EmbraceLogger
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val logger = EmbraceLogger()
        val viewBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        with(viewBinding) {
            submitBtn.setOnClickListener {
                val message = logMessage.text.toString()
                val date = SimpleDateFormat("HH:mm:ss", Locale.getDefault()).format(Calendar.getInstance().time)
                val loggedMessage = if (logger.log(message)) "LOGGED" else "OMITTED"
                val newLine = resources.getString(R.string.log_line, date, message, loggedMessage)
                logText.text = newLine.plus("\n").plus(logText.text)
            }
        }
    }
}