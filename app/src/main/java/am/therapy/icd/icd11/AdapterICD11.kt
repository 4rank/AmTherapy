package am.therapy.icd.icd11

import am.therapy.R
import am.therapy.data.ICD11Data
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdapterICD11(
        private val desises_icd11: List<ICD11Data>, private val onClick: (ICD11Data) -> Unit
) :
        RecyclerView.Adapter<AdapterICD11.ViewHolderCurrentDes>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderCurrentDes {
        val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.icd11_layout, parent, false)
        return ViewHolderCurrentDes(view, onClick)
    }

    override fun getItemCount(): Int {
        return desises_icd11.size
    }

    override fun onBindViewHolder(holder: ViewHolderCurrentDes, pos: Int) {
        holder.bindViewHolder(desises_icd11[pos])
    }

    class ViewHolderCurrentDes(view: View, val onClick: (ICD11Data) -> Unit) :
            RecyclerView.ViewHolder(view) {
        private var currentViewHolderDes: ICD11Data? = null
        private val desCode = view.findViewById<TextView>(R.id.des_dif_icd11)
        private val desName = view.findViewById<TextView>(R.id.des_name_icd11)

        init {
            view.setOnClickListener {
                currentViewHolderDes?.let {
                    onClick(it)
                }
            }
        }

        fun bindViewHolder(currentDes: ICD11Data) {
            currentViewHolderDes = currentDes
            desCode.text = currentDes.desDif_icd11
            desName.text = currentDes.desDifName_icd11
        }
    }
}