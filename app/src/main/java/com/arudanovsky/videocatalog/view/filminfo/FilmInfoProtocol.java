package com.arudanovsky.videocatalog.view.filminfo;

import com.arudanovsky.videocatalog.domain.model.Film;
import com.arudanovsky.videocatalog.view.common.IPresenter;
import com.arudanovsky.videocatalog.view.common.IView;

/**
 * Created by RUDANOVSKIYAA on 19.02.2018.
 */

public interface FilmInfoProtocol {
    interface FilmInfoView extends IView {

        void populateView(Film film);
    }
    interface FilmInfoPresenter extends IPresenter {

    }
}
