package com.arudanovsky.videocatalog.view.list;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.arudanovsky.videocatalog.R;
import com.arudanovsky.videocatalog.domain.model.Film;
import com.arudanovsky.videocatalog.view.common.BaseFragment;
import com.arudanovsky.videocatalog.view.list.adapter.FilmsAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Мегатрон on 19.02.2018.
 */

public class FilmListFragment extends BaseFragment implements FilmListProtocol.FilmListView {
    private FilmListProtocol.FilmListPresenter mPresenter;
    private FilmsAdapter mAdapter;

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
        RecyclerView rcView = view.findViewById(R.id.rcView);
        LinearLayoutManager llm = new LinearLayoutManager(getContext());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        rcView.setLayoutManager(llm);
        mAdapter = new FilmsAdapter(new ArrayList());
        rcView.setAdapter(mAdapter);
        mPresenter.subscribe();
        return view;
    }

    @Override
    public void openFilmDetailScreen(Film film) {

    }

    @Override
    public void updateList(List<Film> films) {
        mAdapter.updateList(films);
    }
}
