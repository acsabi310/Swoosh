package com.acsabi.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.acsabi.swoosh.Model.Player
import com.acsabi.swoosh.R
import com.acsabi.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var player = Player("", "")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun onMensClicked(view: View) {
        womensLeagueButton.isChecked = false
        coEdLeagueButton.isChecked = false
        player.league = "mens"
    }

    fun onWomensClicked(view: View) {
        mensLeagueButton.isChecked = false
        coEdLeagueButton.isChecked = false
        player.league = "womens"

    }

    fun onCoEdClicked(view: View) {
        womensLeagueButton.isChecked = false
        mensLeagueButton.isChecked = false
        player.league = "co-ed"

    }

    fun leagueNextClicked(view: View) {
        if (player.league != "") {
            val skillActivity = Intent(this, SkillActivity::class.java)
            /*
            Intent-hez adhatunk "extrát", pl email -> csatolmány, stb
             */

            skillActivity.putExtra(EXTRA_PLAYER, player)
            startActivity(skillActivity)
        } else {
            Toast.makeText(this, "Please select a league", Toast.LENGTH_SHORT).show()
        }

    }

}
