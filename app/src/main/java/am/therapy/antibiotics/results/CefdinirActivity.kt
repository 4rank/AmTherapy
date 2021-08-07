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
        actionBar.setTitle(R.string.back_menu)
        actionBar.setDisplayHomeAsUpEnabled(true)

        val args = intent.extras
        val cefS125 = args!!["sus_cefdinir125"] as Double
        val cefS250 = args["sus_cefdinir250"] as Double
        val cefT300rd2 = args["tab_cefdinir2502rd"] as Double
        val s125 = findViewById<TextView>(R.id.text_cefdinir_125_5)
        val s250 = findViewById<TextView>(R.id.text_cefdinir_250_5)
        val t300 = findViewById<TextView>(R.id.text_cefdinir_300)
        val po = getString(R.string.dose_text_start)
        val ml2rd = getString(R.string.dose_text_2rd_s_else)
        val tl2rd = getString(R.string.dose_text_2rd_t_end_else)
        s125.text = "$po $cefS125$ml2rd"
        s250.text = "$po $cefS250$ml2rd"
        t300.text = "$po $cefT300rd2 $tl2rd"
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