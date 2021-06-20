package com.rendhika.hometest.adapter

import android.os.Build
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.github.mikephil.charting.utils.ColorTemplate
import com.rendhika.hometest.databinding.ReksadanaRowBinding
import com.rendhika.hometest.model.ModelReksaDana

class ReksadanaAdapter(private var listMenu: ArrayList<ModelReksaDana>) :
    RecyclerView.Adapter<ReksadanaAdapter.GridViewHolder>() {

    class GridViewHolder(val binding: ReksadanaRowBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(model :ModelReksaDana){
            binding.icon.setImageDrawable(ContextCompat.getDrawable(binding.root.context, model.icon))
            binding.nama.text = model.nama
            binding.jenisReksadana.text = model.jenis
            binding.imbalHasil.text = model.imbal_hasil
            binding.danaKelolaan.text = model.dana_kelolaan
            binding.minPembelian.text = model.min_pembelian
            binding.jangkaWaktu.text = model.jangka_waktu
            binding.tingkatResiko.text = model.tingkat_resiko
            binding.peluncuran.text = model.peluncuran
        }

    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GridViewHolder {
        val binding = ReksadanaRowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return GridViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return listMenu.size
    }

    override fun onBindViewHolder(holder: GridViewHolder, position: Int) {
//        if(position%2==0){
//            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
//                holder.binding.card1.
//            }
//        }
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