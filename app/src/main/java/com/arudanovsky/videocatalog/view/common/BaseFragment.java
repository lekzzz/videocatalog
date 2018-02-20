package com.arudanovsky.videocatalog.view.common;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.widget.Toast;

/**
 * Created by Мегатрон on 19.02.2018.
 */

public abstract class BaseFragment<T extends BaseActivityInterface> extends Fragment implements IView {
    protected T mListener;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof BaseActivityInterface)
            mListener = (T) context;
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    @Override
    public void showError(String error) {
        Toast.makeText(getContext(), error, Toast.LENGTH_LONG).show();
    }
}
