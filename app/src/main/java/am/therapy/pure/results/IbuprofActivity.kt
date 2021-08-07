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
        actionBar.setTitle(R.string.back_menu)
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
        val sup = getString(R.string.pr_start_rec)
        val vn = getString(R.string.pr_start_vn)
        val sup1 = getString(R.string.pr_sup)
        val ml1 = getString(R.string.pr_ml)
        val tab1 = getString(R.string.pr_tab)
        val sup2 = getString(R.string.pr_end_sup)
        val ml2 = getString(R.string.pr_end_ml)
        val tab2 = getString(R.string.pr_end_tab)
        sup60.text = "$sup $ibSP60min $sup1 $ibSP60max $sup2"
        sus100.text = "$vn $ibS100min $ml1 $ibS100max $ml2"
        sus200.text = "$vn $ibS200min $ml1 $ibS200max $ml2"
        t200.text = "$vn $ibT200min $tab1 $ibT200max $tab2"
        t400.text = "$vn $ibT400min $tab1 $ibT400max $tab2"
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