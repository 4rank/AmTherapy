package am.therapy.dbhelper

import am.therapy.BuildConfig
import am.therapy.MainActivity
import am.therapy.R
import android.annotation.SuppressLint
import android.content.ContentValues
import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.text.TextUtils
import android.view.Gravity
import android.view.KeyEvent
import android.view.MenuItem
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.text.HtmlCompat

class ConvertDozeActivity : AppCompatActivity() {

    private var alertDialog: AlertDialog? = null
    private var dbHelper: DBHelper? = null

    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.convert_doze)

        val actionBar = supportActionBar
        supportActionBar?.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.ac_b_anti))
        actionBar!!.setHomeButtonEnabled(true)
        actionBar.setDisplayHomeAsUpEnabled(true)

        val addDoze = findViewById<Button>(R.id.button_convert_ok)
        val clearDoze = findViewById<Button>(R.id.button_convert_reset)
        val cancel = findViewById<Button>(R.id.button_convert_cancel)
        val attention = findViewById<Button>(R.id.button_attention_convert)
        addDoze.setOnClickListener { addDoze() }
        clearDoze.setOnClickListener { deleteDoze() }
        cancel.setOnClickListener { intent() }
        attention.setOnClickListener { alertDialog!!.show() }
        val amoxiTer = findViewById<EditText>(R.id.doze_ter_amoxi)
        val amoxiMax = findViewById<EditText>(R.id.doze_max_amoxi)
        val claryTer = findViewById<EditText>(R.id.doze_ter_clari)
        val claryMax = findViewById<EditText>(R.id.doze_max_clari)
        val aziTer = findViewById<EditText>(R.id.doze_ter_azi)
        val aziMax = findViewById<EditText>(R.id.doze_max_azi)
        val cefurTer = findViewById<EditText>(R.id.doze_ter_cefur)
        val cefurMax = findViewById<EditText>(R.id.doze_max_cefur)
        val cefdinirTer = findViewById<EditText>(R.id.doze_ter_cefdinir)
        val cefdinirMax = findViewById<EditText>(R.id.doze_max_cefdinir)
        val cefiximeTer = findViewById<EditText>(R.id.doze_ter_cefixime)
        val cefiximeMax = findViewById<EditText>(R.id.doze_max_cefixime)
        val amoxiClavTer = findViewById<EditText>(R.id.doze_ter_amoxiclav)
        val amoxiClavMax = findViewById<EditText>(R.id.doze_max_amoxiclav)
        dbHelper = DBHelper(this)
        editText(amoxiTer)
        editText(amoxiMax)
        editText(claryTer)
        editText(claryMax)
        editText(aziTer)
        editText(aziMax)
        editText(cefurTer)
        editText(cefurMax)
        editText(cefdinirTer)
        editText(cefdinirMax)
        editText(cefiximeTer)
        editText(cefiximeMax)
        editText(amoxiClavTer)
        editText(amoxiClavMax)
        var standartAmoxiTer = "60"
        var standartAmoxiMax = "2000"
        var standartClaryTer = "15"
        var standartClaryMax = "1000"
        var standartAziTer = "10"
        var standartAziMax = "500"
        var standartCefurTer = "15"
        var standartCefurMax = "1000"
        var standartCefdinirTer = "14"
        var standartCefdinirMax = "600"
        var standartCefiximeTer = "8"
        var standartCefiximeMax = "400"
        var standartAmoxiclavTer = "45"
        var standartAmoxiclavMax = "2000"
        val database = dbHelper!!.writableDatabase
        @SuppressLint("Recycle") val cursor = database.query(DBHelper.TABLE_CONTACTS, null, null, null, null, null, null)
        if (cursor != null) if (cursor.moveToFirst()) {
            do {
                val dbAmoxiTer = cursor.getColumnIndex(DBHelper.DOZE_TER_AMOXI).toString()
                val dbAmoxiMax = cursor.getColumnIndex(DBHelper.DOZE_MAX_AMOXI).toString()
                val dbClaryTer = cursor.getColumnIndex(DBHelper.DOZE_TER_CLARI).toString()
                val dbClaryMax = cursor.getColumnIndex(DBHelper.DOZE_MAX_CLARI).toString()
                val dbAziTer = cursor.getColumnIndex(DBHelper.DOZE_TER_AZI).toString()
                val dbAziMax = cursor.getColumnIndex(DBHelper.DOZE_MAX_AZI).toString()
                val dbCefurTer = cursor.getColumnIndex(DBHelper.DOZE_TER_CEFUR).toString()
                val dbCefurMax = cursor.getColumnIndex(DBHelper.DOZE_MAX_CEFUR).toString()
                val dbCefdinirTer = cursor.getColumnIndex(DBHelper.DOZE_TER_CEFDINIR).toString()
                val dbCefdinirMax = cursor.getColumnIndex(DBHelper.DOZE_MAX_CEFDINIR).toString()
                val dbCefiximeTer = cursor.getColumnIndex(DBHelper.DOZE_TER_CEFIXIME).toString()
                val dbCefiximeMax = cursor.getColumnIndex(DBHelper.DOZE_MAX_CEFIXIME).toString()
                val dbAmoxiclavTer = cursor.getColumnIndex(DBHelper.DOZE_TER_AMOXICLAV).toString()
                val dbAmoxiclavMax = cursor.getColumnIndex(DBHelper.DOZE_MAX_AMOXICLAV).toString()
                standartAmoxiTer = cursor.getString(dbAmoxiTer.toInt())
                standartAmoxiMax = cursor.getString(dbAmoxiMax.toInt())
                standartClaryTer = cursor.getString(dbClaryTer.toInt())
                standartClaryMax = cursor.getString(dbClaryMax.toInt())
                standartAziTer = cursor.getString(dbAziTer.toInt())
                standartAziMax = cursor.getString(dbAziMax.toInt())
                standartCefurTer = cursor.getString(dbCefurTer.toInt())
                standartCefurMax = cursor.getString(dbCefurMax.toInt())
                standartCefdinirTer = cursor.getString(dbCefdinirTer.toInt())
                standartCefdinirMax = cursor.getString(dbCefdinirMax.toInt())
                standartCefiximeTer = cursor.getString(dbCefiximeTer.toInt())
                standartCefiximeMax = cursor.getString(dbCefiximeMax.toInt())
                standartAmoxiclavTer = cursor.getString(dbAmoxiclavTer.toInt())
                standartAmoxiclavMax = cursor.getString(dbAmoxiclavMax.toInt())
            } while (cursor.moveToNext())
        }
        if (BuildConfig.DEBUG && cursor == null) {
            error("Assertion failed")
        }
        cursor!!.close()
        dbHelper!!.close()
        val ad = getString(R.string.alert_convert)
        amoxiTer.setText(standartAmoxiTer)
        amoxiMax.setText(standartAmoxiMax)
        claryTer.setText(standartClaryTer)
        claryMax.setText(standartClaryMax)
        aziTer.setText(standartAziTer)
        aziMax.setText(standartAziMax)
        cefurTer.setText(standartCefurTer)
        cefurMax.setText(standartCefurMax)
        cefdinirTer.setText(standartCefdinirTer)
        cefdinirMax.setText(standartCefdinirMax)
        cefiximeTer.setText(standartCefiximeTer)
        cefiximeMax.setText(standartCefiximeMax)
        amoxiClavTer.setText(standartAmoxiclavTer)
        amoxiClavMax.setText(standartAmoxiclavMax)
        alertDialog = AlertDialog.Builder(this).create()
        alertDialog!!.setTitle(HtmlCompat.fromHtml("<font color='#0489B1'>$ad</font>",8))
        alertDialog!!.setMessage(getString(R.string.alert_convert_doze_ab))
        alertDialog!!.setButton(AlertDialog.BUTTON_POSITIVE, "OK") { _: DialogInterface?, _: Int -> alertDialog!!.cancel() }
    }

    private fun addDoze() {
        val amoxiTer = findViewById<EditText>(R.id.doze_ter_amoxi)
        val amoxiMax = findViewById<EditText>(R.id.doze_max_amoxi)
        val claryTer = findViewById<EditText>(R.id.doze_ter_clari)
        val claryMax = findViewById<EditText>(R.id.doze_max_clari)
        val aziTer = findViewById<EditText>(R.id.doze_ter_azi)
        val aziMax = findViewById<EditText>(R.id.doze_max_azi)
        val cefurTer = findViewById<EditText>(R.id.doze_ter_cefur)
        val cefurMax = findViewById<EditText>(R.id.doze_max_cefur)
        val cefdinirTer = findViewById<EditText>(R.id.doze_ter_cefdinir)
        val cefdinirMax = findViewById<EditText>(R.id.doze_max_cefdinir)
        val cefiximeTer = findViewById<EditText>(R.id.doze_ter_cefixime)
        val cefiximeMax = findViewById<EditText>(R.id.doze_max_cefixime)
        val amoxiClavTer = findViewById<EditText>(R.id.doze_ter_amoxiclav)
        val amoxiClavMax = findViewById<EditText>(R.id.doze_max_amoxiclav)
        val terAmoxi = amoxiTer!!.text.toString()
        val maxAmoxi = amoxiMax!!.text.toString()
        val terClari = claryTer!!.text.toString()
        val maxClari = claryMax!!.text.toString()
        val terAZi = aziTer!!.text.toString()
        val maxAzi = aziMax!!.text.toString()
        val terCefur = cefurTer!!.text.toString()
        val maxCefur = cefurMax!!.text.toString()
        val terCefdinir = cefdinirTer!!.text.toString()
        val maxCefdinir = cefdinirMax!!.text.toString()
        val terCefixime = cefiximeTer!!.text.toString()
        val maxCefixime = cefiximeMax!!.text.toString()
        val terAmoxiClav = amoxiClavTer!!.text.toString()
        val maxAmoxiClav = amoxiClavMax!!.text.toString()
        val database = dbHelper!!.writableDatabase
        val contentValues = ContentValues()
        contentValues.put(DBHelper.DOZE_TER_AMOXI, terAmoxi)
        contentValues.put(DBHelper.DOZE_MAX_AMOXI, maxAmoxi)
        contentValues.put(DBHelper.DOZE_TER_CLARI, terClari)
        contentValues.put(DBHelper.DOZE_MAX_CLARI, maxClari)
        contentValues.put(DBHelper.DOZE_TER_AZI, terAZi)
        contentValues.put(DBHelper.DOZE_MAX_AZI, maxAzi)
        contentValues.put(DBHelper.DOZE_TER_CEFUR, terCefur)
        contentValues.put(DBHelper.DOZE_MAX_CEFUR, maxCefur)
        contentValues.put(DBHelper.DOZE_TER_CEFDINIR, terCefdinir)
        contentValues.put(DBHelper.DOZE_MAX_CEFDINIR, maxCefdinir)
        contentValues.put(DBHelper.DOZE_TER_CEFIXIME, terCefixime)
        contentValues.put(DBHelper.DOZE_MAX_CEFIXIME, maxCefixime)
        contentValues.put(DBHelper.DOZE_TER_AMOXICLAV, terAmoxiClav)
        contentValues.put(DBHelper.DOZE_MAX_AMOXICLAV, maxAmoxiClav)
        val alert1 = getText(R.string.alert_convert1)
        val alert2 = getText(R.string.alert_convert2)
        val alert3 = getText(R.string.alert_convert3)
        if (TextUtils.isEmpty(amoxiTer.text.toString()) or
                TextUtils.isEmpty(amoxiMax.text.toString()) or
                TextUtils.isEmpty(claryTer.text.toString()) or
                TextUtils.isEmpty(claryMax.text.toString()) or
                TextUtils.isEmpty(aziTer.text.toString()) or
                TextUtils.isEmpty(aziMax.text.toString()) or
                TextUtils.isEmpty(cefurTer.text.toString()) or
                TextUtils.isEmpty(cefurMax.text.toString()) or
                TextUtils.isEmpty(cefdinirTer.text.toString()) or
                TextUtils.isEmpty(cefdinirMax.text.toString()) or
                TextUtils.isEmpty(cefiximeTer.text.toString()) or
                TextUtils.isEmpty(cefiximeMax.text.toString()) or
                TextUtils.isEmpty(amoxiClavTer.text.toString()) or
                TextUtils.isEmpty(amoxiClavMax.text.toString())) {
            setToast("$alert1")
            return
        }
        if ((amoxiTer.text.toString().toInt() == 0) or (
                        amoxiMax.text.toString().toInt() == 0) or (
                        claryTer.text.toString().toInt() == 0) or (
                        claryMax.text.toString().toInt() == 0) or (
                        aziTer.text.toString().toInt() == 0) or (
                        aziMax.text.toString().toInt() == 0) or (
                        cefurTer.text.toString().toInt() == 0) or (
                        cefurMax.text.toString().toInt() == 0) or (
                        cefdinirTer.text.toString().toInt() == 0) or (
                        cefdinirMax.text.toString().toInt() == 0) or (
                        cefiximeTer.text.toString().toInt() == 0) or (
                        cefiximeMax.text.toString().toInt() == 0) or (
                        amoxiClavTer.text.toString().toInt() == 0) or (
                        amoxiClavMax.text.toString().toInt() == 0)) {
            setToast("$alert2")
            return
        }
        database.insert(DBHelper.TABLE_CONTACTS, null, contentValues)
        setToast("$alert3")
        val intent = Intent(this, ConvertDozeActivity::class.java)
        startActivity(intent)
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
    }

    private fun deleteDoze() {
        val alert4 = getText(R.string.alert_convert4)
        val database = dbHelper!!.writableDatabase
        database.delete(DBHelper.TABLE_CONTACTS, null, null)
        setToast("$alert4")
        val intent = Intent(this, ConvertDozeActivity::class.java)
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

    private fun editText(et: EditText?) {
        et!!.setOnKeyListener { _: View?, keyCode: Int, event: KeyEvent ->
            if (event.action == KeyEvent.ACTION_DOWN &&
                    keyCode == KeyEvent.KEYCODE_ENTER) {
                val imm = getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager
                imm.toggleSoftInput(InputMethodManager.HIDE_IMPLICIT_ONLY, 0)
                return@setOnKeyListener true
            }
            false
        }
    }

    fun intent() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
    }

    private fun setToast(text: String?) {
        val toast = Toast.makeText(applicationContext,
                text, Toast.LENGTH_LONG)
        toast.setGravity(Gravity.BOTTOM or Gravity.CENTER, 0, 200)
        toast.show()
    }

    override fun onBackPressed() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
    }
}