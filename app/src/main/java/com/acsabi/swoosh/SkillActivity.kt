package com.acsabi.swoosh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SkillActivity : BaseActivity() {

    var league = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        /*
        extra elkérése intent-től
         */
        league = intent.getStringExtra(EXTRA_LEAGUE)
        println(league)
    }
}
