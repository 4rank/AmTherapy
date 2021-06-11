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

class AmoxiActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.anti_res_amoxi)

        val actionBar = supportActionBar
        supportActionBar?.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.ac_b_anti))
        actionBar!!.setHomeButtonEnabled(true)
        actionBar.setDisplayHomeAsUpEnabled(true)

        val args = intent.extras
        val amS125 = args!!["sus_am125"] as Double
        val amS1253rd = args["sus_am3rd125"] as Double
        val amS250 = args["sus_am250"] as Double
        val amS2503rd = args["sus_am2503rd"] as Double
        val amT250rd2 = args["tab_am2502rd"] as Double
        val amT250rd3 = args["tab_am2503rd"] as Double
        val amT500rd2 = args["tab_am5002rd"] as Double
        val amT500rd3 = args["tab_am5003rd"] as Double
        val amT750rd2 = args["tab_am7502rd"] as Double
        val amT750rd3 = args["tab_am7503rd"] as Double
        val amT1000rd2 = args["tab_am10002rd"] as Double
        val s125 = findViewById<TextView>(R.id.text_amoxi_125_5)
        val s250 = findViewById<TextView>(R.id.text_amoxi_250_5)
        val t250 = findViewById<TextView>(R.id.text_amoxi_250)
        val t500 = findViewById<TextView>(R.id.text_amoxi_500)
        val t750 = findViewById<TextView>(R.id.text_amoxi_750)
        val t1000 = findViewById<TextView>(R.id.text_amoxi_1000)
        s125.text = "По " + amS125 + "мл. 2р/д либо по " + amS1253rd + "мл. 3р/д"
        s250.text = "По " + amS250 + "мл. 2р/д либо по " + amS2503rd + "мл. 3р/д"
        t250.text = "По $amT250rd2 таб. 2р/д либо по $amT250rd3 таб. 3р/д"
        t500.text = "По $amT500rd2 таб. 2р/д либо по $amT500rd3 таб. 3р/д"
        t750.text = "По $amT750rd2 таб. 2р/д либо по $amT750rd3 таб. 3р/д"
        t1000.text = "По $amT1000rd2 таб. 2 р/д"

        val main = findViewById<Button>(R.id.button_else_ch)
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