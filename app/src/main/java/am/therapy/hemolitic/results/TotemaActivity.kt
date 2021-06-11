package am.therapy.hemolitic.results

import am.therapy.MainActivity
import am.therapy.R
import am.therapy.hemolitic.MainGEMActivity
import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat

class TotemaActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.gem_res_totema)

        val actionBar = supportActionBar
        supportActionBar?.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.ac_b_gem))
        actionBar!!.setHomeButtonEnabled(true)
        actionBar.setDisplayHomeAsUpEnabled(true)

        val args = intent.extras
        val totem10 = args!!["totem_amp10"] as Double
        val totem102rd = args["totem_amp10_2rd"] as Double
        val totem10R = args["totem_amp10_r"] as Double
        val totem10R2rd = args["totem_amp10_r_2rd"] as Double
        val totem = findViewById<TextView>(R.id.text_totem_cap_10)
        totem.text = """ПД: внутрь по ${totem10}мл.($totem10R амп.) 1р/д либо ${totem102rd}мл.(${totem10R2rd}амп.) 2р/д
            |
            |ЛД: Лекарственная дозировка препарата Железа Глюконат у детей до 1 года равна профилактической. От 1 года до 5 лет - 1 ампула в сутки. От 6 лет до 12 - 2 ампулы в сутки. 
            |У детей старшего возраста лечебная дозировка определяется в зависимости от степени тяжести анемии. """.trimMargin()
        val main = findViewById<Button>(R.id.button_else_totem)
        main.setOnClickListener {
            val intent = Intent(this, MainGEMActivity::class.java)
            startActivity(intent)
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
        }
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
}