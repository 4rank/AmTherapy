package am.therapy.icd

import am.therapy.R
import android.annotation.SuppressLint
import android.app.ActivityOptions
import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.text.HtmlCompat

class ICD10 : AppCompatActivity() {

    private var alertDialog: AlertDialog? = null

    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.icd10)
        val text = findViewById<TextView>(R.id.icd10_tv_title)
        val but = findViewById<Button>(R.id.button_attention_icd10)

        val actionBar = supportActionBar
        supportActionBar?.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.ac_b_anti))
        actionBar!!.setHomeButtonEnabled(true)
        actionBar.setDisplayHomeAsUpEnabled(true)
        val args = intent.extras
        val id = args!!["id"] as Int
        val title = getString(id)
        text.text = title
        but.setOnClickListener{ alertDialog!!.show() }
        alertDialog = AlertDialog.Builder(this).create()
        alertDialog!!.setTitle(HtmlCompat.fromHtml("<font color='#0489B1'>МКБ-10</font>", 10))
        alertDialog!!.setMessage("""
            Звездочкой (-*) отмечены категории классифицированные в других рубриках.
            
            """.trimIndent())
        alertDialog!!.setButton(AlertDialog.BUTTON_POSITIVE, "Закрыть") { _: DialogInterface?, _: Int -> alertDialog!!.cancel() }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            startActivity(Intent(this, MainICD10::class.java), ActivityOptions.makeSceneTransitionAnimation(this).toBundle())
            return true
        }
        return true
    }
}