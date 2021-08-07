package am.therapy.antibiotics.results

import am.therapy.MainActivity
import am.therapy.R
import am.therapy.antibiotics.MainAntiActivity
import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat

class CefiximeActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.anti_res_cefixime)

        val actionBar = supportActionBar
        supportActionBar?.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.ac_b_anti))
        actionBar!!.setHomeButtonEnabled(true)
        actionBar.setTitle(R.string.back_menu)
        actionBar.setDisplayHomeAsUpEnabled(true)

        val args = intent.extras
        val cefS100 = args!!["sus_cefixim100"] as Double
        val cefS1002rd = args["sus_cefixim1002rd"] as Double
        val cefT400 = args["tab_cefixim400"] as Double
        val cefT4002rd = args["tab_cefixim4002rd"] as Double
        val s100 = findViewById<TextView>(R.id.text_cefixim_100_5)
        val t400 = findViewById<TextView>(R.id.text_cefixim_400)
        val po = getString(R.string.dose_text_start)
        val ml1rd = getString(R.string.dose_text_1rd_s_else)
        val ml2rd = getString(R.string.dose_text_2rd_s_rd)
        val t1rd = getString(R.string.dose_text_1rd_t)
        val t2rd = getString(R.string.dose_text_2rd_t_end)
        s100.text = "$po $cefS100$ml1rd $cefS1002rd$ml2rd"
        t400.text = "$po $cefT400 $t1rd $cefT4002rd $t2rd"
        val main = findViewById<Button>(R.id.button_else_ch_cefixim)
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