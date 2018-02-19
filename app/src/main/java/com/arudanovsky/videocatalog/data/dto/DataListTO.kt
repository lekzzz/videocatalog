package com.arudanovsky.videocatalog.data.dto

import com.google.gson.annotations.SerializedName

data class DataListTO(
        @SerializedName("id")
        val page: Int? = null,
        @SerializedName("total_pages")
        val totalPages: Int? = null,
        @SerializedName("results")
        val films: List<FilmTO?>? = null,
        @SerializedName("total_results")
        val totalResults: Int? = null
)
