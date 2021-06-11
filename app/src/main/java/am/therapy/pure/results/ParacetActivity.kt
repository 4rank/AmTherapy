package am.therapy.pure.results

import am.therapy.MainActivity
import am.therapy.R
import am.therapy.pure.MainPRActivity
import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat

class ParacetActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pr_res_paracet)

        val actionBar = supportActionBar
        supportActionBar?.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.ac_b_pr))
        actionBar!!.setHomeButtonEnabled(true)
        actionBar.setDisplayHomeAsUpEnabled(true)

        val args = intent.extras
        val parSP80min = args!!["sup_min_par80"] as Double
        val parSP80max = args["sup_max_par80"] as Double
        val parSP125min = args["sup_min_par125"] as Double
        val parSP125max = args["sup_max_par125"] as Double
        val parSP150min = args["sup_min_par150"] as Double
        val parSP150max = args["sup_max_par150"] as Double
        val parSP250min = args["sup_min_par250"] as Double
        val parSP250max = args["sup_max_par250"] as Double
        val parS120min = args["sus_min_par120"] as Double
        val parS120max = args["sus_max_par120"] as Double
        val parS30min = args["sus_min_par30"] as Double
        val parS30max = args["sus_max_par30"] as Double
        val parT200min = args["tab_min_par200"] as Double
        val parT200max = args["tab_max_par200"] as Double
        val parT500min = args["tab_min_par500"] as Double
        val parT500max = args["tab_max_par500"] as Double
        val sup80 = findViewById<TextView>(R.id.text_par_sup_80)
        val sup125 = findViewById<TextView>(R.id.text_par_sup_125)
        val sup150 = findViewById<TextView>(R.id.text_par_sup_150)
        val sup250 = findViewById<TextView>(R.id.text_par_sup_250)
        val sus120 = findViewById<TextView>(R.id.text_par_sus_120)
        val sus30 = findViewById<TextView>(R.id.text_par_sus_30)
        val t200 = findViewById<TextView>(R.id.text_par_tab_200)
        val t500 = findViewById<TextView>(R.id.text_par_tab_500)
        sup80.text = "Разово ректально от $parSP80min супп. до $parSP80max супп."
        sup125.text = "Разово ректально от $parSP125min супп. до $parSP125max супп."
        sup150.text = "Разово ректально от $parSP150min супп. до $parSP150max супп."
        sup250.text = "Разово ректально от $parSP250min супп. до $parSP250max супп."
        sus120.text = "Разово внутрь от " + parS120min + "мл. до " + parS120max + "мл."
        sus30.text = "Разово внутрь от " + parS30min + "мл. до " + parS30max + "мл."
        t200.text = "Разово внутрь от $parT200min таб. до $parT200max таб."
        t500.text = "Разово внутрь от $parT500min таб. до $parT500max таб."
        val main = findViewById<Button>(R.id.button_else_par)
        main.setOnClickListener {
            val intent = Intent(this, MainPRActivity::class.java)
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