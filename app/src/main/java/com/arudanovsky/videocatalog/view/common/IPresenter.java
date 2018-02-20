package com.arudanovsky.videocatalog.view.common;

/**
 * Created by Мегатрон on 19.02.2018.
 */

public interface IPresenter {
    void subscribe();
    void onCreate(IView view);
    void unsubscribe();
}
