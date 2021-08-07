package am.therapy.hemolitic

import am.therapy.MainActivity
import am.therapy.R
import am.therapy.hemolitic.results.MaltoferActivity
import am.therapy.hemolitic.results.TotemaActivity
import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.motion.widget.MotionLayout
import androidx.core.content.ContextCompat
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import kotlin.math.roundToInt

class GEMActivity : AppCompatActivity() {

    lateinit var mAdView : AdView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.gem_second)

        val actionBar = supportActionBar
        supportActionBar?.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.ac_b_gem))
        actionBar!!.setHomeButtonEnabled(true)
        actionBar.setTitle(R.string.back_menu)
        actionBar.setDisplayHomeAsUpEnabled(true)

        mAdView = findViewById(R.id.adview_gem_second)
        val adRequest = AdRequest.Builder().build()
        mAdView.loadAd(adRequest)

        val ml = findViewById<MotionLayout>(R.id.choose_view_gem)
        ml.transitionToStart()
        val mal = findViewById<Button>(R.id.button_maltofer)
        val totem = findViewById<Button>(R.id.button_totema)
        val exit = findViewById<Button>(R.id.button_exit_gem)
        mal.setOnClickListener { maltofer() }
        totem.setOnClickListener { totema() }
        exit.setOnClickListener {
            val intent = Intent(this, MainGEMActivity::class.java)
            startActivity(intent)
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
        }
    }

    private fun maltofer() {
        val args = intent.extras
        val weight = args!!["gemW"].toString()
        val malMin = 2.5
        val malMax = 5
        var terMalMin = weight.toDouble() * malMin
        var terMalMax = (weight.toDouble() * malMax)
        if (terMalMin > 100) {
            terMalMin = 100.0
        }
        if (terMalMax > 300) {
            terMalMax = 300.0
        }
        val brMinMalSir10 = terMalMin / 10
        val minMalSir10 = (brMinMalSir10 * 10.0).roundToInt() / 10.0
        val minMalSir102rd = minMalSir10 / 2
        val brMinMalCap10 = terMalMin / 50
        val minMalCap10 = (brMinMalCap10 * 20).toInt()
        val minMalCap102rd = minMalCap10 / 2
        val brMaxMalSir10 = terMalMax / 10
        val maxMalSir10 = (brMaxMalSir10 * 10.0).roundToInt() / 10.0
        val maxMalSir102rd = maxMalSir10 / 2
        val brMaxMalCap10 = terMalMax / 50
        val maxMalCap10 = (brMaxMalCap10 * 20).toInt()
        val maxMalCap102rd = maxMalCap10 / 2
        val brMinMalTab100 = terMalMin / 100
        val minMalTab100 = (brMinMalTab100 * 10.0).roundToInt() / 10.0
        val brMaxMalTab100 = terMalMax / 100
        val maxMalTab100 = (brMaxMalTab100 * 10.0).roundToInt() / 10.0
        val intent = Intent(applicationContext, MaltoferActivity::class.java)
        intent.putExtra("sir_min_mal10", minMalSir10)
        intent.putExtra("sir_min_mal10_2rd", minMalSir102rd)
        intent.putExtra("sir_min_mal10_cap", minMalCap10)
        intent.putExtra("sir_min_mal10_cap_2rd", minMalCap102rd)
        intent.putExtra("sir_max_mal10", maxMalSir10)
        intent.putExtra("sir_max_mal10_2rd", maxMalSir102rd)
        intent.putExtra("sir_max_mal10_cap", maxMalCap10)
        intent.putExtra("sir_max_mal10_cap_2rd", maxMalCap102rd)
        intent.putExtra("tab_min_mal100", minMalTab100)
        intent.putExtra("tab_max_mal100", maxMalTab100)
        startActivity(intent)
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
    }

    private fun totema() {
        val args = intent.extras
        val weight = args!!["gemW"].toString()
        val totem = 3
        var terTotem = weight.toDouble() * totem
        if (terTotem > 50) {
            terTotem = 50.0
        }
        val brTotemAmp10 = terTotem * 10 / 50
        val totemAmp10 = (brTotemAmp10 * 10.0).roundToInt() / 10.0
        val totemAmp102rd = totemAmp10 / 2
        val brTotemAmp10R = totemAmp10 / 10
        val totemAmp10R = (brTotemAmp10R * 10.0).roundToInt() / 10.0
        val totemAmp10R2rd = totemAmp10R / 2
        val intent = Intent(applicationContext, TotemaActivity::class.java)
        intent.putExtra("totem_amp10", totemAmp10)
        intent.putExtra("totem_amp10_2rd", totemAmp102rd)
        intent.putExtra("totem_amp10_r", totemAmp10R)
        intent.putExtra("totem_amp10_r_2rd", totemAmp10R2rd)
        startActivity(intent)
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
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