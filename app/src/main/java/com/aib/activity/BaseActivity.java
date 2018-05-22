package com.aib.activity;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import dagger.android.AndroidInjection;

public abstract class BaseActivity<D extends ViewDataBinding> extends AppCompatActivity {

    public D binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, getResId());
        initData(savedInstanceState);
    }

    public abstract int getResId();

    public abstract void initData(Bundle savedInstanceState);

}
