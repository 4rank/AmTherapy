package am.therapy

import am.therapy.langswap.SharedPreference
import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import java.util.*


@Suppress("DEPRECATION")
class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val sharedPreference = SharedPreference(this)
        val lang = sharedPreference.getValueInt("lang")
        if (lang==1){
            val locale1 = Locale("en")
            Locale.setDefault(locale1)
            val config2 = Configuration()
            config2.locale = locale1
            baseContext.resources.updateConfiguration(
                    config2, baseContext.resources.displayMetrics)
        }
        if (lang==2){
            val locale2 = Locale("ru")
            Locale.setDefault(locale2)
            val config2 = Configuration()
            config2.locale = locale2
            baseContext.resources.updateConfiguration(
                    config2, baseContext.resources.displayMetrics)
        }
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}