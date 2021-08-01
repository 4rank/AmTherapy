package am.therapy.icd.icd11

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

const val DES_DIF_ICD11 = "des_dif"
const val DES_DIF_NAME_ICD11 = "des_dif_name"
const val DES_VALUE_ICD11 = "des_values"

private const val ARG_PARAM1_ICD11 = "param3"
private const val ARG_PARAM2_ICD11 = "param4"

class ICD11FragmentFirst : Fragment() {

    private lateinit var recycler: RecyclerView
    private var param3: String? = null
    private var param4: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param3 = it.getString(ARG_PARAM1_ICD11)
            param4 = it.getString(ARG_PARAM2_ICD11)
        }
    }

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?,
    ): View? {
        val startFragment = inflater.inflate(R.layout.icd11_fragment_first, container, false)
        recyclerStart(startFragment)
        return startFragment
    }

    private fun recyclerStart(view: View) {
        val key = Storage.tokenIcd11
        recycler = view.findViewById(R.id.RecyclerView_icd11)
        if (key==1){
            val adapter = AdapterICD11(deseases_icd11_1) {
                val intent = Intent(this.context, ICD11Second::class.java)
                intent.putExtra(DES_DIF_ICD11, it.desDif_icd11)
                intent.putExtra(DES_DIF_NAME_ICD11, it.desDifName_icd11)
                intent.putExtra(DES_VALUE_ICD11, it.desICD_icd11)
                startActivity(intent)
            }
            recycler.adapter = adapter
            recycler.layoutManager =
                    LinearLayoutManager(this.context, LinearLayoutManager.VERTICAL, false)
        }
    }
}