package com.arudanovsky.videocatalog.domain.mappers;

import com.arudanovsky.videocatalog.data.dto.FilmTO;
import com.arudanovsky.videocatalog.data.dto.GenreTO;
import com.arudanovsky.videocatalog.domain.model.Film;
import com.arudanovsky.videocatalog.domain.model.Genre;

import java.util.ArrayList;
import java.util.List;

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
        film.setTitle(filmTO.getTitle());
        film.setOverview(filmTO.getOverview());
        film.setOriginalLanguage(filmTO.getOriginalLanguage());
        film.setOriginalTitle(filmTO.getOriginalTitle());
        film.setVideo(filmTO.getVideo());
        film.setPosterPath(filmTO.getPosterPath());
        film.setReleaseDate(filmTO.getReleaseDate());
        film.setPopularity(filmTO.getPopularity());
        film.setVoteAverage(filmTO.getVoteAverage());
        film.setVoteCount(filmTO.getVoteCount());
        film.setAdult(filmTO.getAdult());
        if (filmTO.getGenres() != null && !filmTO.getGenres().isEmpty()) {
            List<Genre> genres = new ArrayList<>();
            for (GenreTO genreTO : filmTO.getGenres())
                if (genreTO != null)
                    genres.add(new Genre(genreTO.getName()));
            film.setGenres(genres);
        }

        return film;
    }
}
