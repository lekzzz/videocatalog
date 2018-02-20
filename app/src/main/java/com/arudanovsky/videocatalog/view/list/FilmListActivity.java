package com.arudanovsky.videocatalog.view.list;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;

import com.arudanovsky.videocatalog.R;
import com.arudanovsky.videocatalog.domain.model.Film;
import com.arudanovsky.videocatalog.view.common.BaseActivity;
import com.arudanovsky.videocatalog.view.filminfo.FilmInfoActivity;

public class FilmListActivity extends BaseActivity implements FilmListActivityInterface {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.content_frame, FilmListFragment.newInstance(), "film_list");
        transaction.commit();
    }

    @Override
    public void openFilmInfoScreen(Film film) {
        Intent intent = new Intent(this, FilmInfoActivity.class);
        intent.putExtra(FilmInfoActivity.EXTRA_FILM, film);
        startActivityForResult(intent, 0);
    }
}
