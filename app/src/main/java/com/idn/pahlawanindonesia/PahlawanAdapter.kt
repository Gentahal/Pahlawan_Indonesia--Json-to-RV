package com.idn.pahlawanindonesia

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.google.gson.Gson
import com.idn.pahlawanindonesia.databinding.RowItemPahlawanBinding
import com.idn.pahlawanindonesia.ui.DetailActivity

class PahlawanAdapter(var context: Context) :
    RecyclerView.Adapter<PahlawanAdapter.MyViewHolder>() {

    private val pahlawanlist : List<DaftarPahlawanItem> = Gson().fromJson(
        getDataFromAsset(context, "pahlawan_nasional.json").toString(),
        PahlawanResponse::class.java
    ).daftarPahlawan as List<DaftarPahlawanItem>

    class MyViewHolder(val itemPahlawanBinding: RowItemPahlawanBinding) :
        RecyclerView.ViewHolder(itemPahlawanBinding.root)

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ) = MyViewHolder(
        RowItemPahlawanBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    )

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val pahlawan = pahlawanlist[position]
        holder.itemPahlawanBinding.apply {
            tvNamaLengkap.text = pahlawan.nama
            tvNamaPahlawan.text = pahlawan.nama2
//            root.setOnClickListener {
//                context.startActivity(Intent(context, DetailActivity.DETAIL_PAHLAWAN::class.java))
//            }
            holder.itemView.setOnClickListener {
                val intent = Intent(context, DetailActivity::class.java)
                intent.putExtra(DetailActivity.DETAIL_PAHLAWAN, pahlawan)
                context.startActivity(intent)
            }
            Glide.with(imagePahlawan).load(pahlawan.img).into(imagePahlawan)
        }
    }

    override fun getItemCount(): Int = pahlawanlist.size
}