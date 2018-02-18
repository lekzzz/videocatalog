package com.arudanovsky.videocatalog.view.list;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;

import com.arudanovsky.videocatalog.R;
import com.arudanovsky.videocatalog.view.common.BaseActivity;

public class FilmListActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.content_frame, FilmListFragment.newInstance(), "film_list");
        transaction.commit();
    }
}
