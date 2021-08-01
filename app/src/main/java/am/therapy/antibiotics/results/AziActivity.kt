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

class AziActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.anti_res_azi)

        val actionBar = supportActionBar
        supportActionBar?.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.ac_b_anti))
        actionBar!!.setHomeButtonEnabled(true)
        actionBar.setDisplayHomeAsUpEnabled(true)

        val args = intent.extras
        val aziS100 = args!!["sus_azi100"] as Double
        val aziS200 = args["sus_azi200"] as Double
        val aziT250 = args["tab_azi250"] as Double
        val aziT500 = args["tab_azi500"] as Double
        val s100 = findViewById<TextView>(R.id.text_azi_100_5)
        val s200 = findViewById<TextView>(R.id.text_azi_200_5)
        val t250 = findViewById<TextView>(R.id.text_azi_250)
        val t500 = findViewById<TextView>(R.id.text_azi_500)
        val po = getString(R.string.dose_text_start)
        val ml1rd = getString(R.string.dose_text_1rd_s)
        val t1rd = getString(R.string.dose_text_1rd_t_end)
        s100.text = "$po $aziS100$ml1rd"
        s200.text = "$po $aziS200$ml1rd"
        t250.text = "$po $aziT250 $t1rd"
        t500.text = "$po $aziT500 $t1rd"

        val main = findViewById<Button>(R.id.button_else_ch_az)
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