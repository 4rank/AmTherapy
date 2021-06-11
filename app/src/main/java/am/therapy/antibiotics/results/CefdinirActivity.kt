package am.therapy.antibiotics.results

import am.therapy.MainActivity
import am.therapy.R
import am.therapy.antibiotics.AntiActivity
import am.therapy.antibiotics.MainAntiActivity
import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat

class CefdinirActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.anti_res_cefdinir)

        val actionBar = supportActionBar
        supportActionBar?.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.ac_b_anti))
        actionBar!!.setHomeButtonEnabled(true)
        actionBar.setDisplayHomeAsUpEnabled(true)

        val args = intent.extras
        val cefS125 = args!!["sus_cefdinir125"] as Double
        val cefS250 = args["sus_cefdinir250"] as Double
        val cefT300rd2 = args["tab_cefdinir2502rd"] as Double
        val s125 = findViewById<TextView>(R.id.text_cefdinir_125_5)
        val s250 = findViewById<TextView>(R.id.text_cefdinir_250_5)
        val t300 = findViewById<TextView>(R.id.text_cefdinir_300)
        s125.text = "По " + cefS125 + "мл. 2 раза в день"
        s250.text = "По " + cefS250 + "мл. 2 раза в день"
        t300.text = "По $cefT300rd2 таб. 2 раза в день"
        val main = findViewById<Button>(R.id.button_else_ch_cefdinir)
        main.setOnClickListener {
            val intent = Intent(this, MainAntiActivity::class.java)
            startActivity(intent)
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
        }
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