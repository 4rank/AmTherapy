package am.therapy.icd.icd10

import am.therapy.R
import am.therapy.langswap.SharedPreference
import android.app.ActivityOptions
import android.content.Intent
import android.content.res.Configuration
import android.graphics.Color
import android.os.Bundle
import android.view.MenuItem
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import java.util.*

@Suppress("DEPRECATION")
class ICD10Second : AppCompatActivity() {

    private var desNameRU: String? = null
    private var desNameENG: String? = null
    private var desValue: Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val sharedPreference = SharedPreference(this)
        val lang = sharedPreference.getValueInt("lang")
        if (lang == 1) {
            val locale1 = Locale("en")
            Locale.setDefault(locale1)
            val config2 = Configuration()
            config2.locale = locale1
            baseContext.resources.updateConfiguration(
                    config2, baseContext.resources.displayMetrics)
        }
        if (lang == 2) {
            val locale2 = Locale("ru")
            Locale.setDefault(locale2)
            val config2 = Configuration()
            config2.locale = locale2
            baseContext.resources.updateConfiguration(
                    config2, baseContext.resources.displayMetrics)
        }
        setContentView(R.layout.icd10_second)
        val text = findViewById<TextView>(R.id.des_icd10_value)
        val text1 = findViewById<TextView>(R.id.des_icd10_name)
        val name = findViewById<TextView>(R.id.des_icd10_name_main)
        val nameLang = name.text.toString()

        val actionBar = supportActionBar
        supportActionBar?.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.ac_b_anti))
        actionBar!!.setHomeButtonEnabled(true)
        actionBar.setTitle(R.string.back_menu_icd)
        actionBar.setDisplayHomeAsUpEnabled(true)

        val bundle = intent.extras
        desValue = bundle?.getInt(DES_VALUE)
        desNameRU = bundle?.getString(DES_DIF_NAME_RU)
        desNameENG = bundle?.getString(DES_DIF_NAME_ENG)
        val value = getText(desValue!!)
        if (nameLang == "МКБ-10:") {
            text1.text = desNameRU
        } else if (nameLang == "ICD-10:") {
            text1.text = desNameENG
        }
        text.text = value

        text.setTextColor(Color.parseColor("#FF000000"))
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            startActivity(Intent(this, MainICD10::class.java), ActivityOptions.makeSceneTransitionAnimation(this).toBundle())
            return true
        }
        return true
    }
}