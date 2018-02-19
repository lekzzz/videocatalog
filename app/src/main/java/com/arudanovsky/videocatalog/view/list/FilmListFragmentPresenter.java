package com.arudanovsky.videocatalog.view.list;

import com.arudanovsky.videocatalog.domain.interactor.films.FilmsInteractor;
import com.arudanovsky.videocatalog.domain.interactor.films.IFilmsInteractor;
import com.arudanovsky.videocatalog.domain.model.Film;
import com.arudanovsky.videocatalog.view.common.BasePresenter;
import com.arudanovsky.videocatalog.view.common.IView;

import java.util.List;

import io.reactivex.functions.Consumer;

/**
 * Created by Мегатрон on 19.02.2018.
 */

public class FilmListFragmentPresenter extends BasePresenter implements FilmListProtocol.FilmListPresenter {
    private FilmListProtocol.FilmListView mView;
    private IFilmsInteractor mInteractor;
    private List<Film> mList;

    @Override
    public void subscribe() {
        mSubcrtiption.add(mInteractor.getFilms().subscribe(new Consumer<List<Film>>() {
            @Override
            public void accept(List<Film> films) throws Exception {
                mList = films;
                mView.updateList(films);
            }
        }, new Consumer<Throwable>() {
            @Override
            public void accept(Throwable throwable) throws Exception {
                mView.showError(throwable.getMessage());
            }
        }));
    }

    @Override
    public void onCreate(IView view) {
        mView = (FilmListProtocol.FilmListView) view;
        mInteractor = new FilmsInteractor();
        mInteractor.create();
    }

    @Override
    public void unsubscribe() {
        mInteractor.destroy();
    }

    @Override
    public void onElementClick(int position) {
        mView.openFilmDetailScreen(mList.get(position));
    }
}
