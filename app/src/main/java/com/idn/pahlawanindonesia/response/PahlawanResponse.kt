package com.idn.pahlawanindonesia

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class PahlawanResponse(

	@field:SerializedName("daftar_pahlawan")
	val daftarPahlawan: List<DaftarPahlawanItem?>? = null
) : Parcelable

@Parcelize
data class DaftarPahlawanItem(

	@field:SerializedName("nama2")
	val nama2: String? = null,

	@field:SerializedName("asal")
	val asal: String? = null,

	@field:SerializedName("usia")
	val usia: String? = null,

	@field:SerializedName("img")
	val img: String? = null,

	@field:SerializedName("lahir")
	val lahir: String? = null,

	@field:SerializedName("lokasimakam")
	val lokasimakam: String? = null,

	@field:SerializedName("nama")
	val nama: String? = null,

	@field:SerializedName("gugur")
	val gugur: String? = null,

	@field:SerializedName("kategori")
	val kategori: String? = null,

	@field:SerializedName("history")
	val history: String? = null
) : Parcelable
