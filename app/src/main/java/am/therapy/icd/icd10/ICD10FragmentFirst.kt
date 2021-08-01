package am.therapy.icd.icd10

import am.therapy.R
import am.therapy.data.*
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

const val DES_DIF = "des_dif"
const val DES_DIF_NAME_RU = "des_dif_name_ru"
const val DES_DIF_NAME_ENG = "des_dif_name_eng"
const val DES_VALUE = "des_values"

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class ICD10FragmentFirst : Fragment() {

    private lateinit var recycler: RecyclerView
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?,
    ): View? {
        val startFragment = inflater.inflate(R.layout.icd10_fragment_first, container, false)
        recyclerStart(startFragment)
        return startFragment
    }

    private fun recyclerStart(view: View) {
        val key = Storage.token
        recycler = view.findViewById(R.id.RecyclerView)
        if (key==1){
            val adapter = AdapterICD10(deseases1) {
                val intent = Intent(this.context, ICD10Second::class.java)
                intent.putExtra(DES_DIF, it.desDif)
                intent.putExtra(DES_DIF_NAME_RU, it.desDifNameRU)
                intent.putExtra(DES_DIF_NAME_ENG, it.desDifNameENG)
                intent.putExtra(DES_VALUE, it.desICD)
                startActivity(intent)
            }
            recycler.adapter = adapter
            recycler.layoutManager =
                    LinearLayoutManager(this.context, LinearLayoutManager.VERTICAL, false)
        }
        if (key==2){
            val adapter = AdapterICD10(deseases2) {
                val intent = Intent(this.context, ICD10Second::class.java)
                intent.putExtra(DES_DIF, it.desDif)
                intent.putExtra(DES_DIF_NAME_RU, it.desDifNameRU)
                intent.putExtra(DES_DIF_NAME_ENG, it.desDifNameENG)
                intent.putExtra(DES_VALUE, it.desICD)
                startActivity(intent)
            }
            recycler.adapter = adapter
            recycler.layoutManager =
                    LinearLayoutManager(this.context, LinearLayoutManager.VERTICAL, false)
        }
        if (key==3){
            val adapter = AdapterICD10(deseases3) {
                val intent = Intent(this.context, ICD10Second::class.java)
                intent.putExtra(DES_DIF, it.desDif)
                intent.putExtra(DES_DIF_NAME_RU, it.desDifNameRU)
                intent.putExtra(DES_DIF_NAME_ENG, it.desDifNameENG)
                intent.putExtra(DES_VALUE, it.desICD)
                startActivity(intent)
            }
            recycler.adapter = adapter
            recycler.layoutManager =
                    LinearLayoutManager(this.context, LinearLayoutManager.VERTICAL, false)
        }
        if (key==4){
            val adapter = AdapterICD10(deseases4) {
                val intent = Intent(this.context, ICD10Second::class.java)
                intent.putExtra(DES_DIF, it.desDif)
                intent.putExtra(DES_DIF_NAME_RU, it.desDifNameRU)
                intent.putExtra(DES_DIF_NAME_ENG, it.desDifNameENG)
                intent.putExtra(DES_VALUE, it.desICD)
                startActivity(intent)
            }
            recycler.adapter = adapter
            recycler.layoutManager =
                    LinearLayoutManager(this.context, LinearLayoutManager.VERTICAL, false)
        }
        if (key==5){
            val adapter = AdapterICD10(deseases5) {
                val intent = Intent(this.context, ICD10Second::class.java)
                intent.putExtra(DES_DIF, it.desDif)
                intent.putExtra(DES_DIF_NAME_RU, it.desDifNameRU)
                intent.putExtra(DES_DIF_NAME_ENG, it.desDifNameENG)
                intent.putExtra(DES_VALUE, it.desICD)
                startActivity(intent)
            }
            recycler.adapter = adapter
            recycler.layoutManager =
                    LinearLayoutManager(this.context, LinearLayoutManager.VERTICAL, false)
        }
        if (key==6){
            val adapter = AdapterICD10(deseases6) {
                val intent = Intent(this.context, ICD10Second::class.java)
                intent.putExtra(DES_DIF, it.desDif)
                intent.putExtra(DES_DIF_NAME_RU, it.desDifNameRU)
                intent.putExtra(DES_DIF_NAME_ENG, it.desDifNameENG)
                intent.putExtra(DES_VALUE, it.desICD)
                startActivity(intent)
            }
            recycler.adapter = adapter
            recycler.layoutManager =
                    LinearLayoutManager(this.context, LinearLayoutManager.VERTICAL, false)
        }
        if (key==7){
            val adapter = AdapterICD10(deseases7) {
                val intent = Intent(this.context, ICD10Second::class.java)
                intent.putExtra(DES_DIF, it.desDif)
                intent.putExtra(DES_DIF_NAME_RU, it.desDifNameRU)
                intent.putExtra(DES_DIF_NAME_ENG, it.desDifNameENG)
                intent.putExtra(DES_VALUE, it.desICD)
                startActivity(intent)
            }
            recycler.adapter = adapter
            recycler.layoutManager =
                    LinearLayoutManager(this.context, LinearLayoutManager.VERTICAL, false)
        }
        if (key==8){
            val adapter = AdapterICD10(deseases8) {
                val intent = Intent(this.context, ICD10Second::class.java)
                intent.putExtra(DES_DIF, it.desDif)
                intent.putExtra(DES_DIF_NAME_RU, it.desDifNameRU)
                intent.putExtra(DES_DIF_NAME_ENG, it.desDifNameENG)
                intent.putExtra(DES_VALUE, it.desICD)
                startActivity(intent)
            }
            recycler.adapter = adapter
            recycler.layoutManager =
                    LinearLayoutManager(this.context, LinearLayoutManager.VERTICAL, false)
        }
        if (key==9){
            val adapter = AdapterICD10(deseases9) {
                val intent = Intent(this.context, ICD10Second::class.java)
                intent.putExtra(DES_DIF, it.desDif)
                intent.putExtra(DES_DIF_NAME_RU, it.desDifNameRU)
                intent.putExtra(DES_DIF_NAME_ENG, it.desDifNameENG)
                intent.putExtra(DES_VALUE, it.desICD)
                startActivity(intent)
            }
            recycler.adapter = adapter
            recycler.layoutManager =
                    LinearLayoutManager(this.context, LinearLayoutManager.VERTICAL, false)
        }
        if (key==10){
            val adapter = AdapterICD10(deseases10) {
                val intent = Intent(this.context, ICD10Second::class.java)
                intent.putExtra(DES_DIF, it.desDif)
                intent.putExtra(DES_DIF_NAME_RU, it.desDifNameRU)
                intent.putExtra(DES_DIF_NAME_ENG, it.desDifNameENG)
                intent.putExtra(DES_VALUE, it.desICD)
                startActivity(intent)
            }
            recycler.adapter = adapter
            recycler.layoutManager =
                    LinearLayoutManager(this.context, LinearLayoutManager.VERTICAL, false)
        }
        if (key==11){
            val adapter = AdapterICD10(deseases11) {
                val intent = Intent(this.context, ICD10Second::class.java)
                intent.putExtra(DES_DIF, it.desDif)
                intent.putExtra(DES_DIF_NAME_RU, it.desDifNameRU)
                intent.putExtra(DES_DIF_NAME_ENG, it.desDifNameENG)
                intent.putExtra(DES_VALUE, it.desICD)
                startActivity(intent)
            }
            recycler.adapter = adapter
            recycler.layoutManager =
                    LinearLayoutManager(this.context, LinearLayoutManager.VERTICAL, false)
        }
        if (key==12){
            val adapter = AdapterICD10(deseases12) {
                val intent = Intent(this.context, ICD10Second::class.java)
                intent.putExtra(DES_DIF, it.desDif)
                intent.putExtra(DES_DIF_NAME_RU, it.desDifNameRU)
                intent.putExtra(DES_DIF_NAME_ENG, it.desDifNameENG)
                intent.putExtra(DES_VALUE, it.desICD)
                startActivity(intent)
            }
            recycler.adapter = adapter
            recycler.layoutManager =
                    LinearLayoutManager(this.context, LinearLayoutManager.VERTICAL, false)
        }
        if (key==13){
            val adapter = AdapterICD10(deseases13) {
                val intent = Intent(this.context, ICD10Second::class.java)
                intent.putExtra(DES_DIF, it.desDif)
                intent.putExtra(DES_DIF_NAME_RU, it.desDifNameRU)
                intent.putExtra(DES_DIF_NAME_ENG, it.desDifNameENG)
                intent.putExtra(DES_VALUE, it.desICD)
                startActivity(intent)
            }
            recycler.adapter = adapter
            recycler.layoutManager =
                    LinearLayoutManager(this.context, LinearLayoutManager.VERTICAL, false)
        }
        if (key==14){
            val adapter = AdapterICD10(deseases14) {
                val intent = Intent(this.context, ICD10Second::class.java)
                intent.putExtra(DES_DIF, it.desDif)
                intent.putExtra(DES_DIF_NAME_RU, it.desDifNameRU)
                intent.putExtra(DES_DIF_NAME_ENG, it.desDifNameENG)
                intent.putExtra(DES_VALUE, it.desICD)
                startActivity(intent)
            }
            recycler.adapter = adapter
            recycler.layoutManager =
                    LinearLayoutManager(this.context, LinearLayoutManager.VERTICAL, false)
        }
        if (key==15){
            val adapter = AdapterICD10(deseases15) {
                val intent = Intent(this.context, ICD10Second::class.java)
                intent.putExtra(DES_DIF, it.desDif)
                intent.putExtra(DES_DIF_NAME_RU, it.desDifNameRU)
                intent.putExtra(DES_DIF_NAME_ENG, it.desDifNameENG)
                intent.putExtra(DES_VALUE, it.desICD)
                startActivity(intent)
            }
            recycler.adapter = adapter
            recycler.layoutManager =
                    LinearLayoutManager(this.context, LinearLayoutManager.VERTICAL, false)
        }
        if (key==16){
            val adapter = AdapterICD10(deseases16) {
                val intent = Intent(this.context, ICD10Second::class.java)
                intent.putExtra(DES_DIF, it.desDif)
                intent.putExtra(DES_DIF_NAME_RU, it.desDifNameRU)
                intent.putExtra(DES_DIF_NAME_ENG, it.desDifNameENG)
                intent.putExtra(DES_VALUE, it.desICD)
                startActivity(intent)
            }
            recycler.adapter = adapter
            recycler.layoutManager =
                    LinearLayoutManager(this.context, LinearLayoutManager.VERTICAL, false)
        }
        if (key==17){
            val adapter = AdapterICD10(deseases17) {
                val intent = Intent(this.context, ICD10Second::class.java)
                intent.putExtra(DES_DIF, it.desDif)
                intent.putExtra(DES_DIF_NAME_RU, it.desDifNameRU)
                intent.putExtra(DES_DIF_NAME_ENG, it.desDifNameENG)
                intent.putExtra(DES_VALUE, it.desICD)
                startActivity(intent)
            }
            recycler.adapter = adapter
            recycler.layoutManager =
                    LinearLayoutManager(this.context, LinearLayoutManager.VERTICAL, false)
        }
        if (key==18){
            val adapter = AdapterICD10(deseases18) {
                val intent = Intent(this.context, ICD10Second::class.java)
                intent.putExtra(DES_DIF, it.desDif)
                intent.putExtra(DES_DIF_NAME_RU, it.desDifNameRU)
                intent.putExtra(DES_DIF_NAME_ENG, it.desDifNameENG)
                intent.putExtra(DES_VALUE, it.desICD)
                startActivity(intent)
            }
            recycler.adapter = adapter
            recycler.layoutManager =
                    LinearLayoutManager(this.context, LinearLayoutManager.VERTICAL, false)
        }
        if (key==19){
            val adapter = AdapterICD10(deseases19) {
                val intent = Intent(this.context, ICD10Second::class.java)
                intent.putExtra(DES_DIF, it.desDif)
                intent.putExtra(DES_DIF_NAME_RU, it.desDifNameRU)
                intent.putExtra(DES_DIF_NAME_ENG, it.desDifNameENG)
                intent.putExtra(DES_VALUE, it.desICD)
                startActivity(intent)
            }
            recycler.adapter = adapter
            recycler.layoutManager =
                    LinearLayoutManager(this.context, LinearLayoutManager.VERTICAL, false)
        }
        if (key==20){
            val adapter = AdapterICD10(deseases20) {
                val intent = Intent(this.context, ICD10Second::class.java)
                intent.putExtra(DES_DIF, it.desDif)
                intent.putExtra(DES_DIF_NAME_RU, it.desDifNameRU)
                intent.putExtra(DES_DIF_NAME_ENG, it.desDifNameENG)
                intent.putExtra(DES_VALUE, it.desICD)
                startActivity(intent)
            }
            recycler.adapter = adapter
            recycler.layoutManager =
                    LinearLayoutManager(this.context, LinearLayoutManager.VERTICAL, false)
        }
        if (key==21){
            val adapter = AdapterICD10(deseases21) {
                val intent = Intent(this.context, ICD10Second::class.java)
                intent.putExtra(DES_DIF, it.desDif)
                intent.putExtra(DES_DIF_NAME_RU, it.desDifNameRU)
                intent.putExtra(DES_DIF_NAME_ENG, it.desDifNameENG)
                intent.putExtra(DES_VALUE, it.desICD)
                startActivity(intent)
            }
            recycler.adapter = adapter
            recycler.layoutManager =
                    LinearLayoutManager(this.context, LinearLayoutManager.VERTICAL, false)
        }
        if (key==22){
            val adapter = AdapterICD10(deseases22) {
                val intent = Intent(this.context, ICD10Second::class.java)
                intent.putExtra(DES_DIF, it.desDif)
                intent.putExtra(DES_DIF_NAME_RU, it.desDifNameRU)
                intent.putExtra(DES_DIF_NAME_ENG, it.desDifNameENG)
                intent.putExtra(DES_VALUE, it.desICD)
                startActivity(intent)
            }
            recycler.adapter = adapter
            recycler.layoutManager =
                    LinearLayoutManager(this.context, LinearLayoutManager.VERTICAL, false)
        }
    }
}