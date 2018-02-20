package com.arudanovsky.videocatalog.view.common;

import io.reactivex.disposables.CompositeDisposable;

/**
 * Created by Мегатрон on 19.02.2018.
 */

public abstract class BasePresenter implements IPresenter {
    protected CompositeDisposable mSubcrtiption = new CompositeDisposable();
}
