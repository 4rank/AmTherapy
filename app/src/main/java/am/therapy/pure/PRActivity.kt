package am.therapy.pure

import am.therapy.MainActivity
import am.therapy.R
import am.therapy.pure.results.IbuprofActivity
import am.therapy.pure.results.ParacetActivity
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

class PRActivity : AppCompatActivity() {

    lateinit var mAdView : AdView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pr_second)

        val actionBar = supportActionBar
        supportActionBar?.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.ac_b_pr))
        actionBar!!.setHomeButtonEnabled(true)
        actionBar.setDisplayHomeAsUpEnabled(true)

        mAdView = findViewById(R.id.adview_pr_second)
        val adRequest = AdRequest.Builder().build()
        mAdView.loadAd(adRequest)

        val ml = findViewById<MotionLayout>(R.id.choose_view_pr)
        ml.transitionToStart()
        val par = findViewById<Button>(R.id.button_paracetamoli)
        val ib = findViewById<Button>(R.id.button_ibuprofeni)
        val exit = findViewById<Button>(R.id.button_exit_pr)
        par.setOnClickListener { paracetamol() }
        ib.setOnClickListener { ibuprofen() }
        exit.setOnClickListener {
            val intent = Intent(this, MainPRActivity::class.java)
            startActivity(intent)
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
        }
    }

    private fun paracetamol() {
        val args = intent.extras
        val weight = args!!["prmW"].toString()
        val paracetMin = 10
        val paracetMax = 15
        var terParacetMin = weight.toDouble() * paracetMin
        if (terParacetMin > 350) {
            terParacetMin = 350.0
        }
        var terParacetMax = weight.toDouble() * paracetMax
        if (terParacetMax > 500) {
            terParacetMax = 500.0
        }
        val brMinParacetSup80 = terParacetMin / 80
        val minParacetSup80 = (brMinParacetSup80 * 10.0).roundToInt() / 10.0
        val brMaxParacetSup80 = terParacetMax / 80
        val maxParacetSup80 = (brMaxParacetSup80 * 10.0).roundToInt() / 10.0
        val brMinParacetSup125 = terParacetMin / 125
        val minParacetSup125 = (brMinParacetSup125 * 10.0).roundToInt() / 10.0
        val brMaxParacetSup125 = terParacetMax / 125
        val maxParacetSup125 = (brMaxParacetSup125 * 10.0).roundToInt() / 10.0
        val brMinParacetSup150 = terParacetMin / 150
        val minParacetSup150 = (brMinParacetSup150 * 10.0).roundToInt() / 10.0
        val brMaxParacetSup150 = terParacetMax / 150
        val maxParacetSup150 = (brMaxParacetSup150 * 10.0).roundToInt() / 10.0
        val brMinParacetSup250 = terParacetMin / 250
        val minParacetSup250 = (brMinParacetSup250 * 10.0).roundToInt() / 10.0
        val brMaxParacetSup250 = terParacetMax / 250
        val maxParacetSup250 = (brMaxParacetSup250 * 10.0).roundToInt() / 10.0
        val brMinParacetSus120 = terParacetMin * 5 / 120
        val minParacetSus120 = (brMinParacetSus120 * 10.0).roundToInt() / 10.0
        val brMaxParacetSus120 = terParacetMax * 5 / 120
        val maxParacetSus120 = (brMaxParacetSus120 * 10.0).roundToInt() / 10.0
        val brMinParacetSus30 = terParacetMin / 30
        val minParacetSus30 = (brMinParacetSus30 * 10.0).roundToInt() / 10.0
        val brMaxParacetSus30 = terParacetMax / 30
        val maxParacetSus30 = (brMaxParacetSus30 * 10.0).roundToInt() / 10.0
        val brMinParacetTab200 = terParacetMin / 200
        val minParacetTab200 = (brMinParacetTab200 * 10.0).roundToInt() / 10.0
        val brMaxParacetTab200 = terParacetMax / 200
        val maxParacetTab200 = (brMaxParacetTab200 * 10.0).roundToInt() / 10.0
        val brMinParacetTab500 = terParacetMin / 500
        val minParacetTab500 = (brMinParacetTab500 * 10.0).roundToInt() / 10.0
        val brMaxParacetTab500 = terParacetMax / 500
        val maxParacetTab500 = (brMaxParacetTab500 * 10.0).roundToInt() / 10.0
        val intent = Intent(applicationContext, ParacetActivity::class.java)
        intent.putExtra("sup_min_par80", minParacetSup80)
        intent.putExtra("sup_max_par80", maxParacetSup80)
        intent.putExtra("sup_min_par125", minParacetSup125)
        intent.putExtra("sup_max_par125", maxParacetSup125)
        intent.putExtra("sup_min_par150", minParacetSup150)
        intent.putExtra("sup_max_par150", maxParacetSup150)
        intent.putExtra("sup_min_par250", minParacetSup250)
        intent.putExtra("sup_max_par250", maxParacetSup250)
        intent.putExtra("sus_min_par120", minParacetSus120)
        intent.putExtra("sus_max_par120", maxParacetSus120)
        intent.putExtra("sus_min_par30", minParacetSus30)
        intent.putExtra("sus_max_par30", maxParacetSus30)
        intent.putExtra("tab_min_par200", minParacetTab200)
        intent.putExtra("tab_max_par200", maxParacetTab200)
        intent.putExtra("tab_min_par500", minParacetTab500)
        intent.putExtra("tab_max_par500", maxParacetTab500)
        startActivity(intent)
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
    }

    private fun ibuprofen() {
        val args = intent.extras
        val weight = args!!["prmW"].toString()
        val ibufMin = 5
        val ibufMax = 10
        var terIbufMin = weight.toDouble() * ibufMin
        if (terIbufMin > 200) {
            terIbufMin = 200.0
        }
        var terIbufMax = weight.toDouble() * ibufMax
        if (terIbufMax > 400) {
            terIbufMax = 400.0
        }
        val brMinIbufSup60 = terIbufMin / 60
        val minIbufSup60 = (brMinIbufSup60 * 10.0).roundToInt() / 10.0
        val brMaxIbufSup60 = terIbufMax / 60
        val maxIbufSup60 = (brMaxIbufSup60 * 10.0).roundToInt() / 10.0
        val brMinIbufSus100 = terIbufMin * 5 / 100
        val minIbufSus100 = (brMinIbufSus100 * 10.0).roundToInt() / 10.0
        val brMaxIbufSus100 = terIbufMax * 5 / 100
        val maxIbufSus100 = (brMaxIbufSus100 * 10.0).roundToInt() / 10.0
        val brMinIbufSus200 = terIbufMin * 5 / 200
        val minIbufSus200 = (brMinIbufSus200 * 10.0).roundToInt() / 10.0
        val brMaxIbufSus200 = terIbufMax * 5 / 200
        val maxIbufSus200 = (brMaxIbufSus200 * 10.0).roundToInt() / 10.0
        val brMinIbufTab200 = terIbufMin / 200
        val minIbufTab200 = (brMinIbufTab200 * 10.0).roundToInt() / 10.0
        val brMaxIbufTab200 = terIbufMax / 200
        val maxIbufTab200 = (brMaxIbufTab200 * 10.0).roundToInt() / 10.0
        val brMinIbufTab400 = terIbufMin / 400
        val minIbufTab400 = (brMinIbufTab400 * 10.0).roundToInt() / 10.0
        val brMaxIbufTab400 = terIbufMax / 400
        val maxIbufTab400 = (brMaxIbufTab400 * 10.0).roundToInt() / 10.0
        val intent = Intent(applicationContext, IbuprofActivity::class.java)
        intent.putExtra("sup_min_ibuf60", minIbufSup60)
        intent.putExtra("sup_max_ibuf60", maxIbufSup60)
        intent.putExtra("sus_min_ibuf100", minIbufSus100)
        intent.putExtra("sus_max_ibuf100", maxIbufSus100)
        intent.putExtra("sus_min_ibuf200", minIbufSus200)
        intent.putExtra("sus_max_ibuf200", maxIbufSus200)
        intent.putExtra("tab_min_ibuf200", minIbufTab200)
        intent.putExtra("tab_max_ibuf200", maxIbufTab200)
        intent.putExtra("tab_min_ibuf500", minIbufTab400)
        intent.putExtra("tab_max_ibuf500", maxIbufTab400)
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