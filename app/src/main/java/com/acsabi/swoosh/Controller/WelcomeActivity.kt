package com.acsabi.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import com.acsabi.swoosh.R
import kotlinx.android.synthetic.main.activity_main.*

class WelcomeActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getStartedButton.setOnClickListener {
            val leagueIntent = Intent(this, LeagueActivity::class.java)
            startActivity(leagueIntent)
        }

        /*
        Intent: lehet implicit és explicit, valamilyen esemény
        lehet click-re kamera, link valahova pl browsert nyitni,

        explicit: amikor megmondjuk h mit használjon az adnroid
        itt pl: LeagueActivity::class.java

        implicit: android dönti el, vagy ajánlja fel (pl link nyitás, melyik böngészővel?)

        saját appban explicit Intent-eket használunk

         */
    }
}
