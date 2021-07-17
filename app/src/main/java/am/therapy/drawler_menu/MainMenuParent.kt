package am.therapy.drawler_menu

import am.therapy.R
import am.therapy.dbhelper.ConvertDozeActivity
import am.therapy.icd.MainICD10
import android.annotation.SuppressLint
import android.app.ActivityOptions
import android.content.DialogInterface
import android.content.Intent
import android.content.SharedPreferences
import android.net.Uri
import android.view.View
import android.view.animation.AlphaAnimation
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.text.HtmlCompat

open class MainMenuParent : AppCompatActivity() {

    private val buttonClick = AlphaAnimation(1f, 0.65f)
    private val savedPref = "0"
    private var settings: SharedPreferences? = null
    private var navigationLayout: MainMenu? = null
    private var alertDialog: AlertDialog? = null

    override fun setContentView(@LayoutRes layoutResID: Int) {
        super.setContentView(layoutResID)
        setupMenu()
        settings = getSharedPreferences("settings", MODE_PRIVATE)
    }

    private fun setupMenu() {
        val leftDrawer = findViewById<RelativeLayout>(R.id.left_drawer)
        navigationLayout = MainMenu(applicationContext, leftDrawer)
        leftDrawer.addView(navigationLayout)
        val text0 = findViewById<TextView>(R.id.mainMenu_text0)
        val text1 = findViewById<TextView>(R.id.mainMenu_text1)
        val text2 = findViewById<TextView>(R.id.mainMenu_text2)
        val text3 = findViewById<TextView>(R.id.mainMenu_text3)
        val text4 = findViewById<TextView>(R.id.mainMenu_text4)
//        val text5 = findViewById<TextView>(R.id.mainMenu_text5)
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
            intentInfo(getString(R.string.menu_info_doctor), "Дополнительня информация для врача")
        }
        text3.setOnClickListener { v: View ->
            v.startAnimation(buttonClick)
            intentInfo(getString(R.string.menu_info_parent), "Дополнительная информация для родителей")
        }
        text4.setOnClickListener { v: View ->
            v.startAnimation(buttonClick)
            intent(MainICD10::class.java)
        }
//        text5.setOnClickListener { v: View ->
//            v.startAnimation(buttonClick)
//            intent(MainICD11::class.java)
//        }
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
        alertDialog = AlertDialog.Builder(this).create()
        alertDialog!!.setTitle(HtmlCompat.fromHtml("<font color='#DF0101'>ВНИМАНИЕ!</font>", 9))
        alertDialog!!.setIcon(R.drawable.attention)
        alertDialog!!.setMessage(getString(R.string.alert_ab_doze))
        alertDialog!!.setButton(AlertDialog.BUTTON_POSITIVE, "Далее") { _: DialogInterface?, _: Int ->
            val settings = getPreferences(MODE_PRIVATE)
            val ed = settings.edit()
            ed.putString(savedPref, "1")
            ed.apply()
            intent(ConvertDozeActivity::class.java)
        }
        alertDialog!!.setButton(AlertDialog.BUTTON_NEGATIVE, "Отмена") { _: DialogInterface?, _: Int -> alertDialog!!.cancel() }
        alertDialog!!.show()
    }
}