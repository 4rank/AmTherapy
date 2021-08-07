package am.therapy.weight

import am.therapy.MainActivity
import am.therapy.R
import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat

class WeightActivityRes : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.weight_res)

        val actionBar = supportActionBar
        supportActionBar?.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.ac_b_weight))
        actionBar!!.setHomeButtonEnabled(true)
        actionBar.setTitle(R.string.back_menu)
        actionBar.setDisplayHomeAsUpEnabled(true)

        val args = intent.extras
        val w1 = args!!["m1"].toString()
        val w2 = args["m2"].toString()
        val w3 = args["m3"].toString()
        val w4 = args["m4"].toString()
        val w5 = args["m5"].toString()
        val w6 = args["m6"].toString()
        val w7 = args["m7"].toString()
        val w8 = args["m8"].toString()
        val w9 = args["m9"].toString()
        val w10 = args["m10"].toString()
        val w11 = args["m11"].toString()
        val w12 = args["m12"].toString()
        val mw1 = findViewById<TextView>(R.id.m1)
        val mw2 = findViewById<TextView>(R.id.m2)
        val mw3 = findViewById<TextView>(R.id.m3)
        val mw4 = findViewById<TextView>(R.id.m4)
        val mw5 = findViewById<TextView>(R.id.m5)
        val mw6 = findViewById<TextView>(R.id.m6)
        val mw7 = findViewById<TextView>(R.id.m7)
        val mw8 = findViewById<TextView>(R.id.m8)
        val mw9 = findViewById<TextView>(R.id.m9)
        val mw10 = findViewById<TextView>(R.id.m10)
        val mw11 = findViewById<TextView>(R.id.m11)
        val mw12 = findViewById<TextView>(R.id.m12)
        val gram = getString(R.string.ben_second5)
        val mes1 = getString(R.string.weight_mes1)
        val mes2 = getString(R.string.weight_mes2)
        val mes3 = getString(R.string.weight_mes3)
        val mes4 = getString(R.string.weight_mes4)
        val mes5 = getString(R.string.weight_mes5)
        val mes6 = getString(R.string.weight_mes6)
        val mes7 = getString(R.string.weight_mes7)
        val mes8 = getString(R.string.weight_mes8)
        val mes9 = getString(R.string.weight_mes9)
        val mes10 = getString(R.string.weight_mes10)
        val mes11 = getString(R.string.weight_mes11)
        val mes12 = getString(R.string.weight_mes12)
        mw1.text = "$mes1 $w1 $gram"
        mw2.text = "$mes2 $w2 $gram"
        mw3.text = "$mes3 $w3 $gram"
        mw4.text = "$mes4 $w4 $gram"
        mw5.text = "$mes5 $w5 $gram"
        mw6.text = "$mes6 $w6 $gram"
        mw7.text = "$mes7 $w7 $gram"
        mw8.text = "$mes8 $w8 $gram"
        mw9.text = "$mes9 $w9 $gram"
        mw10.text = "$mes10 $w10 $gram"
        mw11.text = "$mes11 $w11 $gram"
        mw12.text = "$mes12 $w12 $gram"
        val exit = findViewById<Button>(R.id.button_wei_exit)
        val meal = findViewById<Button>(R.id.button_meal)
        exit.setOnClickListener {
            val intent = Intent(this, WeightActivity::class.java)
            startActivity(intent)
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
        }
        meal.setOnClickListener { meal() }
    }

    private fun meal() {
        val args = intent.extras
        val w1 = args!!["m1"].toString()
        val w2 = args["m2"].toString()
        val w3 = args["m3"].toString()
        val w4 = args["m4"].toString()
        val w5 = args["m5"].toString()
        val w6 = args["m6"].toString()
        val w7 = args["m7"].toString()
        val w8 = args["m8"].toString()
        val w9 = args["m9"].toString()
        val w10 = args["m10"].toString()
        val w11 = args["m11"].toString()
        val w12 = args["m12"].toString()
        val brMeal0 = w1.toInt() - 600
        var meal0 = brMeal0 / 5
        if (meal0 > 1000) {
            meal0 = 1000
        }
        val meal0Rd = meal0 / 8
        var meal1 = w1.toInt() / 5
        if (meal1 > 1000) {
            meal1 = 1000
        }
        val meal1Rd = meal1 / 8
        var meal2 = w2.toInt() / 5
        if (meal2 > 1000) {
            meal2 = 1000
        }
        val meal2Rd = meal2 / 7
        var meal3 = w3.toInt() / 6
        if (meal3 > 1000) {
            meal3 = 1000
        }
        if (meal3 < meal2) {
            meal3 = meal2
        }
        val meal3Rd = meal3 / 7
        var meal4 = w4.toInt() / 6
        if (meal4 > 1000) {
            meal4 = 1000
        }
        val meal4Rd = meal4 / 6
        var meal5 = w5.toInt() / 7
        if (meal5 > 1000) {
            meal5 = 1000
        }
        if (meal5 < meal4) {
            meal5 = meal4
        }
        val meal5Rd = meal5 / 6
        var meal6 = w6.toInt() / 7
        if (meal6 > 1000) {
            meal6 = 1000
        }
        val meal6Rd = meal6 / 6
        var meal7 = w7.toInt() / 8
        if (meal7 > 1000) {
            meal7 = 1000
        }
        if (meal7 < meal6) {
            meal7 = meal6
        }
        val meal7Rd = meal7 / 6
        var meal8 = w8.toInt() / 8
        if (meal8 > 1100) {
            meal8 = 1100
        }
        val meal8Rd = meal8 / 5
        var meal9 = w9.toInt() / 9
        if (meal9 > 1100) {
            meal9 = 1100
        }
        if (meal9 < meal8) {
            meal9 = meal8
        }
        val meal9Rd = meal9 / 5
        var meal10 = w10.toInt() / 9
        if (meal10 > 1100) {
            meal10 = 1100
        }
        if (meal10 < meal9) {
            meal10 = meal9
        }
        val meal10Rd = meal10 / 5
        var meal11 = w11.toInt() / 9
        if (meal11 > 1100) {
            meal11 = 1100
        }
        if (meal11 < meal10) {
            meal11 = meal10
        }
        val meal11Rd = meal11 / 5
        var meal12 = w12.toInt() / 9
        if (meal12 > 1100) {
            meal12 = 1100
        }
        if (meal12 < meal11) {
            meal12 = meal11
        }
        val meal12Rd = meal12 / 5
        val intent = Intent(applicationContext, MealActivity::class.java)
        intent.putExtra("meal0", meal0)
        intent.putExtra("meal0_rd", meal0Rd)
        intent.putExtra("meal1", meal1)
        intent.putExtra("meal1_rd", meal1Rd)
        intent.putExtra("meal2", meal2)
        intent.putExtra("meal2_rd", meal2Rd)
        intent.putExtra("meal3", meal3)
        intent.putExtra("meal3_rd", meal3Rd)
        intent.putExtra("meal4", meal4)
        intent.putExtra("meal4_rd", meal4Rd)
        intent.putExtra("meal5", meal5)
        intent.putExtra("meal5_rd", meal5Rd)
        intent.putExtra("meal6", meal6)
        intent.putExtra("meal6_rd", meal6Rd)
        intent.putExtra("meal7", meal7)
        intent.putExtra("meal7_rd", meal7Rd)
        intent.putExtra("meal8", meal8)
        intent.putExtra("meal8_rd", meal8Rd)
        intent.putExtra("meal9", meal9)
        intent.putExtra("meal9_rd", meal9Rd)
        intent.putExtra("meal10", meal10)
        intent.putExtra("meal10_rd", meal10Rd)
        intent.putExtra("meal11", meal11)
        intent.putExtra("meal11_rd", meal11Rd)
        intent.putExtra("meal12", meal12)
        intent.putExtra("meal12_rd", meal12Rd)
        startActivity(intent)
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}