package am.therapy.drawler_menu

import am.therapy.R
import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.core.content.res.ResourcesCompat

@SuppressLint("ViewConstructor")
class MainMenu(context: Context?, parent: RelativeLayout?) : RelativeLayout(context) {

    private fun initView(context: Context?, parent: RelativeLayout?) {
        val view = LayoutInflater.from(context).inflate(R.layout.main_menu, parent, true)
        val image = view.findViewById<ImageView>(R.id.imageView2)
        image.setImageResource(R.drawable.action_bar)
        val text0 = view.findViewById<TextView>(R.id.mainMenu_text0)
        val text1 = view.findViewById<TextView>(R.id.mainMenu_text1)
        val text2 = view.findViewById<TextView>(R.id.mainMenu_text2)
        val text3 = view.findViewById<TextView>(R.id.mainMenu_text3)
        @SuppressLint("UseCompatLoadingForDrawables") val imgRef = ResourcesCompat.getDrawable(resources, R.drawable.menu_refresh,null)
        @SuppressLint("UseCompatLoadingForDrawables") val imgGears = ResourcesCompat.getDrawable(resources, R.drawable.menu_gears,null)
        @SuppressLint("UseCompatLoadingForDrawables") val imgDoc = ResourcesCompat.getDrawable(resources, R.drawable.menu_doctor,null)
        @SuppressLint("UseCompatLoadingForDrawables") val imgFam = ResourcesCompat.getDrawable(resources, R.drawable.menu_family,null)
        imgRef?.setBounds(0, 0, 80, 50)
        imgGears?.setBounds(0, 0, 80, 50)
        imgDoc?.setBounds(0, 0, 80, 50)
        imgFam?.setBounds(0, 0, 80, 50)
        text0.setCompoundDrawables(imgRef, null, null, null)
        text1.setCompoundDrawables(imgGears, null, null, null)
        text2.setCompoundDrawables(imgDoc, null, null, null)
        text3.setCompoundDrawables(imgFam, null, null, null)
    }

    init {
        initView(context, parent)
    }
}