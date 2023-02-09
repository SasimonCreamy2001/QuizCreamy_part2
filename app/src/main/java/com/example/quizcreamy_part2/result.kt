package com.example.quizcreamy_part2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.quizcreamy_part2.one.Companion.num
import com.example.quizcreamy_part2.result
import kotlinx.android.synthetic.main.activity_result.*

class result : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        var ans = num
        result.setText("คุณได้คะแนนทั้งหมด $ans คะแนน")
    }
}