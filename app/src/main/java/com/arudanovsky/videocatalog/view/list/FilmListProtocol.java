package com.arudanovsky.videocatalog.view.list;

import com.arudanovsky.videocatalog.domain.model.Film;
import com.arudanovsky.videocatalog.view.common.IPresenter;
import com.arudanovsky.videocatalog.view.common.IView;

import java.util.List;

/**
 * Created by Мегатрон on 19.02.2018.
 */

public interface FilmListProtocol {
    interface FilmListView extends IView {
        void openFilmDetailScreen(Film film);
        void updateList(List<Film> films);
    }

    interface FilmListPresenter extends IPresenter {
        void onElementClick(int position);
    }
}
