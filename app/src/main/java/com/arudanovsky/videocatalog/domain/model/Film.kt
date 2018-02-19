package com.arudanovsky.videocatalog.domain.model

import com.arudanovsky.videocatalog.data.dto.GenreTO
import java.io.Serializable
import java.math.BigDecimal

/**
 * Created by Мегатрон on 19.02.2018.
 */
class Film: Serializable {
    var overview: String? = null
    var originalLanguage: String? = null
    var originalTitle: String? = null
    var video: String? = null
    var title: String? = null
    var posterPath: String? = null
    var releaseDate: String? = null
    var genres: List<Genre?>? = null
    var popularity: BigDecimal? = null
    var voteAverage: BigDecimal? = null
    var id: Int? = null
    var adult: Boolean? = null
    var voteCount: Int? = null
}

class Genre (
        var name: String? = null
)
