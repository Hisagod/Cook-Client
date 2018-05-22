package com.aib.fragment;

import com.aib.info.R;
import com.aib.info.databinding.FragmentTabBinding;
import com.blankj.utilcode.util.LogUtils;

public class TabFragment extends LazyFragment<FragmentTabBinding> {
    @Override
    public int getResId() {
        return R.layout.fragment_tab;
    }

    @Override
    protected void loadData() {
        LogUtils.e("加载中");
    }
}
