package com.acsabi.swoosh.Controller

import android.os.Bundle
import com.acsabi.swoosh.Utilities.EXTRA_LEAGUE
import com.acsabi.swoosh.R

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
