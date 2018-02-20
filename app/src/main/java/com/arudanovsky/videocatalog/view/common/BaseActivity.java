package com.arudanovsky.videocatalog.view.common;

import android.support.v7.app.AppCompatActivity;

/**
 * Created by Мегатрон on 19.02.2018.
 */

public abstract class BaseActivity extends AppCompatActivity implements BaseActivityInterface {

    @Override
    public void closeScreen() {
        finish();
    }
}
