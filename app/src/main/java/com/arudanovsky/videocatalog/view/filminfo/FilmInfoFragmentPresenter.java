package com.arudanovsky.videocatalog.view.filminfo;

import com.arudanovsky.videocatalog.domain.model.Film;
import com.arudanovsky.videocatalog.view.common.BasePresenter;
import com.arudanovsky.videocatalog.view.common.IView;

/**
 * Created by RUDANOVSKIYAA on 19.02.2018.
 */

public class FilmInfoFragmentPresenter extends BasePresenter implements FilmInfoProtocol.FilmInfoPresenter {
    private FilmInfoProtocol.FilmInfoView mView;
    private Film mFilm;

    public FilmInfoFragmentPresenter (Film film) {
        mFilm = film;
    }

    @Override
    public void subscribe() {
        if (mFilm != null)
            mView.populateView(mFilm);
        else
            mView.showError("Something goes wrong");
    }

    @Override
    public void onCreate(IView view) {
        mView = (FilmInfoProtocol.FilmInfoView) view;
    }

    @Override
    public void unsubscribe() {

    }
}
