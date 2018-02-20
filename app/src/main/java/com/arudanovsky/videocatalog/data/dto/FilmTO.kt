package com.arudanovsky.videocatalog.data.dto

import com.google.gson.annotations.SerializedName
import java.math.BigDecimal

data class FilmTO(
		@SerializedName("overview")
		val overview: String? = null,
		@SerializedName("original_language")
		val originalLanguage: String? = null,
		@SerializedName("original_title")
		val originalTitle: String? = null,
		@SerializedName("video")
		val video: String? = null,
		@SerializedName("title")
		val title: String? = null,
		@SerializedName("poster_path")
		val posterPath: String? = null,
		@SerializedName("releaseDate")
		val releaseDate: String? = null,
		@SerializedName("genre_ids")
		val genres: List<GenreTO?>? = null,
		@SerializedName("popularity")
		val popularity: BigDecimal? = null,
		@SerializedName("vote_average")
		val voteAverage: BigDecimal? = null,
		@SerializedName("id")
		val id: Int? = null,
		@SerializedName("adult")
		val adult: Boolean? = null,
		@SerializedName("vote_count")
		val voteCount: Int? = null
)
