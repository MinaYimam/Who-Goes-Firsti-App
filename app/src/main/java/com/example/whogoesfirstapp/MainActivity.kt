package com.example.whogoesfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.random.Random


class MainActivity : AppCompatActivity() {
//this will create the activties in to a variable in the main activity
    private lateinit var team1EditText: EditText
    private lateinit var team2EditText: EditText
    private lateinit var resultTextView: TextView
    private lateinit var chooseTeamButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        team1EditText = findViewById(R.id.team_1)
        team2EditText = findViewById(R.id.team_2)
        resultTextView = findViewById(R.id.result_text_view)
        chooseTeamButton = findViewById(R.id.choose_team_button)
        chooseTeamButton.setOnClickListener {
            chooserandomteam()
        }

    }
//this funtion will choose a random text and if the text is plain it will return and say add some text
    private fun chooserandomteam() {
    //this will save the text that has been added
        val team1 = team1EditText.text
        val team2 = team2EditText.text

//this will show if the result is not blank
        if (team1.isNotBlank() && team2.isNotBlank()) {
            val teamOneGoesFirst = Random.nextBoolean()
            if (teamOneGoesFirst) {
                val teamOneFirst = getString(R.string.who_goes_first, team1)
                resultTextView.setText(teamOneFirst).toString()
            } else {
                val teamTwoFirst = getString(R.string.who_goes_first, team2)
                resultTextView.setText(teamTwoFirst).toString()
            }


        }
    }
}