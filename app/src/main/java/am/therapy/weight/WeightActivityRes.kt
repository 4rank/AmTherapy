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
        mw1.text = "Вес ребенка в 1 месяц: $w1 г."
        mw2.text = "Вес ребенка в 2 месяца: $w2 г."
        mw3.text = "Вес ребенка в 3 месяца: $w3 г."
        mw4.text = "Вес ребенка в 4 месяца: $w4 г."
        mw5.text = "Вес ребенка в 5 месяцев: $w5 г."
        mw6.text = "Вес ребенка в 6 месяцев: $w6 г."
        mw7.text = "Вес ребенка в 7 месяцев: $w7 г."
        mw8.text = "Вес ребенка в 8 месяцев: $w8 г."
        mw9.text = "Вес ребенка в 9 месяцев: $w9 г."
        mw10.text = "Вес ребенка в 10 месяцев: $w10 г."
        mw11.text = "Вес ребенка в 11 месяцев: $w11 г."
        mw12.text = "Вес ребенка в 12 месяцев: $w12 г."
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