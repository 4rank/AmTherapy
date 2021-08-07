package am.therapy.hemolitic.results

import am.therapy.MainActivity
import am.therapy.R
import am.therapy.hemolitic.MainGEMActivity
import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat

class MaltoferActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.gem_res_maltofer)

        val actionBar = supportActionBar
        supportActionBar?.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.ac_b_gem))
        actionBar!!.setHomeButtonEnabled(true)
        actionBar.setTitle(R.string.back_menu)
        actionBar.setDisplayHomeAsUpEnabled(true)

        val args = intent.extras
        val malS10min = args!!["sir_min_mal10"] as Double
        val mals10min2rd = args["sir_min_mal10_2rd"] as Double
        val mals10minCap = args["sir_min_mal10_cap"] as Int
        val mals10minCap2rd = args["sir_min_mal10_cap_2rd"] as Int
        val malS10max = args["sir_max_mal10"] as Double
        val mals10max2rd = args["sir_max_mal10_2rd"] as Double
        val mals10maxCap = args["sir_max_mal10_cap"] as Int
        val mals10maxCap2rd = args["sir_max_mal10_cap_2rd"] as Int
        val malT100min = args["tab_min_mal100"] as Double
        val malT100max = args["tab_max_mal100"] as Double
        val cap50 = findViewById<TextView>(R.id.text_mal_cap_50)
        val sir10 = findViewById<TextView>(R.id.text_mal_sir_100)
        val tab100 = findViewById<TextView>(R.id.text_mal_tab_100)
        val pd = getString(R.string.gem_pd)
        val ld = getString(R.string.gem_ld)
        val cap1 = getString(R.string.gem_cap1rd)
        val cap2 = getString(R.string.gem_cap2rd)
        val ml1 = getString(R.string.gem_ml1rd)
        val ml2 = getString(R.string.gem_ml2rd)
        val tab = getString(R.string.gem_tab1rd)
        cap50.text = """$pd $mals10minCap $cap1 $mals10minCap2rd $cap2
            |$ld $mals10maxCap $cap1 $mals10maxCap2rd $cap2""".trimMargin()
        sir10.text = """
            $pd ${malS10min}$ml1 ${mals10min2rd}$ml2
            $ld ${malS10max}$ml1 ${mals10max2rd}$ml2
            """.trimIndent()
        tab100.text = """$pd $malT100min $tab
            |$ld $malT100max $tab""".trimMargin()
        val main = findViewById<Button>(R.id.button_else_mal)
        main.setOnClickListener {
            val intent = Intent(this, MainGEMActivity::class.java)
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