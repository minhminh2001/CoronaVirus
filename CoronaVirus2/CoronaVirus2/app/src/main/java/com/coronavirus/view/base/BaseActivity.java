package com.coronavirus.view.base;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;

import androidx.annotation.LayoutRes;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import com.coronavirus.Logger;

public abstract class BaseActivity<V extends BaseViewModel> extends AppCompatActivity implements View.OnClickListener {
    private V mViewModel;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initViewModel();

        observeViewModel();

        setContentView(getLayoutId());

        initViews();

        onFinishedInitViews();

    }

    /**
     * @return layout resource id
     */
    @LayoutRes
    public abstract int getLayoutId();

    private void initViewModel() {
        Logger.d(this, "initViewModel");
        mViewModel = mViewModel == null ? getViewModel() : mViewModel;
    }

    public void observeViewModel() {
    }

    protected void initViews() {
    }

    protected void onFinishedInitViews() {
    }

    public V getViewModel() {
        Logger.d(this, "getViewModel return null");
        return null;
    }

    protected void replaceFragment(BaseHomeFragment fragment, int containerId) {
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(containerId, fragment);
        ft.commit();
    }

}
