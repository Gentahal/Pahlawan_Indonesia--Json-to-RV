package com.idn.pahlawanindonesia.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.app.ActivityCompat
import com.bumptech.glide.Glide
import com.idn.pahlawanindonesia.DaftarPahlawanItem
import com.idn.pahlawanindonesia.PahlawanAdapter
import com.idn.pahlawanindonesia.PahlawanResponse
import com.idn.pahlawanindonesia.R
import com.idn.pahlawanindonesia.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    private var _binding : ActivityDetailBinding? = null
    private val binding get() = _binding as ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        _binding = ActivityDetailBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)



        val data = intent.getParcelableExtra<PahlawanResponse>(DETAIL_PAHLAWAN) as DaftarPahlawanItem
        Glide.with(this).load(data.img).into(binding.imgPahlawan)

        binding.apply {
            tvNamaPahlawan.text = data.nama
            tvIsi.text = data.nama2
            tvLahir.text = data.lahir
            tvRiwayat.text = data.history
            tvWafat.text = data.gugur
            tvLokasiMakam.text = data.lokasimakam
        }

    }
    companion object{
        const val DETAIL_PAHLAWAN = "DETAIL_PAHLAWAN"
    }
}