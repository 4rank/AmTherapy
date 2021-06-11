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

class ClariActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.anti_res_clary)

        val actionBar = supportActionBar
        supportActionBar?.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.ac_b_anti))
        actionBar!!.setHomeButtonEnabled(true)
        actionBar.setDisplayHomeAsUpEnabled(true)

        val args = intent.extras
        val clS125 = args!!["sus_clar125"] as Double
        val clS250 = args["sus_clar250"] as Double
        val clT250rd2 = args["tab_clar2502rd"] as Double
        val clT500rd1 = args["tab_clar5001rd"] as Double
        val s125 = findViewById<TextView>(R.id.text_clari_125_5)
        val s250 = findViewById<TextView>(R.id.text_clari_250_5)
        val t250 = findViewById<TextView>(R.id.text_clari_250)
        val t500 = findViewById<TextView>(R.id.text_clari_500)
        s125.text = "По " + clS125 + "мл. 2 раза в день"
        s250.text = "По " + clS250 + "мл. 2 раза в день"
        t250.text = "По $clT250rd2 таб. 2 раза в день"
        t500.text = "По $clT500rd1 таб. 1 раз в день"
        val main = findViewById<Button>(R.id.button_else_ch_cl)
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