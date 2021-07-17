package am.therapy.icd

import am.therapy.MainActivity
import am.therapy.R
import android.app.ActivityOptions
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.MenuItem
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat

class ICD10Second : AppCompatActivity() {

    private var desName: String? = null
    private var desValue: Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.icd10_second)
        val text = findViewById<TextView>(R.id.des_icd10_value)
        val text1 = findViewById<TextView>(R.id.des_icd10_name)

        val actionBar = supportActionBar
        supportActionBar?.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.ac_b_anti))
        actionBar!!.setHomeButtonEnabled(true)
        actionBar.setDisplayHomeAsUpEnabled(true)

        val bundle = intent.extras
        desValue = bundle?.getInt(DES_VALUE)
        desName = bundle?.getString(DES_DIF_NAME)
        val value = getText(desValue!!)
        text1.text = desName
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