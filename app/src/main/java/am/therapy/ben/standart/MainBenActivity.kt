package am.therapy.ben.standart

import am.therapy.MainActivity
import am.therapy.R
import am.therapy.ben.child.MainChildActivity
import android.annotation.SuppressLint
import android.app.DatePickerDialog
import android.app.DatePickerDialog.OnDateSetListener
import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.text.TextUtils
import android.view.KeyEvent
import android.view.MenuItem
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.*
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.motion.widget.MotionLayout
import androidx.core.content.ContextCompat
import androidx.core.text.HtmlCompat
import com.google.android.material.bottomnavigation.BottomNavigationView
import java.util.*
import java.util.concurrent.TimeUnit

@Suppress("DEPRECATION")
@SuppressLint("NonConstantResourceId")
class MainBenActivity : AppCompatActivity() {

    private val calMax = Calendar.getInstance()
    private val calMin = Calendar.getInstance()
    private var myYear = 2010
    private var myMonth = 5
    private var myDay = 15
    private var rG: RadioGroup? = null
    private var date: TextView? = null
    private var alertDialog: AlertDialog? = null

    @SuppressLint("ClickableViewAccessibility", "WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ben_first)
        calMin.add(Calendar.DATE, -6574)
        calMax.add(Calendar.DATE, -365)

        val actionBar = supportActionBar
        supportActionBar?.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.ac_b_ben))
        actionBar!!.setHomeButtonEnabled(true)
        actionBar.setDisplayHomeAsUpEnabled(true)

        val ml = findViewById<MotionLayout>(R.id.main_view_ben)
        ml.transitionToStart()
        date = findViewById(R.id.textView_vVod_ben)
        val button = findViewById<Button>(R.id.button_ben)
        rG = findViewById(R.id.radioGroup_sex)
        val vvod = findViewById<EditText>(R.id.vVod_ben)
        val can1 = findViewById<TextView>(R.id.textView_ben1)
        val can2 = findViewById<TextView>(R.id.textView_ben3)
        val can3 = findViewById<TextView>(R.id.textView_ben5)
        val can4 = findViewById<TextView>(R.id.textView_ben11)
        val can5 = findViewById<TextView>(R.id.textView_ben2)
        val at = findViewById<Button>(R.id.button_attention_ben)
        can1.setOnClickListener { closeET() }
        can2.setOnClickListener { closeET() }
        can3.setOnClickListener { closeET() }
        can4.setOnClickListener { closeET() }
        can5.setOnClickListener { closeET() }
        button.setOnClickListener { start() }
        at.setOnClickListener { alertDialog!!.show() }
        alertDialog = AlertDialog.Builder(this).create()
        alertDialog!!.setTitle(HtmlCompat.fromHtml("<font color='#026818'>Расчет основного обмена</font>", 2))
        alertDialog!!.setMessage("""
            Расчёт основного обмена для детей (ккал/день):
            мальчики:1–3года: (60,9 x вес в кг)–54
            3–10 лет: (22,7 x вес в кг) + 495
            10–18 лет: (17,5 x вес в кг)+ 651
            девочки:1–3года: (61 x вес в кг)–51
            3–10 лет: (22,5 x вес в кг) + 499
            10–18 лет: (12,2 x вес в кг)+ 746
            
            Формула расчёта фактической потребности больного в энергии (действительный расход энергии):
            ДРЕ = ОО х ФА х ФЗ х ФР х ФП х ТФ х ДМТ
            Будьте внимательны! В разных странах используются различные поправочные коэффициенты. Указывайте только те, которые посчитаете нужным. Неуказанные коэффициенты равны 1.0
            Расчет потребности в жидкости:
            масса тела 0–10 кг–100–150 мл/кг
            масса тела 10–20 кг–1000 мл на 10 кг + 50 мл/на каждый кг массы тела выше 10 кг
            более 20кг–1500 мл до 20 кг + 20 мл/на каждый кг массы тела выше 20 кг
            максимально–2400 мл/сутки
            """.trimIndent())
        alertDialog!!.setButton(AlertDialog.BUTTON_POSITIVE, "OK") { _: DialogInterface?, _: Int -> alertDialog!!.cancel() }
        vvod.setOnKeyListener(View.OnKeyListener setOnKeyListener@{ _: View?, keyCode: Int, event: KeyEvent ->
            if (event.action == KeyEvent.ACTION_DOWN &&
                    keyCode == KeyEvent.KEYCODE_ENTER) {
                val imm = getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager
                imm.toggleSoftInput(InputMethodManager.HIDE_IMPLICIT_ONLY, 0)
                return@setOnKeyListener true
            }
            false
        })
        val bnv = findViewById<BottomNavigationView>(R.id.bottomNav)
        bnv.setOnNavigationItemSelectedListener { item: MenuItem ->
            when (item.itemId) {
                R.id.startActivity -> {
                }
                R.id.secondActivity -> intent(MainChildActivity::class.java)
            }
            true
        }
    }

    fun showCalendar(view: View?) {
        val tpd = DatePickerDialog(this, android.app.AlertDialog.THEME_HOLO_LIGHT, myCallBack, myYear, myMonth, myDay)
        tpd.datePicker.maxDate = calMax.timeInMillis
        tpd.datePicker.minDate = calMin.timeInMillis
        tpd.show()
    }

    @SuppressLint("SetTextI18n")
    var myCallBack = OnDateSetListener { _, year, monthOfYear, dayOfMonth ->
        myYear = year
        myMonth = monthOfYear + 1
        myDay = dayOfMonth
        date!!.text = "Дата рождения: $myDay.$myMonth.$myYear"
    }

    fun start() {
        val date = findViewById<TextView>(R.id.textView_vVod_ben)
        val vVod = findViewById<EditText>(R.id.vVod_ben)
        val y = myYear
        val m = myMonth
        val d = myDay
        val myDate = Date(myYear, myMonth, myDay)
        val todayDate = Date()
        val duration = todayDate.time - myDate.time
        val diffAge = TimeUnit.MILLISECONDS.toDays(duration)
        val age = diffAge.toInt() + 693991
        if (TextUtils.isEmpty(vVod!!.text.toString()) or
                TextUtils.isEmpty(date!!.text.toString())) {
            return
        }
        val weight = vVod.text.toString().toDouble()
        val checked = rG!!.checkedRadioButtonId
        val intent = Intent(applicationContext, BenActivity::class.java)
        intent.putExtra("age", age)
        intent.putExtra("weight_ben", weight)
        intent.putExtra("year", y)
        intent.putExtra("month", m)
        intent.putExtra("day", d)
        intent.putExtra("sex", checked)
        startActivity(intent)
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
    }

    private fun closeET() {
        val vvod = findViewById<EditText>(R.id.vVod_ben)
        if (TextUtils.isEmpty(vvod!!.text.toString())) {
            return
        }
        vvod.clearFocus()
        val imm = getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager
        imm.toggleSoftInput(InputMethodManager.HIDE_IMPLICIT_ONLY, 0)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
            return true
        }
        return true
    }

    fun intent(activity: Class<*>?) {
        val intent = Intent(this, activity)
        startActivity(intent)
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
    }

    override fun onBackPressed() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
    }
}