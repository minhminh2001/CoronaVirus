package com.coronavirus.view.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.lifecycle.ViewModelProviders;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;

import com.coronavirus.R;
import com.coronavirus.view.base.BaseActivity;
import com.coronavirus.view.base.BaseViewModel;
import com.coronavirus.viewmodel.MainActivityViewModel;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends BaseActivity<MainActivityViewModel> implements NavigationView.OnNavigationItemSelectedListener {
    private Toolbar mToolbar;
    private DrawerLayout mDrawerLayout;
    private FrameLayout mFrameLayout;
    private NavigationView mNavigationView;

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void onClick(View view) {

    }

    @Override
    public MainActivityViewModel getViewModel() {
        return ViewModelProviders.of(this).get(MainActivityViewModel.class);
    }

    @Override
    protected void initViews() {
        super.initViews();
        mToolbar = findViewById(R.id.toolbar);
        mDrawerLayout = findViewById(R.id.drawer_layout);
        mFrameLayout = findViewById(R.id.container);
        mNavigationView = findViewById(R.id.navigationview_id);
    }

    @Override
    protected void onFinishedInitViews() {
        super.onFinishedInitViews();
        setSupportActionBar(mToolbar);
        mNavigationView.setNavigationItemSelectedListener(this);
        toggleDrawer();
    }

    @Override
    public void observeViewModel() {
        super.observeViewModel();
    }

    private void toggleDrawer() {
        ActionBarDrawerToggle drawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout, mToolbar,
                R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        mDrawerLayout.addDrawerListener(drawerToggle);
        drawerToggle.syncState();
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id.nav_item_world:
                break;
            case R.id.nav_item_countries:
                break;
            case R.id.nav_item_about:
                break;
            case R.id.nav_item_chart:
                break;
            case R.id.nav_item_contact:
                break;
            case R.id.nav_item_documentation:
                break;
            case R.id.nav_item_info:
                break;

        }
        return false;
    }

    @Override
    public void onBackPressed() {
        //Checks if the navigation drawer is open -- If so, close it
        if (mDrawerLayout.isDrawerOpen(GravityCompat.START)) {
            mDrawerLayout.closeDrawer(GravityCompat.START);
        }
        // If drawer is already close -- Do not override original functionality
        else {
            super.onBackPressed();
        }
    }

    private void closeDrawer() {
        if (mDrawerLayout.isDrawerOpen(GravityCompat.START)) {
            mDrawerLayout.closeDrawer(GravityCompat.START);
        }
    }

}