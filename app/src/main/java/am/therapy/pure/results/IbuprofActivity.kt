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

class IbuprofActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pr_res_ibuprof)

        val actionBar = supportActionBar
        supportActionBar?.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.ac_b_pr))
        actionBar!!.setHomeButtonEnabled(true)
        actionBar.setDisplayHomeAsUpEnabled(true)

        val args = intent.extras
        val ibSP60min = args!!["sup_min_ibuf60"] as Double
        val ibSP60max = args["sup_max_ibuf60"] as Double
        val ibS100min = args["sus_min_ibuf100"] as Double
        val ibS100max = args["sus_max_ibuf100"] as Double
        val ibS200min = args["sus_min_ibuf200"] as Double
        val ibS200max = args["sus_max_ibuf200"] as Double
        val ibT200min = args["tab_min_ibuf200"] as Double
        val ibT200max = args["tab_max_ibuf200"] as Double
        val ibT400min = args["tab_min_ibuf500"] as Double
        val ibT400max = args["tab_max_ibuf500"] as Double
        val sup60 = findViewById<TextView>(R.id.text_ib_sup_60)
        val sus100 = findViewById<TextView>(R.id.text_ib_sus_100)
        val sus200 = findViewById<TextView>(R.id.text_ib_sus_200)
        val t200 = findViewById<TextView>(R.id.text_ib_tab_200)
        val t400 = findViewById<TextView>(R.id.text_ib_tab_400)
        sup60.text = "Разово ректально от $ibSP60min супп. до $ibSP60max супп."
        sus100.text = "Разово внутрь от " + ibS100min + "мл. до " + ibS100max + "мл."
        sus200.text = "Разово внутрь от " + ibS200min + "мл. до " + ibS200max + "мл."
        t200.text = "Разово внутрь от $ibT200min таб. до $ibT200max таб."
        t400.text = "Разово внутрь от $ibT400min таб. до $ibT400max таб."
        val main = findViewById<Button>(R.id.button_else_ib)
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