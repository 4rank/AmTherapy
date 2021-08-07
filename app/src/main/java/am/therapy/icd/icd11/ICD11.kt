package am.therapy.icd.icd11

import am.therapy.R
import android.annotation.SuppressLint
import android.app.ActivityOptions
import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.text.HtmlCompat
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView

class ICD11 : AppCompatActivity() {

    private var alertDialog: AlertDialog? = null
    lateinit var mAdView : AdView

    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.icd11)
        val text = findViewById<TextView>(R.id.icd11_tv_title)
        val but = findViewById<Button>(R.id.button_attention_icd11)

        mAdView = findViewById(R.id.adview_icd11)
        val adRequest = AdRequest.Builder().build()
        mAdView.loadAd(adRequest)

        val actionBar = supportActionBar
        supportActionBar?.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.ac_b_anti))
        actionBar!!.setHomeButtonEnabled(true)
        actionBar.setTitle(R.string.back_menu_icd)
        actionBar.setDisplayHomeAsUpEnabled(true)
        val args = intent.extras
        val id = args!!["id_icd11"] as Int
        val title = getString(id)
        text.text = title
        but.setOnClickListener{ alertDialog!!.show() }
        alertDialog = AlertDialog.Builder(this).create()
        alertDialog!!.setTitle(HtmlCompat.fromHtml("<font color='#0489B1'>МКБ-11</font>", 11))
        alertDialog!!.setMessage("""
            Звездочкой (-*) отмечены «неопределенные» остаточные категориии.
            
            """.trimIndent())
        alertDialog!!.setButton(AlertDialog.BUTTON_POSITIVE, "Закрыть") { _: DialogInterface?, _: Int -> alertDialog!!.cancel() }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            startActivity(Intent(this, MainICD11::class.java), ActivityOptions.makeSceneTransitionAnimation(this).toBundle())
            return true
        }
        return true
    }
}