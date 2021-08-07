package am.therapy.ben.child

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

class ChildActivity : AppCompatActivity() {

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
        setContentView(R.layout.ben_child_second)

        val actionBar = supportActionBar
        supportActionBar?.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.ac_b_ben))
        actionBar!!.setHomeButtonEnabled(true)
        actionBar.setTitle(R.string.back_menu)
        actionBar.setDisplayHomeAsUpEnabled(true)

        mAdView = findViewById(R.id.adview_ben_child)
        val adRequest = AdRequest.Builder().build()
        mAdView.loadAd(adRequest)

        val ml = findViewById<MotionLayout>(R.id.child_view)
        ml.transitionToStart()
        val button = findViewById<Button>(R.id.button_ben_child_second)
        val cancel = findViewById<Button>(R.id.button_ben_child_cancel)
        val name = findViewById<TextView>(R.id.textView_ben_child_childInfo)
        rGFa = findViewById(R.id.radioGroup_FA_child)
        rGFz = findViewById(R.id.radioGroup_FZ_child)
        rGFr = findViewById(R.id.radioGroup_FR_child)
        rGTf = findViewById(R.id.radioGroup_TF_child)
        rGDmt = findViewById(R.id.radioGroup_DMT_child)
        rGFp = findViewById(R.id.radioGroup_FP_child)
        button.setOnClickListener { start() }
        cancel.setOnClickListener { clearRadio() }
        val boy = getString(R.string.sex_name_boy)
        val girl = getString(R.string.sex_name_girl)
        val childName = getString(R.string.sex_name)
        val text1 = getString(R.string.ben_second1)
        val text2 = getString(R.string.ben_second2)
        val text3 = getString(R.string.ben_second3)
        val text4 = getString(R.string.ben_second4)
        val text5 = getString(R.string.ben_second5)
        val args = intent.extras
        var sexName = childName
        val sex = args!!["sex_child"] as Int
        if (sex == R.id.radio_child_boy) {
            sexName = boy
        }
        if (sex == R.id.radio_child_girl) {
            sexName = girl
        }
        val month = args["age_child"] as Int
        val weight = args["weight_child"] as Int
        name.text = "$text1\n$sexName $text2 $month $text3\n$text4 $weight $text5"
    }

    fun start() {
        val args = intent.extras
        val boy = getString(R.string.sex_name_boy)
        val girl = getString(R.string.sex_name_girl)
        val name = getString(R.string.sex_name)
        var sexName = name
        val month = args!!["age_child"] as Int
        val weight = args["weight_child"] as Int
        val sex = args["sex_child"] as Int
        if (sex == R.id.radio_child_boy) {
            sexName = boy
        }
        if (sex == R.id.radio_child_girl) {
            sexName = girl
        }
        val checked = rGFa!!.checkedRadioButtonId
        val checked1 = rGFz!!.checkedRadioButtonId
        val checked2 = rGFr!!.checkedRadioButtonId
        val checked3 = rGTf!!.checkedRadioButtonId
        val checked4 = rGDmt!!.checkedRadioButtonId
        val checked5 = rGFp!!.checkedRadioButtonId
        val intent = Intent(applicationContext, ChildActivityRes::class.java)
        intent.putExtra("age_child_sec", month)
        intent.putExtra("weight_child_sec", weight)
        intent.putExtra("sex_child_sec", sexName)
        intent.putExtra("fa_ch", checked)
        intent.putExtra("fz_ch", checked1)
        intent.putExtra("fr_ch", checked2)
        intent.putExtra("tf_ch", checked3)
        intent.putExtra("dmt_ch", checked4)
        intent.putExtra("fp_ch", checked5)
        startActivity(intent)
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
    }

    private fun clearRadio() {
        val del = getString(R.string.rg_delete)
        rGFa!!.clearCheck()
        rGFz!!.clearCheck()
        rGFr!!.clearCheck()
        rGTf!!.clearCheck()
        rGDmt!!.clearCheck()
        rGFp!!.clearCheck()
        val toast = Toast.makeText(applicationContext,
                del, Toast.LENGTH_SHORT)
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