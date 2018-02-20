package com.arudanovsky.videocatalog.view.filminfo;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;

import com.arudanovsky.videocatalog.R;
import com.arudanovsky.videocatalog.domain.model.Film;
import com.arudanovsky.videocatalog.view.common.BaseActivity;

/**
 * Created by RUDANOVSKIYAA on 19.02.2018.
 */

public class FilmInfoActivity extends BaseActivity {
    public final static String EXTRA_FILM = "extra_film";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("screen_info", "oncreate");
        setContentView(R.layout.activity_base);

        Film film = null;
        if (getIntent() != null)
            film = (Film) getIntent().getSerializableExtra(EXTRA_FILM);
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.content_frame, FilmInfoFragment.newInstance(film), "film_info");
        transaction.commit();
    }
}
