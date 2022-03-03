package am.therapy.hemolitic

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

class MainGEMActivity : AppCompatActivity() {

    lateinit var mAdView : AdView

    private var alertDialog: AlertDialog? = null

    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.gem_first)

        val actionBar = supportActionBar
        supportActionBar?.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.ac_b_gem))
        actionBar!!.setHomeButtonEnabled(true)
        actionBar.setTitle(R.string.back_menu)
        actionBar.setDisplayHomeAsUpEnabled(true)


        val ml = findViewById<MotionLayout>(R.id.main_view_gem)
        ml.transitionToStart()
        val vVod = findViewById<EditText>(R.id.vVodWeight_gem)
        val button = findViewById<Button>(R.id.button_start_gem)
        val can1 = findViewById<TextView>(R.id.textView_gm1)
        val can2 = findViewById<TextView>(R.id.textView_gm2)
        val can3 = findViewById<TextView>(R.id.textView_gm3)
        val can4 = findViewById<TextView>(R.id.textView_gm4)
        val at = findViewById<Button>(R.id.button_attention_gem)
        button.setOnClickListener { start() }
        can1.setOnClickListener { closeET() }
        can2.setOnClickListener { closeET() }
        can3.setOnClickListener { closeET() }
        can4.setOnClickListener { closeET() }
        at.setOnClickListener { alertDialog!!.show() }
        val ad = getString(R.string.alert_dose)
        val ad1 = getText(R.string.gem_ad1)
        val ad2 = getText(R.string.gem_ad2)
        val ad3 = getText(R.string.gem_ad3)
        alertDialog = AlertDialog.Builder(this).create()
        alertDialog!!.setTitle(HtmlCompat.fromHtml("<font color='#7C02BA'>$ad</font>",4))
        alertDialog!!.setMessage("""$ad1

$ad2

$ad3
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
        val vVod = findViewById<EditText>(R.id.vVodWeight_gem)
        if (TextUtils.isEmpty(vVod!!.text.toString())) {
            return
        }
        vVod.clearFocus()
        val imm = getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager
        imm.toggleSoftInput(InputMethodManager.HIDE_IMPLICIT_ONLY, 0)
    }

    fun start() {
        val vVod = findViewById<EditText>(R.id.vVodWeight_gem)
        if (TextUtils.isEmpty(vVod!!.text.toString())) {
            return
        }
        val weight = vVod.text.toString().toDouble()
        val intent = Intent(applicationContext, GEMActivity::class.java)
        intent.putExtra("gemW", weight)
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