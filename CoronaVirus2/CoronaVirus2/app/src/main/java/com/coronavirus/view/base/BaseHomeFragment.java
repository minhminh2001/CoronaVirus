package com.coronavirus.view.base;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.coronavirus.Logger;

public abstract class BaseHomeFragment<V extends BaseViewModel> extends Fragment {
    private BaseActivity mActivity;
    private V mViewModel;

    /**
     * @return layout resource id
     */
    @LayoutRes
    public abstract int getLayoutId();

    /**
     * register listener to update view when data changed
     */
    public void observeViewModel() {
        Logger.d(this, "observeViewModel()");
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        observeViewModel();
    }

    /**
     * Override for set view model
     *
     * @return view model instance
     */
    public V getViewModel() {
        return null;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Logger.d(this, "onAttach()");
        mActivity = (BaseActivity) context;
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(getLayoutId(), container, false);
        Logger.d(this, "onCreateView()");

        initViews(rootView);

        onFinishedInitViews();

        return rootView;
    }

    protected void initViews(View rootView) {
        Logger.d(this, "initViews()");
    }

    protected void onFinishedInitViews() {
        Logger.d(this, "onFinishedInitViews()");
    }

    @Override
    public void onDetach() {
        Logger.d(this, "onDetach() called");
        mActivity = null;
        super.onDetach();
    }

    @Override
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Logger.d(this, "onViewCreated()");

        this.mViewModel = mViewModel == null ? getViewModel() : mViewModel;
    }

    @Override
    public void onStart() {
        super.onStart();
        getViewModel().onViewFocused();
    }

    @Override
    public void onStop() {
        super.onStop();
        Logger.d(this, "onStop()");
        getViewModel().onViewLostFocus();
    }

    protected BaseActivity getBaseActivity() {
        return mActivity;
    }
}
