package com.arudanovsky.videocatalog.data.dto

data class DataListTO(
        val page: Int? = null,
        val totalPages: Int? = null,
        val films: List<FilmTO?>? = null,
        val totalResults: Int? = null
)
