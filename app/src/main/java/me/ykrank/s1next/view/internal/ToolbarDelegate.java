package me.ykrank.s1next.view.internal;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.google.common.base.Preconditions;

import me.ykrank.s1next.R;
import me.ykrank.s1next.util.ResourceUtil;

/**
 * This class represents a delegate which you can use to add
 * {@link Toolbar} to {@link AppCompatActivity}.
 */
public final class ToolbarDelegate {

    private final AppCompatActivity mAppCompatActivity;
    private final Toolbar mToolbar;

    public ToolbarDelegate(AppCompatActivity appCompatActivity, Toolbar toolbar) {
        this.mAppCompatActivity = appCompatActivity;
        this.mToolbar = toolbar;

        setUpToolbar();
    }

    /**
     * Sets a {@link android.widget.Toolbar Toolbar} to act as the {@link android.support.v7.app.ActionBar}
     * for this Activity window.
     * Also displays home as an "up" affordance in Toolbar.
     */
    private void setUpToolbar() {
        // designate a Toolbar as the ActionBar
        mAppCompatActivity.setSupportActionBar(mToolbar);
        Preconditions.checkNotNull(mAppCompatActivity.getSupportActionBar())
                .setDisplayHomeAsUpEnabled(true);
    }

    /**
     * Sets Toolbar's navigation icon to cross.
     */
    public void setupNavCrossIcon() {
        mToolbar.setNavigationIcon(ResourceUtil.getResourceId(mAppCompatActivity.getTheme(),
                R.attr.iconClose));
    }

    public Toolbar getToolbar() {
        return mToolbar;
    }
}
