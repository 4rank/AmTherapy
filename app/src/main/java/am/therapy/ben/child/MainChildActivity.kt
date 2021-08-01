package am.therapy.ben.child

import am.therapy.MainActivity
import am.therapy.R
import am.therapy.ben.standart.MainBenActivity
import android.annotation.SuppressLint
import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.text.TextUtils
import android.view.KeyEvent
import android.view.MenuItem
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.*
import android.widget.SeekBar.OnSeekBarChangeListener
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.motion.widget.MotionLayout
import androidx.core.content.ContextCompat
import androidx.core.text.HtmlCompat
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainChildActivity : AppCompatActivity() {

    private var rG: RadioGroup? = null
    private var alertDialog: AlertDialog? = null

    @SuppressLint("NonConstantResourceId", "WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ben_child_first)

        val actionBar = supportActionBar
        supportActionBar?.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.ac_b_ben))
        actionBar!!.setHomeButtonEnabled(true)
        actionBar.setDisplayHomeAsUpEnabled(true)

        val ml = findViewById<MotionLayout>(R.id.main_view_ben_child)
        ml.transitionToStart()
        val button = findViewById<Button>(R.id.button_ben_child)
        rG = findViewById(R.id.radioGroupChild_sex)
        val vvod = findViewById<EditText>(R.id.vVod_ben_child)
        val can1 = findViewById<TextView>(R.id.textView_benChild1)
        val can2 = findViewById<TextView>(R.id.textView_benChild3)
        val can3 = findViewById<TextView>(R.id.textView_benChild5)
        val can4 = findViewById<TextView>(R.id.textView_benChild11)
        val can5 = findViewById<TextView>(R.id.textView_benChild2)
        val at = findViewById<Button>(R.id.button_attention_benChild)
        val bnv = findViewById<BottomNavigationView>(R.id.bottomNav)
        val textSB = findViewById<TextView>(R.id.textView_seekBar)
        val sb = findViewById<SeekBar>(R.id.seekBar)
        can1.setOnClickListener { closeET() }
        can2.setOnClickListener { closeET() }
        can3.setOnClickListener { closeET() }
        can4.setOnClickListener { closeET() }
        can5.setOnClickListener { closeET() }
        button.setOnClickListener { start() }
        at.setOnClickListener { alertDialog!!.show() }
        val ad = getString(R.string.alert_ben)
        val adm1 = getText(R.string.alert_ben1)
        val adm2 = getText(R.string.alert_ben2)
        val adm3 = getText(R.string.alert_ben3)
        val adm4 = getText(R.string.alert_ben4)
        val mes1 = getText(R.string.ben_mes1)
        val mes2 = getText(R.string.ben_mes2)
        val mes3 = getText(R.string.ben_mes3)
        alertDialog = AlertDialog.Builder(this).create()
        alertDialog!!.setTitle(HtmlCompat.fromHtml("<font color='#026818'>$ad</font>",3))
        alertDialog!!.setMessage("""
$adm1
            
$adm2
            
$adm3
            
$adm4
            
            """.trimIndent())
        alertDialog!!.setButton(AlertDialog.BUTTON_POSITIVE, "OK") { _: DialogInterface?, _: Int -> alertDialog!!.cancel() }
        vvod.setOnKeyListener(View.OnKeyListener setOnKeyListener@{ _: View?, keyCode: Int, event: KeyEvent ->
            if (event.action == KeyEvent.ACTION_DOWN &&
                    keyCode == KeyEvent.KEYCODE_ENTER) {
                val imm = getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager
                imm.toggleSoftInput(InputMethodManager.HIDE_IMPLICIT_ONLY, 0)
                return@setOnKeyListener true
            }
            false
        })
        bnv.selectedItemId = R.id.secondActivity
        bnv.setOnNavigationItemSelectedListener { item: MenuItem ->
            when (item.itemId) {
                R.id.startActivity -> intent(MainBenActivity::class.java)
                R.id.secondActivity -> {
                }
            }
            true
        }
        sb.setOnSeekBarChangeListener(object : OnSeekBarChangeListener {
            @SuppressLint("SetTextI18n")
            override fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean) {
                if (progress < 2) {
                    textSB.text = "$progress $mes1"
                }
                if (progress in 2..4) {
                    textSB.text = "$progress $mes2"
                }
                if (progress in 5..12) {
                    textSB.text = "$progress $mes3"
                }
            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {}
            override fun onStopTrackingTouch(seekBar: SeekBar) {}
        })
    }

    private fun closeET() {
        val vvod = findViewById<EditText>(R.id.vVod_ben_child)
        if (TextUtils.isEmpty(vvod!!.text.toString())) {
            return
        }
        vvod.clearFocus()
        val imm = getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager
        imm.toggleSoftInput(InputMethodManager.HIDE_IMPLICIT_ONLY, 0)
    }

    fun start() {
        val vvod = findViewById<EditText>(R.id.vVod_ben_child)
        val sb = findViewById<SeekBar>(R.id.seekBar)
        if (TextUtils.isEmpty(vvod!!.text.toString())) {
            return
        }
        val weight = vvod.text.toString().toInt()
        val sbMouth = sb!!.progress
        val checked = rG!!.checkedRadioButtonId
        val intent = Intent(applicationContext, ChildActivity::class.java)
        intent.putExtra("age_child", sbMouth)
        intent.putExtra("weight_child", weight)
        intent.putExtra("sex_child", checked)
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

    fun intent(activity: Class<*>?) {
        val intent = Intent(this, activity)
        startActivity(intent)
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
    }

    override fun onBackPressed() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
    }
}