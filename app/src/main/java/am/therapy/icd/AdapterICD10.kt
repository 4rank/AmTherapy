package am.therapy.icd

import am.therapy.data.ICD10Data
import android.view.LayoutInflater
import am.therapy.R
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdapterICD10(
        private val desis: List<ICD10Data>, private val onClick: (ICD10Data) -> Unit
) :
        RecyclerView.Adapter<AdapterICD10.ViewHolderCurrentDes>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderCurrentDes {
        val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.icd10_layout, parent, false)
        return ViewHolderCurrentDes(view, onClick)
    }

    override fun getItemCount(): Int {
        return desis.size
    }

    override fun onBindViewHolder(holder: ViewHolderCurrentDes, pos: Int) {
        holder.bindViewHolder(desis[pos])
    }

    class ViewHolderCurrentDes(view: View, val onClick: (ICD10Data) -> Unit) :
            RecyclerView.ViewHolder(view) {
        private var currentViewHolderDes: ICD10Data? = null
        private val desCode = view.findViewById<TextView>(R.id.des_dif)
        private val desName = view.findViewById<TextView>(R.id.des_name)

        init {
            view.setOnClickListener {
                currentViewHolderDes?.let {
                    onClick(it)
                }
            }
        }

        fun bindViewHolder(currentDes: ICD10Data) {
            currentViewHolderDes = currentDes
            desCode.text = currentDes.desDif
            desName.text = currentDes.desDifName
        }
    }
}