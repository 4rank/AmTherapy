package am.therapy.icd.icd11

import am.therapy.R
import android.app.ActivityOptions
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.MenuItem
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat

class ICD11Second : AppCompatActivity() {

    private var desName: String? = null
    private var desValue: Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.icd11_second)
        val text = findViewById<TextView>(R.id.des_icd11_value)
        val text1 = findViewById<TextView>(R.id.des_icd11_name)

        val actionBar = supportActionBar
        supportActionBar?.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.ac_b_anti))
        actionBar!!.setHomeButtonEnabled(true)
        actionBar.setDisplayHomeAsUpEnabled(true)

        val bundle = intent.extras
        desValue = bundle?.getInt(DES_VALUE_ICD11)
        desName = bundle?.getString(DES_DIF_NAME_ICD11)
        val value = getText(desValue!!)
        text1.text = desName
        text.text = value

        text.setTextColor(Color.parseColor("#FF000000"))
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            startActivity(Intent(this, MainICD11::class.java), ActivityOptions.makeSceneTransitionAnimation(this).toBundle())
            return true
        }
        return true
    }
}