package am.therapy.weight

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

class WeightActivity : AppCompatActivity() {

    lateinit var mAdView : AdView

    private var alertDialog: AlertDialog? = null

    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.weight_first)

        val actionBar = supportActionBar
        supportActionBar?.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.ac_b_weight))
        actionBar!!.setHomeButtonEnabled(true)
        actionBar.setTitle(R.string.back_menu)
        actionBar.setDisplayHomeAsUpEnabled(true)

        val ml = findViewById<MotionLayout>(R.id.main_view_weight)
        ml.transitionToStart()
        val vVod = findViewById<EditText>(R.id.vVod_weight)
        val button = findViewById<Button>(R.id.button_wei)
        val can1 = findViewById<TextView>(R.id.start_wei_text)
        val can2 = findViewById<TextView>(R.id.textView_wm1)
        val can3 = findViewById<TextView>(R.id.textView_wm2)
        val at = findViewById<Button>(R.id.button_attention_wei)
        button.setOnClickListener { start() }
        can1.setOnClickListener { closeET() }
        can2.setOnClickListener { closeET() }
        can3.setOnClickListener { closeET() }
        at.setOnClickListener { alertDialog!!.show() }
        val ad = getString(R.string.weight_main)
        val adm = getText(R.string.weight_text)
        alertDialog = AlertDialog.Builder(this).create()
        alertDialog!!.setTitle(HtmlCompat.fromHtml("<font color='#8C0623'>$ad</font>",6))
        alertDialog!!.setMessage(adm)
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
        val vVod = findViewById<EditText>(R.id.vVod_weight)
        if (TextUtils.isEmpty(vVod!!.text.toString())) {
            return
        }
        vVod.clearFocus()
        val imm = getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager
        imm.toggleSoftInput(InputMethodManager.HIDE_IMPLICIT_ONLY, 0)
    }

    fun start() {
        val vVod = findViewById<EditText>(R.id.vVod_weight)
        if (TextUtils.isEmpty(vVod!!.text.toString())) {
            return
        }
        val weight = vVod.text.toString().toInt()
        var mesW1 = 0
        var mesW2 = 0
        var mesW3 = 0
        var mesW4 = 0
        var mesW5 = 0
        var mesW6 = 0
        var mesW7 = 0
        var mesW8 = 0
        var mesW9 = 0
        var mesW10 = 0
        var mesW11 = 0
        var mesW12 = 0
        if (weight < 1000) {
            mesW1 = weight + 180
            mesW2 = mesW1 + 400
            mesW3 = mesW2 + 650
            mesW4 = mesW3 + 600
            mesW5 = mesW4 + 550
            mesW6 = mesW5 + 750
            mesW7 = mesW6 + 500
            mesW8 = mesW7 + 500
            mesW9 = mesW8 + 500
            mesW10 = mesW9 + 450
            mesW11 = mesW10 + 300
            mesW12 = mesW11 + 450
        }
        if (weight in 1000..1499) {
            mesW1 = weight + 190
            mesW2 = mesW1 + 650
            mesW3 = mesW2 + 650
            mesW4 = mesW3 + 650
            mesW5 = mesW4 + 750
            mesW6 = mesW5 + 800
            mesW7 = mesW6 + 750
            mesW8 = mesW7 + 600
            mesW9 = mesW8 + 550
            mesW10 = mesW9 + 500
            mesW11 = mesW10 + 300
            mesW12 = mesW11 + 350
        }
        if (weight in 1500..1999) {
            mesW1 = weight + 190
            mesW2 = mesW1 + 750
            mesW3 = mesW2 + 750
            mesW4 = mesW3 + 850
            mesW5 = mesW4 + 800
            mesW6 = mesW5 + 700
            mesW7 = mesW6 + 600
            mesW8 = mesW7 + 700
            mesW9 = mesW8 + 450
            mesW10 = mesW9 + 400
            mesW11 = mesW10 + 500
            mesW12 = mesW11 + 400
        }
        if (weight in 2000..2500) {
            mesW1 = weight + 300
            mesW2 = mesW1 + 800
            mesW3 = mesW2 + 800
            mesW4 = mesW3 + 750
            mesW5 = mesW4 + 700
            mesW6 = mesW5 + 700
            mesW7 = mesW6 + 700
            mesW8 = mesW7 + 700
            mesW9 = mesW8 + 700
            mesW10 = mesW9 + 400
            mesW11 = mesW10 + 400
            mesW12 = mesW11 + 350
        }
        if (weight > 2500) {
            mesW1 = weight + 600
            mesW2 = mesW1 + 800
            mesW3 = mesW2 + 800
            mesW4 = mesW3 + 750
            mesW5 = mesW4 + 700
            mesW6 = mesW5 + 650
            mesW7 = mesW6 + 600
            mesW8 = mesW7 + 550
            mesW9 = mesW8 + 500
            mesW10 = mesW9 + 450
            mesW11 = mesW10 + 400
            mesW12 = mesW11 + 350
        }
        val intent = Intent(applicationContext, WeightActivityRes::class.java)
        intent.putExtra("m1", mesW1)
        intent.putExtra("m2", mesW2)
        intent.putExtra("m3", mesW3)
        intent.putExtra("m4", mesW4)
        intent.putExtra("m5", mesW5)
        intent.putExtra("m6", mesW6)
        intent.putExtra("m7", mesW7)
        intent.putExtra("m8", mesW8)
        intent.putExtra("m9", mesW9)
        intent.putExtra("m10", mesW10)
        intent.putExtra("m11", mesW11)
        intent.putExtra("m12", mesW12)
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