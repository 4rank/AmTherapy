package am.therapy.drawler_menu

import am.therapy.R
import am.therapy.langswap.SharedPreference
import android.annotation.SuppressLint
import android.content.Context
import android.content.res.Configuration
import android.os.Build
import android.view.LayoutInflater
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.core.content.res.ResourcesCompat
import java.util.*


@Suppress("DEPRECATION")
@SuppressLint("ViewConstructor")
class MainMenu(context: Context?, parent: RelativeLayout?) : RelativeLayout(context) {

    private fun initView(context: Context?, parent: RelativeLayout?) {
        val view = LayoutInflater.from(context).inflate(R.layout.main_menu, parent, true)
        val image = view.findViewById<ImageView>(R.id.imageView2)
        image.setImageResource(R.drawable.drawler_image)
        val text0 = view.findViewById<TextView>(R.id.mainMenu_text0)
        val text1 = view.findViewById<TextView>(R.id.mainMenu_text1)
        val text2 = view.findViewById<TextView>(R.id.mainMenu_text2)
        val text3 = view.findViewById<TextView>(R.id.mainMenu_text3)
        val text4 = view.findViewById<TextView>(R.id.mainMenu_text4)
//        val text5 = view.findViewById<TextView>(R.id.mainMenu_text5)
        val text6 = view.findViewById<TextView>(R.id.mainMenu_text6)
        val sharedPreference = context?.let { SharedPreference(it) }
        val lang = sharedPreference?.getValueInt("lang")
        if (lang==1){
            val locale1 = Locale("en")
            Locale.setDefault(locale1)
            val config2 = Configuration()
            config2.locale = locale1
        }
        if (lang==2){
            val locale2 = Locale("ru")
            Locale.setDefault(locale2)
            val config2 = Configuration()
            config2.locale = locale2
        }
        val sdk = Build.VERSION.SDK_INT
        if (sdk <= Build.VERSION_CODES.N_MR1) {
            text0.setCompoundDrawablesWithIntrinsicBounds(
                    R.drawable.menu_refresh_24sdk, 0, 0, 0)
            text1.setCompoundDrawablesWithIntrinsicBounds(
                    R.drawable.menu_gears_24sdk, 0, 0, 0)
            text2.setCompoundDrawablesWithIntrinsicBounds(
                    R.drawable.menu_doctor_24sdk, 0, 0, 0)
            text3.setCompoundDrawablesWithIntrinsicBounds(
                    R.drawable.menu_family_24sdk, 0, 0, 0)
            text4.setCompoundDrawablesWithIntrinsicBounds(
                    R.drawable.menu_icd10_24sdk, 0, 0, 0)
//            text5.setCompoundDrawablesWithIntrinsicBounds(
//                    R.drawable.menu_icd11_24sdk, 0, 0, 0)
            text6.setCompoundDrawablesWithIntrinsicBounds(
                    R.drawable.menu_lang_24sdk, 0, 0, 0)
        } else {
            val imgRef = ResourcesCompat.getDrawable(resources, R.drawable.menu_refresh, null)
            val imgGears = ResourcesCompat.getDrawable(resources, R.drawable.menu_gears, null)
            val imgDoc = ResourcesCompat.getDrawable(resources, R.drawable.menu_doctor, null)
            val imgFam = ResourcesCompat.getDrawable(resources, R.drawable.menu_family, null)
            val imgIcd10 = ResourcesCompat.getDrawable(resources, R.drawable.menu_icd10, null)
//            val imgIcd11 = ResourcesCompat.getDrawable(resources, R.drawable.menu_icd11, null)
            val imgLang = ResourcesCompat.getDrawable(resources, R.drawable.menu_lang, null)
            imgRef?.setBounds(0, 0, 80, 50)
            imgGears?.setBounds(0, 0, 80, 50)
            imgDoc?.setBounds(0, 0, 80, 50)
            imgFam?.setBounds(0, 0, 80, 50)
            imgIcd10?.setBounds(0, 0, 80, 50)
//            imgIcd11?.setBounds(0, 0, 80, 50)
            imgLang?.setBounds(0, 0, 80, 50)
            text0.setCompoundDrawables(imgRef, null, null, null)
            text1.setCompoundDrawables(imgGears, null, null, null)
            text2.setCompoundDrawables(imgDoc, null, null, null)
            text3.setCompoundDrawables(imgFam, null, null, null)
            text4.setCompoundDrawables(imgIcd10, null, null, null)
//            text5.setCompoundDrawables(imgIcd11, null, null, null)
            text6.setCompoundDrawables(imgLang, null, null, null)
        }
    }

    init {
        initView(context, parent)
    }
}