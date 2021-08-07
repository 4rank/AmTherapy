package am.therapy.langswap

import am.therapy.MainActivity
import am.therapy.R
import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import android.view.animation.AlphaAnimation
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat


@Suppress("DEPRECATION")
class LangSwapperActivity : AppCompatActivity() {

    private val buttonClick = AlphaAnimation(1f, 0.65f)

    @SuppressLint("CommitPrefEdits")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.lang_swaper_activity)

        val actionBar = supportActionBar
        supportActionBar?.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.ac_b_anti))
        actionBar!!.setHomeButtonEnabled(true)
        actionBar.setTitle(R.string.back_menu)
        actionBar.setDisplayHomeAsUpEnabled(true)
        val eng = findViewById<LinearLayout>(R.id.ll_swaplang_eng)
        val ru = findViewById<LinearLayout>(R.id.ll_swaplang_ru)
        val exit = findViewById<Button>(R.id.button_swaplang_exit)
        val text = findViewById<TextView>(R.id.textView_swaplang)
        val imageEng = findViewById<ImageView>(R.id.image_eng)
        val imageRu = findViewById<ImageView>(R.id.image_ru)
        val lang = text.text.toString()
        if(lang == "Select application language:"){
            imageEng.alpha = 1.0f
            imageRu.alpha = 0.0f
        }
        else if (lang =="Выберите язык приложения:"){
            imageEng.alpha = 0.0f
            imageRu.alpha = 1.0f
        }
        val sharedPreference =SharedPreference(this)
        eng.setOnClickListener {
            it.startAnimation(buttonClick)
            sharedPreference.save("lang",1)
            val intent = Intent(this, MainActivity::class.java)
            finish()
            startActivity(intent)
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
        }
        ru.setOnClickListener {
            it.startAnimation(buttonClick)
            sharedPreference.save("lang",2)
            val intent = Intent(this, MainActivity::class.java)
            finish()
            startActivity(intent)
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
        }
        exit.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
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