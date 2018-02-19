package com.arudanovsky.videocatalog.domain.mappers;

import com.arudanovsky.videocatalog.data.dto.FilmTO;
import com.arudanovsky.videocatalog.domain.model.Film;

import io.reactivex.functions.Function;

/**
 * Created by Мегатрон on 19.02.2018.
 */

public class FilmMapper implements Function<FilmTO, Film> {
    @Override
    public Film apply(FilmTO filmTO) throws Exception {
        if (filmTO == null)
            return null;
        Film film = new Film();
        return film;
    }
}
