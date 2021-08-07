package am.therapy.ben.child

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
import kotlin.math.roundToInt

class ChildActivityRes : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ben_child_res)

        val actionBar = supportActionBar
        supportActionBar?.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.ac_b_ben))
        actionBar!!.setHomeButtonEnabled(true)
        actionBar.setTitle(R.string.back_menu)
        actionBar.setDisplayHomeAsUpEnabled(true)

        val button = findViewById<Button>(R.id.button_ben_child_res)
        val resName = findViewById<TextView>(R.id.textView_ben_res_child_name)
        val resForm = findViewById<TextView>(R.id.textView_ben_res_child_formula)
        val res = findViewById<TextView>(R.id.textView_ben_res_child_main)
        val resB = findViewById<TextView>(R.id.textView_ben_child_res_b)
        val resJ = findViewById<TextView>(R.id.textView_ben_child_res_j)
        val resU = findViewById<TextView>(R.id.textView_ben_child_res_u)
        button.setOnClickListener {
            val intent = Intent(this, MainChildActivity::class.java)
            startActivity(intent)
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
        }
        val args = intent.extras
        val name = getString(R.string.sex_name)
        val boy = getString(R.string.sex_name_boy)
        val girl = getString(R.string.sex_name_girl)
        val kg = getString(R.string.ben_kg)
        val res1 = getString(R.string.ben_third1)
        val res2 = getString(R.string.ben_third2)
        val res3 = getString(R.string.ben_third3)
        val res4 = getString(R.string.ben_third4)
        val res5 = getString(R.string.ben_third5)
        val res6 = getString(R.string.ben_third6)
        val res7 = getString(R.string.ben_third7)
        val res8 = getString(R.string.ben_third8)
        val res9 = getString(R.string.ben_third9)
        val res10 = getString(R.string.ben_third10)
        val res11 = getString(R.string.ben_third11)
        val res12 = getString(R.string.ben_third12)
        val res13 = getString(R.string.ben_second5)
        var sexName = name
        var fa = 1.0
        var fz = 1.0
        var fr = 1.0
        var tf = 1.0
        var dmt = 1.0
        var fp = 1.0
        var oo = 1.0
        var faText = ""
        var fzText = ""
        var frText = ""
        var tfText = ""
        var dmtText = ""
        var fpText = ""
        var ooText = ""
        val sex = args!!["sex_child_sec"] as String?
        val weightGrams = args["weight_child_sec"] as Int
        val weightRound = weightGrams.toDouble() / 1000
        var weight = (weightRound * 10.0).roundToInt() / 10.0
        if (weight < 1) {
            weight = 1.0
        }
        val lifeMonth = args["age_child_sec"] as Int
        if (sex == boy) {
            sexName = boy
            oo = 60.9 * weight - 54
            ooText = "((60.9 * $weight $kg) - 54)"
        }
        if (sex == girl) {
            sexName = girl
            oo = 61 * weight - 51
            ooText = "((61 * $weight $kg) - 51)"
        }
        val faV = args["fa_ch"] as Int
        if (faV == R.id.radio_FA2_child) {
            fa = 1.2
            faText = " * 1.2"
        }
        if (faV == R.id.radio_FA3_child) {
            fa = 1.4
            faText = " * 1.4"
        }
        val frV = args["fr_ch"] as Int
        if (frV == R.id.radio_FR1_child) {
            fr = 1.03
            frText = " * 1.03"
        }
        if (frV == R.id.radio_FR2_child) {
            fr = 1.02
            frText = " * 1.02"
        }
        if (frV == R.id.radio_FR3_child) {
            fr = 1.2
            frText = " * 1.2"
        }
        val dmtV = args["dmt_ch"] as Int
        if (dmtV == R.id.radio_DMT1_child) {
            dmt = 1.1
            dmtText = " * 1.1"
        }
        if (dmtV == R.id.radio_DMT2_child) {
            dmt = 1.2
            dmtText = " * 1.2"
        }
        if (dmtV == R.id.radio_DMT3_child) {
            dmt = 1.3
            dmtText = " * 1.3"
        }
        val tfV = args["tf_ch"] as Int
        if (tfV == R.id.radio_TF1_child) {
            tf = 1.1
            tfText = " * 1.1"
        }
        if (tfV == R.id.radio_TF2_child) {
            tf = 1.2
            tfText = " * 1.2"
        }
        if (tfV == R.id.radio_TF3_child) {
            tf = 1.3
            tfText = " * 1.3"
        }
        if (tfV == R.id.radio_TF4_child) {
            tf = 1.4
            tfText = " * 1.4"
        }
        val fzV = args["fz_ch"] as Int
        if (fzV == R.id.radio_FZ1_child) {
            fz = 1.05
            fzText = " + 5%"
        }
        if (fzV == R.id.radio_FZ2_child) {
            fz = 1.12
            fzText = " + 12%"
        }
        if (fzV == R.id.radio_FZ3_child) {
            fz = 1.2
            fzText = " + 20%"
        }
        val fpV = args["fp_ch"] as Int
        if (fpV == R.id.radio_FP1_child) {
            fp = 1.1
            fpText = " * 1.1"
        }
        if (fpV == R.id.radio_FP2_child) {
            fp = 1.2
            fpText = " * 1.2"
        }
        if (fpV == R.id.radio_FP3_child) {
            fp = 1.3
            fpText = " * 1.3"
        }
        if (fpV == R.id.radio_FP4_child) {
            fp = 1.4
            fpText = " * 1.4"
        }
        if (fpV == R.id.radio_FP5_child) {
            fp = 1.5
            fpText = " * 1.5"
        }
        if (fpV == R.id.radio_FP6_child) {
            fp = 1.6
            fpText = " * 1.6"
        }
        if (fpV == R.id.radio_FP7_child) {
            fp = 1.7
            fpText = " * 1.7"
        }
        if (fpV == R.id.radio_FP8_child) {
            fp = 1.8
            fpText = " * 1.8"
        }
        if (fpV == R.id.radio_FP9_child) {
            fp = 1.9
            fpText = " * 1.9"
        }
        if (fpV == R.id.radio_FP10_child) {
            fp = 2.0
            fpText = " * 2.0"
        }
        if (fpV == R.id.radio_FP11_child) {
            fp = 2.1
            fpText = " * 2.1"
        }
        if (fpV == R.id.radio_FP12_child) {
            fp = 2.2
            fpText = " * 2.2"
        }
        var vodaMin = 0
        var vodaMax = 0
        if (weight <= 10) {
            vodaMin = (100 * weight).toInt()
            vodaMax = (150 * weight).toInt()
        }
        if (weight > 10) {
            vodaMin = 1000
            vodaMax = (1000 + (weight - 10) * 50).toInt()
        }
        if (vodaMin > 2000) {
            vodaMin = 2000
        }
        if (vodaMax > 2400) {
            vodaMax = 2400
        }
        var bel = 1.0
        var jir = 1.0
        var uglevod = 1.0
        if (lifeMonth < 4) {
            val belBr = weight * 2.2
            bel = (belBr * 10.0).roundToInt() / 10.0
            val jirBr = weight * 6.5
            jir = (jirBr * 10.0).roundToInt() / 10.0
            val uglevodBr = weight * 13
            uglevod = (uglevodBr * 10.0).roundToInt() / 10.0
        }
        if (lifeMonth in 4..6) {
            val belBr = weight * 2.6
            bel = (belBr * 10.0).roundToInt() / 10.0
            val jirBr = weight * 6.0
            jir = (jirBr * 10.0).roundToInt() / 10.0
            val uglevodBr = weight * 13
            uglevod = (uglevodBr * 10.0).roundToInt() / 10.0
        }
        if (lifeMonth >= 7) {
            val belBr = weight * 2.9
            bel = (belBr * 10.0).roundToInt() / 10.0
            val jirBr = weight * 5.5
            jir = (jirBr * 10.0).roundToInt() / 10.0
            val uglevodBr = weight * 13
            uglevod = (uglevodBr * 10.0).roundToInt() / 10.0
        }
        val rep = oo * fa * fz * fp * dmt * tf * fr
        val roundRep = (rep * 10.0).roundToInt() / 10.0
        resName.text = """$sexName $res1 $weightGrams $res13
            | $res2 $lifeMonth $res3""".trimMargin()
        resForm.text = """$res4
            |$ooText$faText$fzText$fpText$dmtText$tfText$frText = $roundRep $res5""".trimMargin()
        res.text = """$res6 $roundRep $res7
            |$res8 $vodaMin - $vodaMax $res9""".trimMargin()
        resB.text = "$res10\n$bel $res13"
        resJ.text = "$res11\n$jir $res13"
        resU.text = "$res12\n$uglevod $res13"
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