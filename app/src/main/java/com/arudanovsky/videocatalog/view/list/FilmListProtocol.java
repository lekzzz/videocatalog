package com.arudanovsky.videocatalog.view.list;

import com.arudanovsky.videocatalog.view.common.IPresenter;
import com.arudanovsky.videocatalog.view.common.IView;

/**
 * Created by Мегатрон on 19.02.2018.
 */

public interface FilmListProtocol {
    interface FilmListView extends IView {
        void openFilmDetailScreen();
        void updateList();
    }

    interface FilmListPresenter extends IPresenter {
        void onElementClick(int position);
    }
}
