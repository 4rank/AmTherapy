package am.therapy.ben.standart

import am.therapy.MainActivity
import am.therapy.R
import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.Gravity
import android.view.MenuItem
import android.widget.Button
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.motion.widget.MotionLayout
import androidx.core.content.ContextCompat
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView

class BenActivity : AppCompatActivity() {

    private var rGFa: RadioGroup? = null
    private var rGFz: RadioGroup? = null
    private var rGFr: RadioGroup? = null
    private var rGTf: RadioGroup? = null
    private var rGDmt: RadioGroup? = null
    private var rGFp: RadioGroup? = null
    lateinit var mAdView : AdView

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ben_second)

        val actionBar = supportActionBar
        supportActionBar?.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.ac_b_ben))
        actionBar!!.setHomeButtonEnabled(true)
        actionBar.setDisplayHomeAsUpEnabled(true)

        mAdView = findViewById(R.id.adview_ben)
        val adRequest = AdRequest.Builder().build()
        mAdView.loadAd(adRequest)

        val ml = findViewById<MotionLayout>(R.id.ben_view)
        ml.transitionToStart()
        val button = findViewById<Button>(R.id.button_ben_second)
        val cancel = findViewById<Button>(R.id.button_ben_cancel)
        val name = findViewById<TextView>(R.id.textView_ben_childInfo)
        rGFa = findViewById(R.id.radioGroup_FA)
        rGFz = findViewById(R.id.radioGroup_FZ)
        rGFr = findViewById(R.id.radioGroup_FR)
        rGTf = findViewById(R.id.radioGroup_TF)
        rGDmt = findViewById(R.id.radioGroup_DMT)
        rGFp = findViewById(R.id.radioGroup_FP)
        button.setOnClickListener { start() }
        cancel.setOnClickListener { clearRadio() }
        val args = intent.extras
        var sexName = "Ребенок"
        val sex = args!!["sex"] as Int
        if (sex == R.id.radio_boy) {
            sexName = "Мальчик"
        }
        if (sex == R.id.radio_girl) {
            sexName = "Девочка"
        }
        val year = args["year"] as Int
        val month = args["month"] as Int
        val day = args["day"] as Int
        val weight = args["weight_ben"] as Double
        name.text = "Укажите необходимые поправочные коэфициенты для ребенка:\n$sexName $day.$month.$year г.р.\nс массой тела: $weight кг."
    }

    fun start() {
        val args = intent.extras
        var sexName = "Ребенок"
        val year = args!!["year"] as Int
        val month = args["month"] as Int
        val day = args["day"] as Int
        val weight = args["weight_ben"] as Double
        val days = args["age"] as Int
        val sex = args["sex"] as Int
        if (sex == R.id.radio_boy) {
            sexName = "Мальчик"
        }
        if (sex == R.id.radio_girl) {
            sexName = "Девочка"
        }
        val checked = rGFa!!.checkedRadioButtonId
        val checked1 = rGFz!!.checkedRadioButtonId
        val checked2 = rGFr!!.checkedRadioButtonId
        val checked3 = rGTf!!.checkedRadioButtonId
        val checked4 = rGDmt!!.checkedRadioButtonId
        val checked5 = rGFp!!.checkedRadioButtonId
        val intent = Intent(applicationContext, BenActivityRes::class.java)
        intent.putExtra("year_sec", year)
        intent.putExtra("month_sec", month)
        intent.putExtra("day_sec", day)
        intent.putExtra("weight_sec", weight)
        intent.putExtra("age_sec", days)
        intent.putExtra("sex_sec", sexName)
        intent.putExtra("fa", checked)
        intent.putExtra("fz", checked1)
        intent.putExtra("fr", checked2)
        intent.putExtra("tf", checked3)
        intent.putExtra("dmt", checked4)
        intent.putExtra("fp", checked5)
        startActivity(intent)
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
    }

    private fun clearRadio() {
        rGFa!!.clearCheck()
        rGFz!!.clearCheck()
        rGFr!!.clearCheck()
        rGTf!!.clearCheck()
        rGDmt!!.clearCheck()
        rGFp!!.clearCheck()
        val toast = Toast.makeText(applicationContext,
                "Все отметки убраны", Toast.LENGTH_SHORT)
        toast.setGravity(Gravity.BOTTOM or Gravity.CENTER, 0, 50)
        toast.show()
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