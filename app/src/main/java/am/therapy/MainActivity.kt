package am.therapy

import am.therapy.antibiotics.MainAntiActivity
import am.therapy.ben.standart.MainBenActivity
import am.therapy.drawler_menu.MainMenuParent
import am.therapy.hemolitic.MainGEMActivity
import am.therapy.pure.MainPRActivity
import am.therapy.weight.WeightActivity
import android.app.ActivityOptions
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.view.animation.AlphaAnimation
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.constraintlayout.motion.widget.MotionLayout
import androidx.core.content.ContextCompat
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.gms.ads.MobileAds
import java.util.*

class MainActivity : MainMenuParent() {

    private val buttonClick = AlphaAnimation(1f, 0.65f)

    private var leftDrawer: DrawerLayout? = null
    private var mainView: RelativeLayout? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        MobileAds.initialize(this) {}
        val actionBar = supportActionBar
        supportActionBar?.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.ac_b_anti))
        actionBar!!.setHomeButtonEnabled(true)
        actionBar.setDisplayHomeAsUpEnabled(true)

        val ml = findViewById<MotionLayout>(R.id.main_motion_view)
        ml.transitionToStart()
        val lec = findViewById<ImageView>(R.id.imageButtonLec)
        val pr = findViewById<ImageView>(R.id.imageButtonPR)
        val cent = findViewById<ImageView>(R.id.imageButtonCent)
        val gem = findViewById<ImageView>(R.id.imageButtonGEM)
        val ben = findViewById<ImageView>(R.id.imageButtonBen)
        val fu = findViewById<TextView>(R.id.textFU)
        val prep = findViewById<TextView>(R.id.text_main_prep)
        prep.setTextColor(Color.parseColor("#1F65FA"))
        val supp = findViewById<TextView>(R.id.text_support)
        supp.setTextColor(Color.parseColor("#1F65FA"))
        val send = findViewById<TextView>(R.id.text_send)
        leftDrawer = findViewById(R.id.mainMenu)
        mainView = findViewById(R.id.main_view_ab)
        lec.setOnClickListener { v: View ->
            v.animate().scaleX(0.95f).scaleY(0.95f).duration = 200
            v.startAnimation(buttonClick)
            intent(MainAntiActivity::class.java)
        }
        pr.setOnClickListener { v: View ->
            v.animate().scaleX(0.95f).scaleY(0.95f).duration = 200
            v.startAnimation(buttonClick)
            intent(MainPRActivity::class.java)
        }
        cent.setOnClickListener { v: View ->
            v.animate().scaleX(0.95f).scaleY(0.95f).duration = 200
            v.startAnimation(buttonClick)
            intent(WeightActivity::class.java)
        }
        gem.setOnClickListener { v: View ->
            v.animate().scaleX(0.95f).scaleY(0.95f).duration = 200
            v.startAnimation(buttonClick)
            intent(MainGEMActivity::class.java)
        }
        ben.setOnClickListener { v: View ->
            v.animate().scaleX(0.95f).scaleY(0.95f).duration = 200
            v.startAnimation(buttonClick)
            intent(MainBenActivity::class.java)
        }
        fu.setOnClickListener { fu() }
        prep.setOnClickListener { v: View ->
            v.startAnimation(buttonClick)
            val intent = Intent(applicationContext, PrepareActivity::class.java)
            startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(this).toBundle())
        }
        supp.setOnClickListener { v: View ->
            v.startAnimation(buttonClick)
            val intent = Intent(applicationContext, SupportActivity::class.java)
            startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(this).toBundle())
        }
        send.setOnClickListener { v: View ->
            v.startAnimation(buttonClick)
            send()
        }
    }

    override fun intent(activity: Class<*>?) {
        val intent = Intent(this, activity)
        startActivity(intent)
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
    }

    private fun send() {
        val sendIntent = Intent()
        sendIntent.action = Intent.ACTION_SEND
        sendIntent.putExtra(Intent.EXTRA_TEXT, "https://play.google.com/store/apps/details?id=com.amtherapy")
        sendIntent.type = "text/plain"
        val shareIntent = Intent.createChooser(sendIntent, "Поделиться AmTherapy")
        startActivity(shareIntent)
    }

    private fun fu() {
        val array = resources.getStringArray(R.array.things)
        val randomValue = array[Random().nextInt(array.size)]
        val intent = Intent(applicationContext, ThingsActivity::class.java)
        intent.putExtra("thing", randomValue)
        startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(this).toBundle())
    }

    override fun onBackPressed() {
        finishAffinity()
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            val drawer = findViewById<DrawerLayout>(R.id.a_activity_view)
            if (drawer.isDrawerOpen(GravityCompat.START)) {
                drawer.closeDrawer(GravityCompat.START)
            } else {
                drawer.open()
            }
        }
        return true
    }
}