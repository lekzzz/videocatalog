package com.arudanovsky.videocatalog.domain.mappers;

import com.arudanovsky.videocatalog.data.dto.DataListTO;
import com.arudanovsky.videocatalog.data.dto.FilmTO;
import com.arudanovsky.videocatalog.domain.model.Film;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.Observable;
import io.reactivex.functions.Function;

/**
 * Created by Мегатрон on 19.02.2018.
 */

public class FilmsListMapper implements Function<DataListTO, List<Film>> {
    private final FilmMapper mMapper = new FilmMapper();
    @Override
    public List<Film> apply(DataListTO dataListTO) throws Exception {
        if (dataListTO == null) return null;
        List<Film> list = new ArrayList<>();
        for (FilmTO filmTO : dataListTO.getFilms())
            list.add(mMapper.apply(filmTO));
        return list;
    }
}
