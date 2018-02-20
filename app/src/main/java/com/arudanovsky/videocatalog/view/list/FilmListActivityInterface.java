package com.arudanovsky.videocatalog.view.list;

import com.arudanovsky.videocatalog.domain.model.Film;
import com.arudanovsky.videocatalog.view.common.BaseActivityInterface;

/**
 * Created by RUDANOVSKIYAA on 19.02.2018.
 */

interface FilmListActivityInterface extends BaseActivityInterface {
    void openFilmInfoScreen(Film film);
}
