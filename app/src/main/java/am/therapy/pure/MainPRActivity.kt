package am.therapy.pure

import am.therapy.MainActivity
import am.therapy.R
import android.annotation.SuppressLint
import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.text.TextUtils
import android.view.KeyEvent
import android.view.MenuItem
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.motion.widget.MotionLayout
import androidx.core.content.ContextCompat
import androidx.core.text.HtmlCompat
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView

class MainPRActivity : AppCompatActivity() {

    lateinit var mAdView : AdView

    private var alertDialog: AlertDialog? = null

    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pr_first)

        val actionBar = supportActionBar
        supportActionBar?.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.ac_b_pr))
        actionBar!!.setHomeButtonEnabled(true)
        actionBar.setDisplayHomeAsUpEnabled(true)

        mAdView = findViewById(R.id.adview_pr_first)
        val adRequest = AdRequest.Builder().build()
        mAdView.loadAd(adRequest)

        val ml = findViewById<MotionLayout>(R.id.main_view_pr)
        ml.transitionToStart()
        val vVod = findViewById<EditText>(R.id.vVodWeight_pr)
        val button = findViewById<Button>(R.id.button_start_pr)
        val can1 = findViewById<TextView>(R.id.textView_pm1)
        val can2 = findViewById<TextView>(R.id.textView_pm2)
        val can3 = findViewById<TextView>(R.id.textView_pm3)
        val can4 = findViewById<TextView>(R.id.textView_pm4)
        val at = findViewById<Button>(R.id.button_attention_pr)
        button.setOnClickListener { start() }
        can1.setOnClickListener { closeET() }
        can2.setOnClickListener { closeET() }
        can3.setOnClickListener { closeET() }
        can4.setOnClickListener { closeET() }
        at.setOnClickListener { alertDialog!!.show() }
        val ad = getString(R.string.alert_dose)
        val adm = getString(R.string.pr_alert1)
        val ab1 = getText(R.string.pr_alert2)
        val ab2 = getText(R.string.pr_alert3)
        alertDialog = AlertDialog.Builder(this).create()
        alertDialog!!.setTitle(HtmlCompat.fromHtml("<font color='#FDD910'>$ad</font>", 5))
        alertDialog!!.setMessage("""$adm

$ab1

$ab2
""")
        alertDialog!!.setButton(AlertDialog.BUTTON_POSITIVE, "OK") { _: DialogInterface?, _: Int -> alertDialog!!.cancel() }
        vVod.setOnKeyListener { _: View?, keyCode: Int, event: KeyEvent ->
            if (event.action == KeyEvent.ACTION_DOWN &&
                    keyCode == KeyEvent.KEYCODE_ENTER) {
                val imm = getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager
                imm.toggleSoftInput(InputMethodManager.HIDE_IMPLICIT_ONLY, 0)
                return@setOnKeyListener true
            }
            false
        }
    }

    private fun closeET() {
        val vVod = findViewById<EditText>(R.id.vVodWeight_pr)
        if (TextUtils.isEmpty(vVod!!.text.toString())) {
            return
        }
        vVod.clearFocus()
        val imm = getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager
        imm.toggleSoftInput(InputMethodManager.HIDE_IMPLICIT_ONLY, 0)
    }

    fun start() {
        val vVod = findViewById<EditText>(R.id.vVodWeight_pr)
        if (TextUtils.isEmpty(vVod!!.text.toString())) {
            return
        }
        val weight = vVod.text.toString().toDouble()
        val intent = Intent(applicationContext, PRActivity::class.java)
        intent.putExtra("prmW", weight)
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
        return true
    }

    override fun onBackPressed() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
    }

}