package com.arudanovsky.videocatalog.data.dto

data class FilmTO(
		val overview: String? = null,
		val originalLanguage: String? = null,
		val originalTitle: String? = null,
		val video: String? = null,
		val title: String? = null,
		val posterPath: String? = null,
		val releaseDate: String? = null,
		val genres: List<GenreTO?>? = null,
		val popularity: Double? = null,
		val voteAverage: Double? = null,
		val id: Int? = null,
		val adult: Boolean? = null,
		val voteCount: Int? = null
)
