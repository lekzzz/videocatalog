package com.arudanovsky.videocatalog.domain.interactor.films;

import com.arudanovsky.videocatalog.domain.interactor.common.IInteractor;
import com.arudanovsky.videocatalog.domain.model.Film;

import java.util.List;

import io.reactivex.Observable;

/**
 * Created by Мегатрон on 19.02.2018.
 */

public interface IFilmsInteractor extends IInteractor {

    Observable<List<Film>> getFilms();
}
