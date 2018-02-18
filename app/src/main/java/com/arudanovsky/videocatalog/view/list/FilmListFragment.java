package com.arudanovsky.videocatalog.view.list;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.arudanovsky.videocatalog.R;
import com.arudanovsky.videocatalog.view.common.BaseFragment;

/**
 * Created by Мегатрон on 19.02.2018.
 */

public class FilmListFragment extends BaseFragment implements FilmListProtocol.FilmListView {
    private FilmListProtocol.FilmListPresenter mPresenter;

    public static FilmListFragment newInstance() {
        return new FilmListFragment();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPresenter = new FilmListFragmentPresenter();
        mPresenter.onCreate(this);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.base_list_layout, container, false);
        return view;
    }

    @Override
    public void openFilmDetailScreen() {

    }

    @Override
    public void updateList() {

    }
}
