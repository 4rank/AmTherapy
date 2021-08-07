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
        actionBar.setTitle(R.string.back_menu)
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
        val sup = getString(R.string.pr_start_rec)
        val vn = getString(R.string.pr_start_vn)
        val sup1 = getString(R.string.pr_sup)
        val ml1 = getString(R.string.pr_ml)
        val tab1 = getString(R.string.pr_tab)
        val sup2 = getString(R.string.pr_end_sup)
        val ml2 = getString(R.string.pr_end_ml)
        val tab2 = getString(R.string.pr_end_tab)
        sup80.text = "$sup $parSP80min $sup1 $parSP80max $sup2"
        sup125.text = "$sup $parSP125min $sup1 $parSP125max $sup2"
        sup150.text = "$sup $parSP150min $sup1 $parSP150max $sup2"
        sup250.text = "$sup $parSP250min $sup1 $parSP250max $sup2"
        sus120.text = "$vn $parS120min $ml1 $parS120max $ml2"
        sus30.text = "$vn $parS30min $ml1 $parS30max $ml2"
        t200.text = "$vn $parT200min $tab1 $parT200max $tab2"
        t500.text = "$vn $parT500min $tab1 $parT500max $tab2"
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