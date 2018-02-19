package com.arudanovsky.videocatalog.domain.model

import com.arudanovsky.videocatalog.data.dto.GenreTO
import java.io.Serializable

/**
 * Created by Мегатрон on 19.02.2018.
 */
class Film: Serializable {
    val overview: String? = null
    val originalLanguage: String? = null
    val originalTitle: String? = null
    val video: String? = null
    val title: String? = null
    val posterPath: String? = null
    val releaseDate: String? = null
    val genres: List<Genre?>? = null
    val popularity: Double? = null
    val voteAverage: Double? = null
    val id: Int? = null
    val adult: Boolean? = null
    val voteCount: Int? = null
}

class Genre (
    val name: String? = null
)
