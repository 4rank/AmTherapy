package am.therapy.drawler_menu

import am.therapy.MainActivity
import am.therapy.R
import am.therapy.langswap.SharedPreference
import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import java.util.*

@Suppress("DEPRECATION")
class MainMenuInfoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val sharedPreference = SharedPreference(this)
        setContentView(R.layout.menu_info)

        val actionBar = supportActionBar
        supportActionBar?.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.ac_b_anti))
        actionBar!!.setHomeButtonEnabled(true)
        actionBar.setTitle(R.string.back_menu)
        actionBar.setDisplayHomeAsUpEnabled(true)

        val text = findViewById<TextView>(R.id.menu_info_text)
        val textTitle = findViewById<TextView>(R.id.menu_info_title)
        val args = intent.extras
        val textInfo = args!!["info"] as String?
        val title = args["title"] as String?
        textTitle.text = title
        text.text = textInfo
        val but = findViewById<Button>(R.id.button_menu_info)
        but.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
        }
        val lang = sharedPreference.getValueInt("lang")
        if (lang==1){
            val locale1 = Locale("en")
            Locale.setDefault(locale1)
            val config1 = Configuration()
            config1.locale = locale1
            baseContext.resources.updateConfiguration(
                    config1, baseContext.resources.displayMetrics)
        }
        if (lang==2){
            val locale2 = Locale("ru")
            Locale.setDefault(locale2)
            val config2 = Configuration()
            config2.locale = locale2
            baseContext.resources.updateConfiguration(
                    config2, baseContext.resources.displayMetrics)
        }
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