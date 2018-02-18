package com.arudanovsky.videocatalog.view.list;

import com.arudanovsky.videocatalog.view.common.BasePresenter;
import com.arudanovsky.videocatalog.view.common.IView;

/**
 * Created by Мегатрон on 19.02.2018.
 */

public class FilmListFragmentPresenter extends BasePresenter implements FilmListProtocol.FilmListPresenter {
    private FilmListProtocol.FilmListView mView;

    @Override
    public void subscribe() {

    }

    @Override
    public void onCreate(IView view) {
        mView = (FilmListProtocol.FilmListView) view;
    }

    @Override
    public void unsubscribe() {

    }

    @Override
    public void onElementClick(int position) {

    }
}
