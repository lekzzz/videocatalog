package com.arudanovsky.videocatalog.domain.interactor.films;

import com.arudanovsky.videocatalog.data.api.FilmsApi;
import com.arudanovsky.videocatalog.data.api.RetrofitClient;
import com.arudanovsky.videocatalog.domain.interactor.common.BaseInteractor;
import com.arudanovsky.videocatalog.domain.interactor.common.IInteractor;
import com.arudanovsky.videocatalog.domain.mappers.FilmsListMapper;
import com.arudanovsky.videocatalog.domain.model.Film;

import java.util.List;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by Мегатрон on 19.02.2018.
 */

public class FilmsInteractor extends BaseInteractor implements IFilmsInteractor {
    private FilmsApi mApi;

    @Override
    public IInteractor create() {
        mApi = RetrofitClient.build();
        return this;
    }

    @Override
    public void destroy() {
        mApi = null;
    }

    @Override
    public Observable<List<Film>> getFilms() {
        return mApi.getFilms().map(new FilmsListMapper())
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
    }
}
