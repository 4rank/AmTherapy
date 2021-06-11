package am.therapy

import android.annotation.SuppressLint
import android.app.ActivityOptions
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.content.res.ResourcesCompat

class ThingsActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.things_activity)

        supportActionBar?.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.ac_b_anti))

        val args = intent.extras
        val thing = args!!["thing"] as String?
        val gt = findViewById<TextView>(R.id.text_things)
        @SuppressLint("UseCompatLoadingForDrawables") val flag = ResourcesCompat.getDrawable(resources, R.drawable.belarus,null)
        flag?.setBounds(0, 0, 630, 350)
        if (thing.equals("жыве")){
            gt.text = "Жыве Вечна!"
            gt.setCompoundDrawables(null, null, null, flag)
        }
        else{
            gt.text = thing
        }
        val exit = findViewById<Button>(R.id.button_thing)
        exit.setOnClickListener {
            val intent = Intent(applicationContext, MainActivity::class.java)
            startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(this).toBundle())
        }
    }
}