package com.rendhika.hometest.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.rendhika.hometest.R
import com.rendhika.hometest.adapter.ReksadanaAdapter
import com.rendhika.hometest.databinding.FragmentImbalHasilBinding
import com.rendhika.hometest.model.ModelReksaDana

class ImbalHasilFragment : Fragment() {
    private lateinit var binding: FragmentImbalHasilBinding
    private var reksaDana : ArrayList<ModelReksaDana> = arrayListOf()
    var sizeData: Int = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentImbalHasilBinding.inflate(layoutInflater)

        getData()

        return binding.root
    }

    private fun getData() {
        reksaDana.add(ModelReksaDana(R.drawable.ic_bniam, "BNI-AM Inspiring Equity Fund", "Saham", "5,50% / 5 thn", "3,64 Miliar", "1 Juta", "5 Tahun", "Tinggi", "16 Apr 2014"))
        reksaDana.add(ModelReksaDana(R.drawable.ic_cipta, "Cipta Dana Cash", "Pasar Uang", "6,29% / thn", "215,97 Miliar", "100 Ribu", "1 Tahun", "Rendah", "14 Jan 2016"))
        reksaDana.add(ModelReksaDana(R.drawable.ic_ascend, "Ascend Reksa Dana Saham Eq...", "Saham", "7,17% / 5 thn", "3,89 Triliun", "100 Ribu", "5 Tahun", "Tinggi", "20 Feb 2007"))

        sizeData = reksaDana.size

        binding.rvReksa.setHasFixedSize(true)
        binding.rvReksa.layoutManager = GridLayoutManager(context, sizeData)

        val adapter = ReksadanaAdapter(reksaDana)
        binding.rvReksa.adapter = adapter
        adapter.notifyDataSetChanged()

    }

}