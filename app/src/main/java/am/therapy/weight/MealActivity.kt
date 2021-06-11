package am.therapy.weight

import am.therapy.MainActivity
import am.therapy.R
import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat

class MealActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.weight_meal)

        val actionBar = supportActionBar
        supportActionBar?.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.ac_b_weight))
        actionBar!!.setHomeButtonEnabled(true)
        actionBar.setDisplayHomeAsUpEnabled(true)

        val args = intent.extras
        val m0 = args!!["meal0"].toString()
        val m0rd = args["meal0_rd"].toString()
        val m1 = args["meal1"].toString()
        val m1rd = args["meal1_rd"].toString()
        val m2 = args["meal2"].toString()
        val m2rd = args["meal2_rd"].toString()
        val m3 = args["meal3"].toString()
        val m3rd = args["meal3_rd"].toString()
        val m4 = args["meal4"].toString()
        val m4rd = args["meal4_rd"].toString()
        val m5 = args["meal5"].toString()
        val m5rd = args["meal5_rd"].toString()
        val m6 = args["meal6"].toString()
        val m6rd = args["meal6_rd"].toString()
        val m7 = args["meal7"].toString()
        val m7rd = args["meal7_rd"].toString()
        val m8 = args["meal8"].toString()
        val m8rd = args["meal8_rd"].toString()
        val m9 = args["meal9"].toString()
        val m9rd = args["meal9_rd"].toString()
        val m10 = args["meal10"].toString()
        val m10rd = args["meal10_rd"].toString()
        val m11 = args["meal11"].toString()
        val m11rd = args["meal11_rd"].toString()
        val m12 = args["meal12"].toString()
        val m12rd = args["meal12_rd"].toString()
        val mw0 = findViewById<TextView>(R.id.vm0)
        val mw1 = findViewById<TextView>(R.id.vm1)
        val mw2 = findViewById<TextView>(R.id.vm2)
        val mw3 = findViewById<TextView>(R.id.vm3)
        val mw4 = findViewById<TextView>(R.id.vm4)
        val mw5 = findViewById<TextView>(R.id.vm5)
        val mw6 = findViewById<TextView>(R.id.vm6)
        val mw7 = findViewById<TextView>(R.id.vm7)
        val mw8 = findViewById<TextView>(R.id.vm8)
        val mw9 = findViewById<TextView>(R.id.vm9)
        val mw10 = findViewById<TextView>(R.id.vm10)
        val mw11 = findViewById<TextView>(R.id.vm11)
        val mw12 = findViewById<TextView>(R.id.vm12)
        mw0.text = """Суточный объем: $m0 мл.
            |Разовый объем: по $m0rd мл. 8 раз в день""".trimMargin()
        mw1.text = """Суточный объем: $m1 мл.
            |Разовый объем: по $m1rd мл. 8 раз в день""".trimMargin()
        mw2.text = """Суточный объем: $m2 мл.
            |Разовый объем: по $m2rd мл. 7 раз в день""".trimMargin()
        mw3.text = """Суточный объем: $m3 мл.
            |Разовый объем: по $m3rd мл. 7 раз в день""".trimMargin()
        mw4.text = """Суточный объем: $m4 мл.
            |Разовый объем: по $m4rd мл. 6 раз в день""".trimMargin()
        mw5.text = """Суточный объем: $m5 мл.
            |Разовый объем: по $m5rd мл. 6 раз в день""".trimMargin()
        mw6.text = """Суточный объем: $m6 мл.
            |Разовый объем: по $m6rd мл. 6 раз в день""".trimMargin()
        mw7.text = """Суточный объем: $m7 мл.
            |Разовый объем: по $m7rd мл. 6 раз в день""".trimMargin()
        mw8.text = """Суточный объем: $m8 мл.
            |Разовый объем: по $m8rd мл. 5 раз в день""".trimMargin()
        mw9.text = """Суточный объем: $m9 мл.
            |Разовый объем: по $m9rd мл. 5 раз в день""".trimMargin()
        mw10.text = """Суточный объем: $m10 мл.
            |Разовый объем: по $m10rd мл. 5 раз в день""".trimMargin()
        mw11.text = """Суточный объем: $m11 мл.
            |Разовый объем: по $m11rd мл. 5 раз в день""".trimMargin()
        mw12.text = """Суточный объем: $m12 мл.
            |Разовый объем: по $m12rd мл. 5 раз в день""".trimMargin()
        val exit = findViewById<Button>(R.id.button_meal_exit)
        exit.setOnClickListener {
            val intent = Intent(this, WeightActivity::class.java)
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