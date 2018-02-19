package com.arudanovsky.videocatalog.data.dto

import com.google.gson.annotations.SerializedName

data class GenreTO(
	@SerializedName("name")
	val name: String? = null
)
