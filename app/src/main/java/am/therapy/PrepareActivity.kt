package am.therapy

import android.annotation.SuppressLint
import android.app.ActivityOptions
import android.content.ClipData
import android.content.ClipboardManager
import android.content.Intent
import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.view.Gravity
import android.view.MenuItem
import android.view.View
import android.view.animation.AlphaAnimation
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat

@Suppress("DEPRECATION")
class PrepareActivity : AppCompatActivity() {
    private val buttonClick = AlphaAnimation(1f, 0.65f)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.prepare_activity)

        val actionBar = supportActionBar
        supportActionBar?.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.ac_b_anti))
        actionBar!!.setHomeButtonEnabled(true)
        actionBar.setTitle(R.string.back_menu)
        actionBar.setDisplayHomeAsUpEnabled(true)

        val email = findViewById<TextView>(R.id.text_email)
        email.setTextColor(Color.parseColor("#1F65FA"))
        email.setOnClickListener { v: View ->
            v.startAnimation(buttonClick)
            copyToClipboard("fr4nk.universe@gmail.com")
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            startActivity(Intent(this, MainActivity::class.java), ActivityOptions.makeSceneTransitionAnimation(this).toBundle())
            return true
        }
        return true
    }

    @SuppressLint("RtlHardcoded")
    fun copyToClipboard(copyText: String?) {
        val email= getString(R.string.main_mail)
        val sdk = Build.VERSION.SDK_INT
        if (sdk < Build.VERSION_CODES.HONEYCOMB) {
            val clipboard = getSystemService(CLIPBOARD_SERVICE) as ClipboardManager
            clipboard.text = copyText
        } else {
            val clipboard = getSystemService(CLIPBOARD_SERVICE) as ClipboardManager
            val clip = ClipData
                    .newPlainText("fr4nk.universe@gmail.com", copyText)
            clipboard.setPrimaryClip(clip)
        }
        val toast = Toast.makeText(applicationContext,
                email, Toast.LENGTH_SHORT)
        toast.setGravity(Gravity.BOTTOM or Gravity.RIGHT, 50, 50)
        toast.show()
    }

}