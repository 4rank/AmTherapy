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

class AmoxiClavActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.anti_res_amoxiclav)

        val actionBar = supportActionBar
        supportActionBar?.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.ac_b_anti))
        actionBar!!.setHomeButtonEnabled(true)
        actionBar.setDisplayHomeAsUpEnabled(true)

        val args = intent.extras
        val augS125 = args!!["sus_am_cl125"] as Double
        val augS1253rd = args["sus_am_cl1253rd"] as Double
        val augS200 = args["sus_am_cl200"] as Double
        val augS2003rd = args["sus_am_cl2003rd"] as Double
        val aug400rd2 = args["sus_am_cl400"] as Double
        val aug400rd3 = args["sus_am_cl4003rd"] as Double
        val augT250rd2 = args["sus_am_cl250"] as Double
        val augT250rd3 = args["sus_am_cl2503rd"] as Double
        val augT500rd2 = args["tab_am_cl5002rd"] as Double
        val augT500rd3 = args["tab_am_cl5003rd"] as Double
        val augT875rd2 = args["tab_am_cl10002rd"] as Double
        val s125 = findViewById<TextView>(R.id.text_amoxi_clav_125_5)
        val s200 = findViewById<TextView>(R.id.text_amoxi_clav_200_5)
        val s400 = findViewById<TextView>(R.id.text_amoxi_clav_400_5)
        val t250 = findViewById<TextView>(R.id.text_amoxi_clav_250)
        val t500 = findViewById<TextView>(R.id.text_amoxi_clav_500)
        val t875 = findViewById<TextView>(R.id.text_amoxi_clav_875)
        val po = getString(R.string.dose_text_start)
        val ml2rd = getString(R.string.dose_text_2rd_s)
        val ml3rd = getString(R.string.dose_text_3rd_s)
        val t2rd = getString(R.string.dose_text_2rd_t)
        val t3rd = getString(R.string.dose_text_3rd_t)
        val t2 = getString(R.string.dose_text_2rd_t_end)
        s125.text = "$po $augS125$ml2rd $augS1253rd$ml3rd"
        s200.text = "$po $augS200$ml2rd $augS2003rd$ml3rd"
        s400.text = "$po $aug400rd2$ml2rd $aug400rd3$ml3rd"
        t250.text = "$po $augT250rd2$ml2rd $augT250rd3$ml3rd"
        t500.text = "$po $augT500rd2 $t2rd $augT500rd3$t3rd"
        t875.text = "$po $augT875rd2 $t2"

        val main = findViewById<Button>(R.id.button_else_ch_clav)
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