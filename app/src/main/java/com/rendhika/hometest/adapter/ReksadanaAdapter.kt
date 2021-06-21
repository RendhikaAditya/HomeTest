package com.rendhika.hometest.adapter

import android.os.Build
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.github.mikephil.charting.utils.ColorTemplate
import com.rendhika.hometest.R
import com.rendhika.hometest.databinding.ReksadanaRowBinding
import com.rendhika.hometest.model.ModelReksaDana

class ReksadanaAdapter(private var listMenu: ArrayList<ModelReksaDana>) :
    RecyclerView.Adapter<ReksadanaAdapter.GridViewHolder>() {

    class GridViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val binding = ReksadanaRowBinding.bind(itemView)
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GridViewHolder {
        val view: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.reksadana_row, parent, false)
        return GridViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listMenu.size
    }

    override fun onBindViewHolder(holder: GridViewHolder, position: Int) {
        val model = listMenu[position]

        holder.binding.icon.setImageDrawable(ContextCompat.getDrawable(holder.binding.root.context, model.icon))
            holder.binding.nama.text = model.nama
            holder.binding.jenisReksadana.text = model.jenis
            holder.binding.imbalHasil.text = model.imbal_hasil
            holder.binding.danaKelolaan.text = model.dana_kelolaan
            holder.binding.minPembelian.text = model.min_pembelian
            holder.binding.jangkaWaktu.text = model.jangka_waktu
            holder.binding.tingkatResiko.text = model.tingkat_resiko
            holder.binding.peluncuran.text = model.peluncuran
        if (position == 0) {
            holder.binding.titleJenis.visibility = View.VISIBLE
            holder.binding.titleImbal.visibility = View.VISIBLE
            holder.binding.titleKelolaan.visibility = View.VISIBLE
            holder.binding.titleMin.visibility = View.VISIBLE
            holder.binding.titleWaktu.visibility = View.VISIBLE
            holder.binding.titleResiko.visibility = View.VISIBLE
            holder.binding.titlePeluncuran.visibility = View.VISIBLE
        }else{
            holder.binding.titleJenis.visibility = View.INVISIBLE
            holder.binding.titleImbal.visibility = View.INVISIBLE
            holder.binding.titleKelolaan.visibility = View.INVISIBLE
            holder.binding.titleMin.visibility = View.INVISIBLE
            holder.binding.titleWaktu.visibility = View.INVISIBLE
            holder.binding.titleResiko.visibility = View.INVISIBLE
            holder.binding.titlePeluncuran.visibility = View.INVISIBLE
        }
    }



}