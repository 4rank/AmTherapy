package am.therapy.ben.standart

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

class BenActivityRes : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ben_res)

        val actionBar = supportActionBar
        supportActionBar?.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.ac_b_ben))
        actionBar!!.setHomeButtonEnabled(true)
        actionBar.setDisplayHomeAsUpEnabled(true)

        val button = findViewById<Button>(R.id.button_ben_res)
        val resName = findViewById<TextView>(R.id.textView_ben_res_name)
        val resForm = findViewById<TextView>(R.id.textView_ben_res_formula)
        val res = findViewById<TextView>(R.id.textView_ben_res_main)
        val resB = findViewById<TextView>(R.id.textView_ben_res_b)
        val resJ = findViewById<TextView>(R.id.textView_ben_res_j)
        val resU = findViewById<TextView>(R.id.textView_ben_res_u)
        button.setOnClickListener {
            val intent = Intent(this, MainBenActivity::class.java)
            startActivity(intent)
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
        }
        val args = intent.extras
        var sexName = "Ребенок"
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
        val sex = args!!["sex_sec"] as String?
        val weight = args["weight_sec"] as Double
        val age = args["age_sec"] as Int
        val yearDif = age / 365.25
        val lifeYears = yearDif.toInt()
        if (sex == "Мальчик") {
            sexName = "Мальчик"
            when {
                lifeYears <= 3 -> {
                    oo = 60.9 * weight - 54
                    ooText = "((60.9 * $weight кг) - 54)"
                }
                lifeYears <= 10 -> {
                    oo = 22.7 * weight + 495
                    ooText = "((22.7 * $weight кг) + 495)"
                }
                else -> {
                    oo = 17.5 * weight + 651
                    ooText = "((17.5 * $weight кг) + 651)"
                }
            }
        }
        if (sex == "Девочка") {
            sexName = "Девочка"
            when {
                lifeYears <= 3 -> {
                    oo = (61 * weight - 51)
                    ooText = "((61 * $weight кг) - 51)"
                }
                lifeYears <= 10 -> {
                    oo = 22.5 * weight + 499
                    ooText = "((22.5 * $weight кг) + 499)"
                }
                else -> {
                    oo = 12.2 * weight + 746
                    ooText = "((12.2 * $weight кг) + 746)"
                }
            }
        }
        val faV = args["fa"] as Int
        if (faV == R.id.radio_FA2) {
            fa = 1.2
            faText = " * 1.2"
        }
        if (faV == R.id.radio_FA3) {
            fa = 1.4
            faText = " * 1.4"
        }
        val frV = args["fr"] as Int
        if (frV == R.id.radio_FR1) {
            fr = 1.03
            frText = " * 1.03"
        }
        if (frV == R.id.radio_FR2) {
            fr = 1.02
            frText = " * 1.02"
        }
        if (frV == R.id.radio_FR3) {
            fr = 1.2
            frText = " * 1.2"
        }
        val dmtV = args["dmt"] as Int
        if (dmtV == R.id.radio_DMT1) {
            dmt = 1.1
            dmtText = " * 1.1"
        }
        if (dmtV == R.id.radio_DMT2) {
            dmt = 1.2
            dmtText = " * 1.2"
        }
        if (dmtV == R.id.radio_DMT3) {
            dmt = 1.3
            dmtText = " * 1.3"
        }
        val tfV = args["tf"] as Int
        if (tfV == R.id.radio_TF1) {
            tf = 1.1
            tfText = " * 1.1"
        }
        if (tfV == R.id.radio_TF2) {
            tf = 1.2
            tfText = " * 1.2"
        }
        if (tfV == R.id.radio_TF3) {
            tf = 1.3
            tfText = " * 1.3"
        }
        if (tfV == R.id.radio_TF4) {
            tf = 1.4
            tfText = " * 1.4"
        }
        val fzV = args["fz"] as Int
        if (fzV == R.id.radio_FZ1) {
            fz = 1.05
            fzText = " + 5%"
        }
        if (fzV == R.id.radio_FZ2) {
            fz = 1.12
            fzText = " + 12%"
        }
        if (fzV == R.id.radio_FZ3) {
            fz = 1.2
            fzText = " + 20%"
        }
        val fpV = args["fp"] as Int
        if (fpV == R.id.radio_FP1) {
            fp = 1.1
            fpText = " * 1.1"
        }
        if (fpV == R.id.radio_FP2) {
            fp = 1.2
            fpText = " * 1.2"
        }
        if (fpV == R.id.radio_FP3) {
            fp = 1.3
            fpText = " * 1.3"
        }
        if (fpV == R.id.radio_FP4) {
            fp = 1.4
            fpText = " * 1.4"
        }
        if (fpV == R.id.radio_FP5) {
            fp = 1.5
            fpText = " * 1.5"
        }
        if (fpV == R.id.radio_FP6) {
            fp = 1.6
            fpText = " * 1.6"
        }
        if (fpV == R.id.radio_FP7) {
            fp = 1.7
            fpText = " * 1.7"
        }
        if (fpV == R.id.radio_FP8) {
            fp = 1.8
            fpText = " * 1.8"
        }
        if (fpV == R.id.radio_FP9) {
            fp = 1.9
            fpText = " * 1.9"
        }
        if (fpV == R.id.radio_FP10) {
            fp = 2.0
            fpText = " * 2.0"
        }
        if (fpV == R.id.radio_FP11) {
            fp = 2.1
            fpText = " * 2.1"
        }
        if (fpV == R.id.radio_FP12) {
            fp = 2.2
            fpText = " * 2.2"
        }
        var voda = 0
        if (weight < 10.0) {
            voda = (125 * weight).toInt()
        }
        if (weight in 10.0..19.0) {
            voda = (1000 + (weight - 10) * 50).toInt()
        }
        if (weight >= 20.0) {
            voda = (1500 + (weight - 20) * 20).toInt()
        }
        if (voda > 2400) {
            voda = 2400
        }
        var belJirMin = 1.0
        var belJirMax = 1.0
        var uglevodMin = 1.0
        var uglevodMax = 1.0
        if (lifeYears < 4) {
            belJirMin = ((weight * 3.5) * 10.0).roundToInt() / 10.0
            belJirMax = ((weight * 4) * 10.0).roundToInt() / 10.0
            uglevodMin = ((weight * 15) * 10.0).roundToInt() / 10.0
            uglevodMax = ((weight * 16) * 10.0).roundToInt() / 10.0
        }
        if (lifeYears in 4..6) {
            belJirMin = ((weight * 3) * 10.0).roundToInt() / 10.0
            belJirMax = ((weight * 3.5) * 10.0).roundToInt() / 10.0
            uglevodMin = ((weight * 12) * 10.0).roundToInt() / 10.0
            uglevodMax = ((weight * 14) * 10.0).roundToInt() / 10.0
        }
        if (lifeYears in 7..11) {
            belJirMin = ((weight * 2.5) * 10.0).roundToInt() / 10.0
            belJirMax = ((weight * 3) * 10.0).roundToInt() / 10.0
            uglevodMin = ((weight * 10) * 10.0).roundToInt() / 10.0
            uglevodMax = ((weight * 12) * 10.0).roundToInt() / 10.0
        }
        if (lifeYears >= 12) {
            belJirMin = ((weight * 2) * 10.0).roundToInt() / 10.0
            belJirMax = ((weight * 2.5) * 10.0).roundToInt() / 10.0
            uglevodMin = ((weight * 7) * 10.0).roundToInt() / 10.0
            uglevodMax = ((weight * 8) * 10.0).roundToInt() / 10.0
        }
        val rep = oo * fa * fz * fp * dmt * tf * fr
        val roundRep = (rep * 10.0).roundToInt() / 10.0
        val year = args["year_sec"] as Int
        val month = args["month_sec"] as Int
        val day = args["day_sec"] as Int
        resName.text = """$sexName с массой тела: $weight кг.
            | Дата рождения $day.$month.$year
            | Полных лет: $lifeYears""".trimMargin()
        resForm.text = """Формула расчета фактической потребности ребенка в энергии:
            |$ooText$faText$fzText$fpText$dmtText$tfText$frText = $roundRep ккал/сут""".trimMargin()
        res.text = """Энергетическая потребность составляет: $roundRep ккал в сутки
            |Потребность в жидкости: $voda мл в сутки""".trimMargin()
        resB.text = "Белки:\n$belJirMin - $belJirMax г."
        resJ.text = "Жиры:\n$belJirMin - $belJirMax г."
        resU.text = "Углеводы:\n$uglevodMin - $uglevodMax г."
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