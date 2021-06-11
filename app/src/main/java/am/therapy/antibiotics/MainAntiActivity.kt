package am.therapy.antibiotics

import am.therapy.BuildConfig
import am.therapy.MainActivity
import am.therapy.R
import am.therapy.dbhelper.DBHelper
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
import com.google.android.gms.ads.*


class MainAntiActivity : AppCompatActivity() {

    private var alertDialog: AlertDialog? = null
    private var dbHelper: DBHelper? = null
    lateinit var mAdView : AdView

    @SuppressLint("WrongConstant", "HardwareIds")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.anti_first)

        mAdView = findViewById(R.id.adview_ab_first)
        val adRequest = AdRequest.Builder().build()
        mAdView.loadAd(adRequest)

        val actionBar = supportActionBar
        supportActionBar?.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.ac_b_anti))
        actionBar!!.setHomeButtonEnabled(true)
        actionBar.setDisplayHomeAsUpEnabled(true)
        val ml = findViewById<MotionLayout>(R.id.main_view_ab)
        ml.transitionToStart()
        val vVod = findViewById<EditText>(R.id.vVodWeight)
        val button = findViewById<Button>(R.id.button_start_ab)
        val can1 = findViewById<TextView>(R.id.textView_am1)
        val can2 = findViewById<TextView>(R.id.textView_am2)
        val can3 = findViewById<TextView>(R.id.textView_am3)
        val can4 = findViewById<TextView>(R.id.textView_am4)
        val at = findViewById<Button>(R.id.button_attention_ab)
        dbHelper = DBHelper(this)
        button.setOnClickListener { start() }
        can1.setOnClickListener { closeET() }
        can2.setOnClickListener { closeET() }
        can3.setOnClickListener { closeET() }
        can4.setOnClickListener { closeET() }
        at.setOnClickListener { alertDialog!!.show() }
        var amoxiTer = "60"
        var amoxiMax = "2000"
        var claryTer = "15"
        var claryMax = "1000"
        var aziTer = "10"
        var aziMax = "500"
        var cefurTer = "15"
        var cefurMax = "1000"
        var cefdinirTer = "14"
        var cefdinirMax = "600"
        var cefiximeTer = "8"
        var cefiximeMax = "400"
        var amoxiclavTer = "45"
        var amoxiclavMax = "2000"
        val database = dbHelper!!.writableDatabase
        @SuppressLint("Recycle") val cursor = database.query(DBHelper.TABLE_CONTACTS, null, null, null, null, null, null)
        if (cursor != null) if (cursor.moveToFirst()) {
            do {
                val dbAmoxiter = cursor.getColumnIndex(DBHelper.DOZE_TER_AMOXI).toString()
                val dbAmoximax = cursor.getColumnIndex(DBHelper.DOZE_MAX_AMOXI).toString()
                val dbClaryter = cursor.getColumnIndex(DBHelper.DOZE_TER_CLARI).toString()
                val dbClarymax = cursor.getColumnIndex(DBHelper.DOZE_MAX_CLARI).toString()
                val dbAziter = cursor.getColumnIndex(DBHelper.DOZE_TER_AZI).toString()
                val dbAzimax = cursor.getColumnIndex(DBHelper.DOZE_MAX_AZI).toString()
                val dbCefurter = cursor.getColumnIndex(DBHelper.DOZE_TER_CEFUR).toString()
                val dbCefurmax = cursor.getColumnIndex(DBHelper.DOZE_MAX_CEFUR).toString()
                val dbCefdinirter = cursor.getColumnIndex(DBHelper.DOZE_TER_CEFDINIR).toString()
                val dbCefdinirmax = cursor.getColumnIndex(DBHelper.DOZE_MAX_CEFDINIR).toString()
                val dbCefiximeter = cursor.getColumnIndex(DBHelper.DOZE_TER_CEFIXIME).toString()
                val dbCefiximemax = cursor.getColumnIndex(DBHelper.DOZE_MAX_CEFIXIME).toString()
                val dbAmoxiclavter = cursor.getColumnIndex(DBHelper.DOZE_TER_AMOXICLAV).toString()
                val dbAmoxiclavmax = cursor.getColumnIndex(DBHelper.DOZE_MAX_AMOXICLAV).toString()
                amoxiTer = cursor.getString(dbAmoxiter.toInt())
                amoxiMax = cursor.getString(dbAmoximax.toInt())
                claryTer = cursor.getString(dbClaryter.toInt())
                claryMax = cursor.getString(dbClarymax.toInt())
                aziTer = cursor.getString(dbAziter.toInt())
                aziMax = cursor.getString(dbAzimax.toInt())
                cefurTer = cursor.getString(dbCefurter.toInt())
                cefurMax = cursor.getString(dbCefurmax.toInt())
                cefdinirTer = cursor.getString(dbCefdinirter.toInt())
                cefdinirMax = cursor.getString(dbCefdinirmax.toInt())
                cefiximeTer = cursor.getString(dbCefiximeter.toInt())
                cefiximeMax = cursor.getString(dbCefiximemax.toInt())
                amoxiclavTer = cursor.getString(dbAmoxiclavter.toInt())
                amoxiclavMax = cursor.getString(dbAmoxiclavmax.toInt())
            } while (cursor.moveToNext())
        }
        if (BuildConfig.DEBUG && cursor == null) {
            error("Assertion failed")
        }
        cursor!!.close()
        dbHelper!!.close()
        alertDialog = AlertDialog.Builder(this).create()
        alertDialog!!.setTitle(HtmlCompat.fromHtml("<font color='#0489B1'>Дозировки препаратов</font>", 1))
        alertDialog!!.setMessage("""Терапевтические дозировки антибактериальных препаратов:

•Amoxicillinum = $amoxiTer мг/кг.
Max суточная = $amoxiMax мг

•Clarithromycin = $claryTer мг/кг.
Max суточная = $claryMax мг

•Azithromycinum = $aziTer мг/кг.
Max суточная = $aziMax мг

•Cefuroximum = $cefurTer мг/кг.
Max суточная = $cefurMax мг

•Cefdinir = $cefdinirTer мг/кг.
Max суточная = $cefdinirMax мг

•Cefixime = $cefiximeTer мг/кг.
Max суточная = $cefiximeMax мг

•Amoxicillin/clavulanic acid = $amoxiclavTer мг/кг.
Max суточная = $amoxiclavMax мг
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
        val vVod = findViewById<EditText>(R.id.vVodWeight)
        if (TextUtils.isEmpty(vVod!!.text.toString())) {
            return
        }
        vVod.clearFocus()
        val imm = getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager
        imm.toggleSoftInput(InputMethodManager.HIDE_IMPLICIT_ONLY, 0)
    }

    fun start() {
        val vVod = findViewById<EditText>(R.id.vVodWeight)
        if (TextUtils.isEmpty(vVod!!.text.toString())) {
            return
        }
        val weight = vVod.text.toString().toDouble()
        val intent = Intent(applicationContext, AntiActivity::class.java)
        intent.putExtra("chW", weight)
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