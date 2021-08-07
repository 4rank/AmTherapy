package am.therapy.drawler_menu

import am.therapy.R
import am.therapy.dbhelper.ConvertDozeActivity
import am.therapy.icd.icd10.MainICD10
import am.therapy.langswap.LangSwapperActivity
import am.therapy.langswap.SharedPreference
import android.annotation.SuppressLint
import android.app.ActivityOptions
import android.content.DialogInterface
import android.content.Intent
import android.content.SharedPreferences
import android.content.res.Configuration
import android.net.Uri
import android.view.View
import android.view.animation.AlphaAnimation
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.text.HtmlCompat
import java.util.*

@Suppress("DEPRECATION")
open class MainMenuParent : AppCompatActivity() {

    private val buttonClick = AlphaAnimation(1f, 0.65f)
    private val savedPref = "0"
    private var settings: SharedPreferences? = null
    private var navigationLayout: MainMenu? = null
    private var alertDialog: AlertDialog? = null

    override fun setContentView(@LayoutRes layoutResID: Int) {
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
        super.setContentView(layoutResID)
        setupMenu()
        settings = getSharedPreferences("settings", MODE_PRIVATE)
    }

    @SuppressLint("SetTextI18n")
    private fun setupMenu() {
        val sharedPreference = SharedPreference(this)
        val lang = sharedPreference.getValueInt("lang")
        val leftDrawer = findViewById<RelativeLayout>(R.id.left_drawer)
        navigationLayout = MainMenu(applicationContext, leftDrawer)
        leftDrawer.addView(navigationLayout)
        val text0 = findViewById<TextView>(R.id.mainMenu_text0)
        val text1 = findViewById<TextView>(R.id.mainMenu_text1)
        val text2 = findViewById<TextView>(R.id.mainMenu_text2)
        val text3 = findViewById<TextView>(R.id.mainMenu_text3)
        val text4 = findViewById<TextView>(R.id.mainMenu_text4)
//        val text5 = findViewById<TextView>(R.id.mainMenu_text5)
        val text6 = findViewById<TextView>(R.id.mainMenu_text6)
        val textMain = findViewById<TextView>(R.id.mainMenu_text_top)
        when (lang) {
            1 -> {
                text0.text = "Check for updates"
                text1.text = "Change dosages"
                text2.text = "Information for a doctor"
                text3.text = "Information for parents"
                text4.text = "ICD-10 reference"
//                text5.text = "ICD-11 reference"
                text6.text = "App Language"
                textMain.text = "Settings"
            }
            2 -> {
                text0.text = "Проверка обновлений"
                text1.text = "Изменение дозировок"
                text2.text = "Информация для врача"
                text3.text = "Информация для родителей"
                text4.text = "Справочник МКБ-10"
//                text5.text = "Справочник МКБ-11"
                text6.text = "Язык приложения"
                textMain.text = "Настройки"
            }
            else -> {
                text0.setText(R.string.menu_text0)
                text1.setText(R.string.menu_text1)
                text2.setText(R.string.menu_text2)
                text3.setText(R.string.menu_text3)
                text4.setText(R.string.menu_text4)
//                text5.setText(R.string.menu_text5)
                text6.setText(R.string.menu_text6)
                textMain.setText(R.string.main_menu_top_image)
            }
        }
        val ad1 = getString(R.string.drawler_menu1)
        val ad2 = getString(R.string.drawler_menu2)
        text0.setOnClickListener { v: View ->
            v.startAnimation(buttonClick)
            val uriIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.amtherapy"))
            startActivity(uriIntent)
        }
        text1.setOnClickListener { v: View ->
            v.startAnimation(buttonClick)
            val settings = getPreferences(MODE_PRIVATE)
            val check = settings.getString(savedPref, "")
            if (check == "1") {
                intent(ConvertDozeActivity::class.java)
            } else {
                alertMessage()
            }
        }
        text2.setOnClickListener { v: View ->
            v.startAnimation(buttonClick)
            intentInfo(getString(R.string.menu_info_doctor), ad1)
        }
        text3.setOnClickListener { v: View ->
            v.startAnimation(buttonClick)
            intentInfo(getString(R.string.menu_info_parent), ad2)
        }
        text4.setOnClickListener { v: View ->
            v.startAnimation(buttonClick)
            intent(MainICD10::class.java)
        }
//        text5.setOnClickListener { v: View ->
//            v.startAnimation(buttonClick)
//            intent(MainICD11::class.java)
//        }
        text6.setOnClickListener { v: View ->
            v.startAnimation(buttonClick)
            intent(LangSwapperActivity::class.java)
        }
    }

    open fun intent(activity: Class<*>?) {
        startActivity(Intent(this, activity), ActivityOptions.makeSceneTransitionAnimation(this).toBundle())
    }

    private fun intentInfo(text: String?, title: String?) {
        val intent = Intent(applicationContext, MainMenuInfoActivity::class.java)
        intent.putExtra("info", text)
        intent.putExtra("title", title)
        startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(this).toBundle())
    }

    @SuppressLint("WrongConstant")
    fun alertMessage() {
        val ad1 = getString(R.string.drawler_menu3)
        val ad2 = getString(R.string.drawler_menu4)
        val ad3 = getString(R.string.drawler_menu5)
        alertDialog = AlertDialog.Builder(this).create()
        alertDialog!!.setTitle(HtmlCompat.fromHtml("<font color='#DF0101'>$ad1</font>", 9))
        alertDialog!!.setIcon(R.drawable.attention)
        alertDialog!!.setMessage(getString(R.string.alert_ab_doze))
        alertDialog!!.setButton(AlertDialog.BUTTON_POSITIVE, ad2) { _: DialogInterface?, _: Int ->
            val settings = getPreferences(MODE_PRIVATE)
            val ed = settings.edit()
            ed.putString(savedPref, "1")
            ed.apply()
            intent(ConvertDozeActivity::class.java)
        }
        alertDialog!!.setButton(AlertDialog.BUTTON_NEGATIVE, ad3) { _: DialogInterface?, _: Int -> alertDialog!!.cancel() }
        alertDialog!!.show()
    }
}