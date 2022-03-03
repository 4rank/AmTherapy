package am.therapy.icd.icd11

import am.therapy.data.Storage
import am.therapy.MainActivity
import am.therapy.R
import am.therapy.icd.search.SearchICD11Activity
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.MenuItem
import android.view.animation.AlphaAnimation
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView


class MainICD11 : AppCompatActivity() {

    private val buttonClick = AlphaAnimation(1f, 0.65f)
    lateinit var mAdView : AdView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.icd11_main)

        val actionBar = supportActionBar
        supportActionBar?.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.ac_b_anti))
        actionBar!!.setHomeButtonEnabled(true)
        actionBar.setTitle(R.string.back_menu)
        actionBar.setDisplayHomeAsUpEnabled(true)

        val text1 = findViewById<TextView>(R.id.icd11_title1)
        val text2 = findViewById<TextView>(R.id.icd11_title2)
        val text3 = findViewById<TextView>(R.id.icd11_title3)
        val text4 = findViewById<TextView>(R.id.icd11_title4)
        val text5 = findViewById<TextView>(R.id.icd11_title5)
        val text6 = findViewById<TextView>(R.id.icd11_title6)
        val text7 = findViewById<TextView>(R.id.icd11_title7)
        val text8 = findViewById<TextView>(R.id.icd11_title8)
        val text9 = findViewById<TextView>(R.id.icd11_title9)
        val text10 = findViewById<TextView>(R.id.icd11_title10)
        val text11 = findViewById<TextView>(R.id.icd11_title11)
        val text12 = findViewById<TextView>(R.id.icd11_title12)
        val text13 = findViewById<TextView>(R.id.icd11_title13)
        val text14 = findViewById<TextView>(R.id.icd11_title14)
        val text15 = findViewById<TextView>(R.id.icd11_title15)
        val text16 = findViewById<TextView>(R.id.icd11_title16)
        val text17 = findViewById<TextView>(R.id.icd11_title17)
        val text18 = findViewById<TextView>(R.id.icd11_title18)
        val text19 = findViewById<TextView>(R.id.icd11_title19)
        val text20 = findViewById<TextView>(R.id.icd11_title20)
        val text21 = findViewById<TextView>(R.id.icd11_title21)
        val text22 = findViewById<TextView>(R.id.icd11_title22)
        val text23 = findViewById<TextView>(R.id.icd11_title23)
        val text24 = findViewById<TextView>(R.id.icd11_title24)
        val text25 = findViewById<TextView>(R.id.icd11_title25)
        val text26 = findViewById<TextView>(R.id.icd11_title26)
        val textV = findViewById<TextView>(R.id.icd11_title_v)
        val textX = findViewById<TextView>(R.id.icd11_title_x)
        text1.setTextColor(Color.parseColor("#1F65FA"))
        text2.setTextColor(Color.parseColor("#1F65FA"))
        text3.setTextColor(Color.parseColor("#1F65FA"))
        text4.setTextColor(Color.parseColor("#1F65FA"))
        text5.setTextColor(Color.parseColor("#1F65FA"))
        text6.setTextColor(Color.parseColor("#1F65FA"))
        text7.setTextColor(Color.parseColor("#1F65FA"))
        text8.setTextColor(Color.parseColor("#1F65FA"))
        text9.setTextColor(Color.parseColor("#1F65FA"))
        text10.setTextColor(Color.parseColor("#1F65FA"))
        text11.setTextColor(Color.parseColor("#1F65FA"))
        text12.setTextColor(Color.parseColor("#1F65FA"))
        text13.setTextColor(Color.parseColor("#1F65FA"))
        text14.setTextColor(Color.parseColor("#1F65FA"))
        text15.setTextColor(Color.parseColor("#1F65FA"))
        text16.setTextColor(Color.parseColor("#1F65FA"))
        text17.setTextColor(Color.parseColor("#1F65FA"))
        text18.setTextColor(Color.parseColor("#1F65FA"))
        text19.setTextColor(Color.parseColor("#1F65FA"))
        text20.setTextColor(Color.parseColor("#1F65FA"))
        text21.setTextColor(Color.parseColor("#1F65FA"))
        text22.setTextColor(Color.parseColor("#1F65FA"))
        text23.setTextColor(Color.parseColor("#1F65FA"))
        text24.setTextColor(Color.parseColor("#1F65FA"))
        text25.setTextColor(Color.parseColor("#1F65FA"))
        text26.setTextColor(Color.parseColor("#1F65FA"))
        textV.setTextColor(Color.parseColor("#1F65FA"))
        textX.setTextColor(Color.parseColor("#1F65FA"))
        val search =findViewById<Button>(R.id.search_button_icd11)
        val but = findViewById<Button>(R.id.button_icd11_main)
        but.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
        }
        search.setOnClickListener {
            val intent = Intent(this, SearchICD11Activity::class.java)
            startActivity(intent)
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
        }
        text1.setOnClickListener {
            it.startAnimation(buttonClick)
            intent(1, R.string.icd11_title1)
        }
        text2.setOnClickListener {
            it.startAnimation(buttonClick)
            intent(2, R.string.icd11_title2)
        }
        text3.setOnClickListener {
            it.startAnimation(buttonClick)
            intent(3, R.string.icd11_title3)
        }
        text4.setOnClickListener {
            it.startAnimation(buttonClick)
            intent(4, R.string.icd11_title4)
        }
        text5.setOnClickListener {
            it.startAnimation(buttonClick)
            intent(5, R.string.icd11_title5)
        }
        text6.setOnClickListener {
            it.startAnimation(buttonClick)
            intent(6, R.string.icd11_title6)
        }
        text7.setOnClickListener {
            it.startAnimation(buttonClick)
            intent(7, R.string.icd11_title7)
        }
        text8.setOnClickListener {
            it.startAnimation(buttonClick)
            intent(8, R.string.icd11_title8)
        }
        text9.setOnClickListener {
            it.startAnimation(buttonClick)
            intent(9, R.string.icd11_title9)
        }
        text10.setOnClickListener {
            it.startAnimation(buttonClick)
            intent(10, R.string.icd11_title10)
        }
        text11.setOnClickListener {
            it.startAnimation(buttonClick)
            intent(11, R.string.icd11_title11)
        }
        text12.setOnClickListener {
            it.startAnimation(buttonClick)
            intent(12, R.string.icd11_title12)
        }
        text13.setOnClickListener {
            it.startAnimation(buttonClick)
            intent(13, R.string.icd11_title13)
        }
        text14.setOnClickListener {
            it.startAnimation(buttonClick)
            intent(14, R.string.icd11_title14)
        }
        text15.setOnClickListener {
            it.startAnimation(buttonClick)
            intent(15, R.string.icd11_title15)
        }
        text16.setOnClickListener {
            it.startAnimation(buttonClick)
            intent(16, R.string.icd11_title16)
        }
        text17.setOnClickListener {
            it.startAnimation(buttonClick)
            intent(17, R.string.icd11_title17)
        }
        text18.setOnClickListener {
            it.startAnimation(buttonClick)
            intent(18, R.string.icd11_title18)
        }
        text19.setOnClickListener {
            it.startAnimation(buttonClick)
            intent(19, R.string.icd11_title19)
        }
        text20.setOnClickListener {
            it.startAnimation(buttonClick)
            intent(20, R.string.icd11_title20)
        }
        text21.setOnClickListener {
            it.startAnimation(buttonClick)
            intent(21, R.string.icd11_title21)
        }
        text22.setOnClickListener {
            it.startAnimation(buttonClick)
            intent(22, R.string.icd11_title22)
        }
        text23.setOnClickListener {
            it.startAnimation(buttonClick)
            intent(23, R.string.icd11_title23)
        }
        text24.setOnClickListener {
            it.startAnimation(buttonClick)
            intent(24, R.string.icd11_title24)
        }
        text25.setOnClickListener {
            it.startAnimation(buttonClick)
            intent(25, R.string.icd11_title25)
        }
        text26.setOnClickListener {
            it.startAnimation(buttonClick)
            intent(26, R.string.icd11_title26)
        }
        textV.setOnClickListener {
            it.startAnimation(buttonClick)
            intent(27, R.string.icd11_title_v)
        }
        textX.setOnClickListener {
            it.startAnimation(buttonClick)
            intent(28, R.string.icd11_title_x)
        }
    }

    private fun intent(key: Int?, id: Int) {
        val intent = Intent(applicationContext, ICD11::class.java)
        if (key != null) {
            Storage.tokenIcd11 = key
        }
        intent.putExtra("id_icd11", id)
        startActivity(intent)
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
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
}