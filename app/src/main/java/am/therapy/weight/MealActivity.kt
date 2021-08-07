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
        actionBar.setTitle(R.string.back_menu)
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
        val day = getString(R.string.meal_day)
        val raz = getString(R.string.meal_raz)
        val ml = getString(R.string.pr_end_ml)
        val rd8 = getString(R.string.meal_rd8)
        val rd7 = getString(R.string.meal_rd7)
        val rd6 = getString(R.string.meal_rd6)
        val rd5 = getString(R.string.meal_rd5)
        mw0.text = """$day $m0 $ml
            |$raz $m0rd $rd8""".trimMargin()
        mw1.text = """$day $m1 $ml
            |$raz $m1rd $rd8""".trimMargin()
        mw2.text = """$day $m2 $ml
            |$raz $m2rd $rd7""".trimMargin()
        mw3.text = """$day $m3 $ml
            |$raz $m3rd $rd7""".trimMargin()
        mw4.text = """$day $m4 $ml
            |$raz $m4rd $rd6""".trimMargin()
        mw5.text = """$day $m5 $ml
            |$raz $m5rd $rd6""".trimMargin()
        mw6.text = """$day $m6 $ml
            |$raz $m6rd $rd6""".trimMargin()
        mw7.text = """$day $m7 $ml
            |$raz $m7rd $rd6""".trimMargin()
        mw8.text = """$day $m8 $ml
            |$raz $m8rd $rd5""".trimMargin()
        mw9.text = """$day: $m9 $ml
            |$raz $m9rd $rd5""".trimMargin()
        mw10.text = """$day $m10 $ml
            |$raz $m10rd $rd5""".trimMargin()
        mw11.text = """$day $m11 $ml
            |$raz $m11rd $rd5""".trimMargin()
        mw12.text = """$day $m12 $ml
            |$raz $m12rd $rd5""".trimMargin()
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