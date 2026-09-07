package com.example.socialspark

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private val TAG = "SocialSpark"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val etHour =
            findViewById<EditText>(R.id.etHour)
        val btnGetSuggestion =
            findViewById<Button>(R.id.btnGetSuggestion)
        val tvSuggestion =
            findViewById<TextView>(R.id.tvSuggestion)
        val btnReset =
            findViewById<Button>(R.id.btnReset)

        btnGetSuggestion.setOnClickListener {
            val input = etHour.text.toString().trim()
            if (input.isEmpty()) {
                tvSuggestion.text = "Please enter a time of day"
            } else {
                val time = input.lowercase()
                if (time == "morning") {
                    tvSuggestion.text = "Morning: Send a Good morning text to a family member."
                } else if (time == "mid-" +
                    "morning" || time == "mid morning"
                ) {
                    tvSuggestion.text =
                        "Mid-morning: Reach out to a colleague with a quick Thank you."
                } else if (time == "afternoon") {
                    tvSuggestion.text = "Aternoon: Share a funny meme or link with a friend."
                } else if (time ==
                    "afternoon snack time" || time == "snack" ||
                    time == "afternoon snack"
                ) {
                    tvSuggestion.text =
                        "Afternoon Snack Time: Send a quick thinking of your message."
                } else if (time == "dinner") {
                    tvSuggestion.text =
                        "Dinner: Call a friend or relative for a 5-minute catch up."
                } else if (time == "after dinner" || time == "night") {
                    tvSuggestion.text =
                        "After Dinner: Leave a thoughtful comment on a friend's post."
                } else {
                    tvSuggestion.text =
                        "Invalid! Try: Morning, Mid-morning, Afternoon, Snack, Dinner, Night."
                }
            }
        }

        btnReset.setOnClickListener {
            etHour.text.clear()
            tvSuggestion.text = ""
        }
    }
}










