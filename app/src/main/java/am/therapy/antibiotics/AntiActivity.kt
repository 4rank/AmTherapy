package am.therapy.antibiotics

import am.therapy.BuildConfig
import am.therapy.MainActivity
import am.therapy.R
import am.therapy.antibiotics.results.*
import am.therapy.dbhelper.DBHelper
import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.motion.widget.MotionLayout
import androidx.core.content.ContextCompat
import kotlin.math.roundToInt

open class AntiActivity : AppCompatActivity() {

    private var dbHelper: DBHelper? = null

    private var amoxiTer = 60
    private var amoxiMax = 2000
    private var claryTer = 15
    private var claryMax = 1000
    private var aziTer = 10
    private var aziMax = 500
    private var cefurTer = 15
    private var cefurMax = 1000
    private var cefdinirTer = 14
    private var cefdinirMax = 600
    private var cefiximeTer = 8
    private var cefiximeMax = 400
    private var amoxiclavTer = 45
    private var amoxiclavMax = 2000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.anti_second)

        val actionBar = supportActionBar
        supportActionBar?.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.ac_b_anti))
        actionBar!!.setHomeButtonEnabled(true)
        actionBar.setDisplayHomeAsUpEnabled(true)

        val ml = findViewById<MotionLayout>(R.id.choose_view_ab)
        ml.transitionToStart()
        val amoxi = findViewById<Button>(R.id.button_amoxi)
        val clari = findViewById<Button>(R.id.button_clari)
        val azi = findViewById<Button>(R.id.button_azi)
        val cefur = findViewById<Button>(R.id.button_cefur)
        val cefdinir = findViewById<Button>(R.id.button_cefdinir)
        val cefixime = findViewById<Button>(R.id.button_cefixime)
        val amoxClar = findViewById<Button>(R.id.button_amox_clav)
        val exit = findViewById<Button>(R.id.button_exit)
        dbHelper = DBHelper(this)
        amoxi.setOnClickListener { amoxicillini() }
        clari.setOnClickListener { clarytro() }
        azi.setOnClickListener { azitro() }
        cefur.setOnClickListener { cefuroxim() }
        cefdinir.setOnClickListener { cefdinir() }
        cefixime.setOnClickListener { cefixim() }
        amoxClar.setOnClickListener { amoxiclav() }
        exit.setOnClickListener { exit() }
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

    private fun amoxicillini() {
        val database = dbHelper!!.writableDatabase
        @SuppressLint("Recycle") val cursor = database.query(DBHelper.TABLE_CONTACTS, null, null, null, null, null, null)
        if (cursor != null) if (cursor.moveToFirst()) {
            do {
                val dbAmoxiTer = cursor.getColumnIndex(DBHelper.DOZE_TER_AMOXI)
                val dbAmoxiMax = cursor.getColumnIndex(DBHelper.DOZE_MAX_AMOXI)
                amoxiTer = cursor.getString(dbAmoxiTer).toInt()
                amoxiMax = cursor.getString(dbAmoxiMax).toInt()
            } while (cursor.moveToNext())
        }
        if (BuildConfig.DEBUG && cursor == null) {
            error("Assertion failed")
        }
        cursor!!.close()
        dbHelper!!.close()
        val args = intent.extras
        val weight = args!!["chW"].toString()
        val amoxiD = amoxiTer
        var terAmoxi = weight.toDouble() * amoxiD
        if (terAmoxi > amoxiMax) {
            terAmoxi = amoxiMax.toDouble()
        }
        val brAmoxSus125 = terAmoxi * 5 / 125 / 2
        val amoxSus1252rd = (brAmoxSus125 * 10.0).roundToInt() / 10.0
        val brAmoxSus1253rd = terAmoxi * 5 / 125 / 3
        val amoxSus1253rd = (brAmoxSus1253rd * 10.0).roundToInt() / 10.0
        val brAmoxSus250 = terAmoxi * 5 / 250 / 2
        val amoxSus2502rd = (brAmoxSus250 * 10.0).roundToInt() / 10.0
        val brAmoxSus2503rd = terAmoxi * 5 / 250 / 3
        val amoxSus2503rd = (brAmoxSus2503rd * 10.0).roundToInt() / 10.0
        val amoxTab250 = terAmoxi / 250
        val amoxTab500 = terAmoxi / 500
        val amoxTab750 = terAmoxi / 750
        val amoxTab1000 = terAmoxi / 1000
        val brAmoxTab250res2rd = amoxTab250 / 2
        val amoxTab250res2rd = (brAmoxTab250res2rd * 10.0).roundToInt() / 10.0
        val brAmoxTab250res3rd = amoxTab250 / 3
        val amoxTab250res3rd = (brAmoxTab250res3rd * 10.0).roundToInt() / 10.0
        val brAmoxTab500res2rd = amoxTab500 / 2
        val amoxTab500res2rd = (brAmoxTab500res2rd * 10.0).roundToInt() / 10.0
        val brAmoxTab500res3rd = amoxTab500 / 3
        val amoxTab500res3rd = (brAmoxTab500res3rd * 10.0).roundToInt() / 10.0
        val brAmoxTab750res2rd = amoxTab750 / 2
        val amoxTab750res2rd = (brAmoxTab750res2rd * 10.0).roundToInt() / 10.0
        val brAmoxTab750res3rd = amoxTab750 / 3
        val amoxTab750res3rd = (brAmoxTab750res3rd * 10.0).roundToInt() / 10.0
        val brAmoxTab1000res2rd = amoxTab1000 / 2
        val amoxTab1000res2rd = (brAmoxTab1000res2rd * 10.0).roundToInt() / 10.0
        val intent = Intent(applicationContext, AmoxiActivity::class.java)
        intent.putExtra("sus_am125", amoxSus1252rd)
        intent.putExtra("sus_am3rd125", amoxSus1253rd)
        intent.putExtra("sus_am250", amoxSus2502rd)
        intent.putExtra("sus_am2503rd", amoxSus2503rd)
        intent.putExtra("tab_am2502rd", amoxTab250res2rd)
        intent.putExtra("tab_am2503rd", amoxTab250res3rd)
        intent.putExtra("tab_am5002rd", amoxTab500res2rd)
        intent.putExtra("tab_am5003rd", amoxTab500res3rd)
        intent.putExtra("tab_am7502rd", amoxTab750res2rd)
        intent.putExtra("tab_am7503rd", amoxTab750res3rd)
        intent.putExtra("tab_am10002rd", amoxTab1000res2rd)
        startActivity(intent)
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
    }

    private fun clarytro() {
        val database = dbHelper!!.writableDatabase
        @SuppressLint("Recycle") val cursor = database.query(DBHelper.TABLE_CONTACTS, null, null, null, null, null, null)
        if (cursor != null) if (cursor.moveToFirst()) {
            do {
                val dbClaryTer = cursor.getColumnIndex(DBHelper.DOZE_TER_CLARI)
                val dbClaryMax = cursor.getColumnIndex(DBHelper.DOZE_MAX_CLARI)
                claryTer = cursor.getString(dbClaryTer).toInt()
                claryMax = cursor.getString(dbClaryMax).toInt()
            } while (cursor.moveToNext())
        }
        if (BuildConfig.DEBUG && cursor == null) {
            error("Assertion failed")
        }
        cursor!!.close()
        dbHelper!!.close()
        val args = intent.extras
        val weight = args!!["chW"].toString()
        val clariD = claryTer
        var terClari = weight.toDouble() * clariD
        if (terClari > claryMax) {
            terClari = claryMax.toDouble()
        }
        val brClarSus125 = terClari * 5 / 125 / 2
        val clarSus125 = (brClarSus125 * 10.0).roundToInt() / 10.0
        val brClarSus250 = terClari * 5 / 250 / 2
        val clarSus250 = (brClarSus250 * 10.0).roundToInt() / 10.0
        val clarTab250 = terClari / 250
        val clarTab500 = terClari / 500
        val brClarTab250res2rd = clarTab250 / 2
        val clarTab250res2rd = (brClarTab250res2rd * 10.0).roundToInt() / 10.0
        val brClarTab500res1rd = clarTab500 / 1
        val clarTab500res1rd = (brClarTab500res1rd * 10.0).roundToInt() / 10.0
        val intent = Intent(applicationContext, ClariActivity::class.java)
        intent.putExtra("sus_clar125", clarSus125)
        intent.putExtra("sus_clar250", clarSus250)
        intent.putExtra("tab_clar2502rd", clarTab250res2rd)
        intent.putExtra("tab_clar5001rd", clarTab500res1rd)
        startActivity(intent)
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
    }

    private fun azitro() {
        val database = dbHelper!!.writableDatabase
        @SuppressLint("Recycle") val cursor = database.query(DBHelper.TABLE_CONTACTS, null, null, null, null, null, null)
        if (cursor != null) if (cursor.moveToFirst()) {
            do {
                val dbAziTer = cursor.getColumnIndex(DBHelper.DOZE_TER_AZI)
                val dbAziMax = cursor.getColumnIndex(DBHelper.DOZE_MAX_AZI)
                aziTer = cursor.getString(dbAziTer).toInt()
                aziMax = cursor.getString(dbAziMax).toInt()
            } while (cursor.moveToNext())
        }
        if (BuildConfig.DEBUG && cursor == null) {
            error("Assertion failed")
        }
        cursor!!.close()
        dbHelper!!.close()
        val args = intent.extras
        val weight = args!!["chW"].toString()
        val aziD = aziTer
        var terAzi = weight.toDouble() * aziD
        if (terAzi > aziMax) {
            terAzi = aziMax.toDouble()
        }
        val brAziSus100 = terAzi * 5 / 100
        val aziSus100 = (brAziSus100 * 10.0).roundToInt() / 10.0
        val brAziSus200 = terAzi * 5 / 200
        val aziSus200 = (brAziSus200 * 10.0).roundToInt() / 10.0
        val aziTab250 = terAzi / 250
        val aziTab500 = terAzi / 500
        val aziTab250res = (aziTab250 * 10.0).roundToInt() / 10.0
        val aziTab500res = (aziTab500 * 10.0).roundToInt() / 10.0
        val intent = Intent(applicationContext, AziActivity::class.java)
        intent.putExtra("sus_azi100", aziSus100)
        intent.putExtra("sus_azi200", aziSus200)
        intent.putExtra("tab_azi250", aziTab250res)
        intent.putExtra("tab_azi500", aziTab500res)
        startActivity(intent)
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
    }

    private fun cefuroxim() {
        val database = dbHelper!!.writableDatabase
        @SuppressLint("Recycle") val cursor = database.query(DBHelper.TABLE_CONTACTS, null, null, null, null, null, null)
        if (cursor != null) if (cursor.moveToFirst()) {
            do {
                val dbCefurTer = cursor.getColumnIndex(DBHelper.DOZE_TER_CEFUR)
                val dbCefurMax = cursor.getColumnIndex(DBHelper.DOZE_MAX_CEFUR)
                cefurTer = cursor.getString(dbCefurTer).toInt()
                cefurMax = cursor.getString(dbCefurMax).toInt()
            } while (cursor.moveToNext())
        }
        if (BuildConfig.DEBUG && cursor == null) {
            error("Assertion failed")
        }
        cursor!!.close()
        dbHelper!!.close()
        val args = intent.extras
        val weight = args!!["chW"].toString()
        val cefurD = cefurTer
        var terCefur = weight.toDouble() * cefurD
        if (terCefur > cefurMax) {
            terCefur = cefurMax.toDouble()
        }
        val brCefurSus125 = terCefur * 5 / 125 / 2
        val cefurSus125 = (brCefurSus125 * 10.0).roundToInt() / 10.0
        val brCefurSus250 = terCefur * 5 / 250 / 2
        val cefurSus250 = (brCefurSus250 * 10.0).roundToInt() / 10.0
        val cefurTab250 = terCefur / 250
        val cefurTab500 = terCefur / 500
        val brCefurTab250res2rd = cefurTab250 / 2
        val cefurTab250res2rd = (brCefurTab250res2rd * 10.0).roundToInt() / 10.0
        val brCefurTab500res2rd = cefurTab500 / 2
        val cefurTab500res2rd = (brCefurTab500res2rd * 10.0).roundToInt() / 10.0
        val intent = Intent(applicationContext, CefurActivity::class.java)
        intent.putExtra("sus_cefur125", cefurSus125)
        intent.putExtra("sus_cefur250", cefurSus250)
        intent.putExtra("tab_cefur2502rd", cefurTab250res2rd)
        intent.putExtra("tab_cefur5002rd", cefurTab500res2rd)
        startActivity(intent)
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
    }

    private fun cefdinir() {
        val database = dbHelper!!.writableDatabase
        @SuppressLint("Recycle") val cursor = database.query(DBHelper.TABLE_CONTACTS, null, null, null, null, null, null)
        if (cursor != null) if (cursor.moveToFirst()) {
            do {
                val dbCefdinirTer = cursor.getColumnIndex(DBHelper.DOZE_TER_CEFDINIR)
                val dbCefdinirMax = cursor.getColumnIndex(DBHelper.DOZE_MAX_CEFDINIR)
                cefdinirTer = cursor.getString(dbCefdinirTer).toInt()
                cefdinirMax = cursor.getString(dbCefdinirMax).toInt()
            } while (cursor.moveToNext())
        }
        if (BuildConfig.DEBUG && cursor == null) {
            error("Assertion failed")
        }
        cursor!!.close()
        dbHelper!!.close()
        val args = intent.extras
        val weight = args!!["chW"].toString()
        val cefdinirD = cefdinirTer
        var terCefdinir = weight.toDouble() * cefdinirD
        if (terCefdinir > cefdinirMax) {
            terCefdinir = cefdinirMax.toDouble()
        }
        val brCefdinirSus125 = terCefdinir * 5 / 125 / 2
        val cefdinirSus125 = (brCefdinirSus125 * 10.0).roundToInt() / 10.0
        val brCefdinirSus250 = terCefdinir * 5 / 250 / 2
        val cefdinirSus250 = (brCefdinirSus250 * 10.0).roundToInt() / 10.0
        val cefdinirTab300 = terCefdinir / 300
        val brCefdinirTab300res2rd = cefdinirTab300 / 2
        val cefdinirTab300res2rd = (brCefdinirTab300res2rd * 10.0).roundToInt() / 10.0
        val intent = Intent(applicationContext, CefdinirActivity::class.java)
        intent.putExtra("sus_cefdinir125", cefdinirSus125)
        intent.putExtra("sus_cefdinir250", cefdinirSus250)
        intent.putExtra("tab_cefdinir2502rd", cefdinirTab300res2rd)
        startActivity(intent)
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
    }

    private fun cefixim() {
        val database = dbHelper!!.writableDatabase
        @SuppressLint("Recycle") val cursor = database.query(DBHelper.TABLE_CONTACTS, null, null, null, null, null, null)
        if (cursor != null) if (cursor.moveToFirst()) {
            do {
                val dbCefiximTer = cursor.getColumnIndex(DBHelper.DOZE_TER_CEFIXIME)
                val dbCefiximMax = cursor.getColumnIndex(DBHelper.DOZE_MAX_CEFIXIME)
                cefiximeTer = cursor.getString(dbCefiximTer).toInt()
                cefiximeMax = cursor.getString(dbCefiximMax).toInt()
            } while (cursor.moveToNext())
        }
        if (BuildConfig.DEBUG && cursor == null) {
            error("Assertion failed")
        }
        cursor!!.close()
        dbHelper!!.close()
        val args = intent.extras
        val weight = args!!["chW"].toString()
        val cefiximD = cefiximeTer
        var terCefixim = weight.toDouble() * cefiximD
        if (terCefixim > cefiximeMax) {
            terCefixim = cefiximeMax.toDouble()
        }
        val brCefiximSus100 = terCefixim * 5 / 100
        val cefiximSus100 = (brCefiximSus100 * 10.0).roundToInt() / 10.0
        val brCefiximSus1002rd = terCefixim * 5 / 100 / 2
        val cefiximSus1002rd = (brCefiximSus1002rd * 10.0).roundToInt() / 10.0
        val brCefiximTab400 = terCefixim / 400
        val cefiximTab400 = (brCefiximTab400 * 10.0).roundToInt() / 10.0
        val brCefiximTab4002rd = terCefixim / 400 / 2
        val cefiximTab4002rd = (brCefiximTab4002rd * 10.0).roundToInt() / 10.0
        val intent = Intent(applicationContext, CefiximeActivity::class.java)
        intent.putExtra("sus_cefixim100", cefiximSus100)
        intent.putExtra("sus_cefixim1002rd", cefiximSus1002rd)
        intent.putExtra("tab_cefixim400", cefiximTab400)
        intent.putExtra("tab_cefixim4002rd", cefiximTab4002rd)
        startActivity(intent)
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
    }

    private fun amoxiclav() {
        val database = dbHelper!!.writableDatabase
        @SuppressLint("Recycle") val cursor = database.query(DBHelper.TABLE_CONTACTS, null, null, null, null, null, null)
        if (cursor != null) if (cursor.moveToFirst()) {
            do {
                val dbAmoxiclavTer = cursor.getColumnIndex(DBHelper.DOZE_TER_AMOXICLAV)
                val dbAmoxiclavMax = cursor.getColumnIndex(DBHelper.DOZE_MAX_AMOXICLAV)
                amoxiclavTer = cursor.getString(dbAmoxiclavTer).toInt()
                amoxiclavMax = cursor.getString(dbAmoxiclavMax).toInt()
            } while (cursor.moveToNext())
        }
        if (BuildConfig.DEBUG && cursor == null) {
            error("Assertion failed")
        }
        cursor!!.close()
        dbHelper!!.close()
        val args = intent.extras
        val weight = args!!["chW"].toString()
        val amoxClav = amoxiclavTer
        var terAmoxClav = weight.toDouble() * amoxClav
        if (terAmoxClav > amoxiclavMax) {
            terAmoxClav = amoxiclavMax.toDouble()
        }
        val brAmoxClavSus125 = terAmoxClav * 5 / 125 / 2
        val amoxClavSus125 = (brAmoxClavSus125 * 10.0).roundToInt() / 10.0
        val brAmoxClavSus1253rd = terAmoxClav * 5 / 125 / 3
        val amoxClavSus1253rd = (brAmoxClavSus1253rd * 10.0).roundToInt() / 10.0
        val brAmoxClavSus200 = terAmoxClav * 5 / 200 / 2
        val amoxClavSus200 = (brAmoxClavSus200 * 10.0).roundToInt() / 10.0
        val brAmoxClavSus2003rd = terAmoxClav * 5 / 200 / 3
        val amoxClavSus2003rd = (brAmoxClavSus2003rd * 10.0).roundToInt() / 10.0
        val brAmoxClavSus400 = terAmoxClav * 5 / 400 / 2
        val amoxClavSus400 = (brAmoxClavSus400 * 10.0).roundToInt() / 10.0
        val brAmoxClavSus4003rd = terAmoxClav * 5 / 400 / 3
        val amoxClavSus4003rd = (brAmoxClavSus4003rd * 10.0).roundToInt() / 10.0
        val brAmoxClavSus250 = terAmoxClav * 5 / 250 / 2
        val amoxClavSus250 = (brAmoxClavSus250 * 10.0).roundToInt() / 10.0
        val brAmoxClavSus2503rd = terAmoxClav * 5 / 250 / 3
        val amoxClavSus2503rd = (brAmoxClavSus2503rd * 10.0).roundToInt() / 10.0
        val amoxClavTab500 = terAmoxClav / 500
        val amoxClavTab875 = terAmoxClav / 875
        val brAmoxClavTab500res2rd = amoxClavTab500 / 2
        val amoxClavTab500res2rd = (brAmoxClavTab500res2rd * 10.0).roundToInt() / 10.0
        val brAmoxClavTab500res3rd = amoxClavTab500 / 3
        val amoxClavTab500res3rd = (brAmoxClavTab500res3rd * 10.0).roundToInt() / 10.0
        val brAmoxClavTab875res2rd = amoxClavTab875 / 2
        val amoxClavTab875res2rd = (brAmoxClavTab875res2rd * 10.0).roundToInt() / 10.0
        val intent = Intent(applicationContext, AmoxiClavActivity::class.java)
        intent.putExtra("sus_am_cl125", amoxClavSus125)
        intent.putExtra("sus_am_cl1253rd", amoxClavSus1253rd)
        intent.putExtra("sus_am_cl200", amoxClavSus200)
        intent.putExtra("sus_am_cl2003rd", amoxClavSus2003rd)
        intent.putExtra("sus_am_cl400", amoxClavSus400)
        intent.putExtra("sus_am_cl4003rd", amoxClavSus4003rd)
        intent.putExtra("sus_am_cl250", amoxClavSus250)
        intent.putExtra("sus_am_cl2503rd", amoxClavSus2503rd)
        intent.putExtra("tab_am_cl5002rd", amoxClavTab500res2rd)
        intent.putExtra("tab_am_cl5003rd", amoxClavTab500res3rd)
        intent.putExtra("tab_am_cl10002rd", amoxClavTab875res2rd)
        startActivity(intent)
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
    }

    private fun exit() {
        val intent = Intent(this, MainAntiActivity::class.java)
        startActivity(intent)
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
    }
}