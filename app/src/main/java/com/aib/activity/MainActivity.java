package com.aib.activity;


import android.arch.lifecycle.ViewModelProvider;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.aib.fragment.TabFragment;
import com.aib.info.R;
import com.aib.info.databinding.ActivityMainBinding;
import com.aib.viewmodel.MainViewModel;

import java.util.ArrayList;

public class MainActivity extends BaseActivity<ActivityMainBinding> {
    @Override
    public int getResId() {
        return R.layout.activity_main;
    }

    @Override
    public void initData(Bundle savedInstanceState) {
        final ArrayList<Fragment> fragments = new ArrayList<>();
        final ArrayList<String> titles = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            fragments.add(new TabFragment());
            titles.add(i + "");
        }

        binding.vp.setAdapter(new FragmentStatePagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                return fragments.get(position);
            }

            @Override
            public int getCount() {
                return titles.size() == fragments.size() ? fragments.size() : 0;
            }

            @Nullable
            @Override
            public CharSequence getPageTitle(int position) {
                return titles.get(position);
            }
        });

        binding.tl.setupWithViewPager(binding.vp, false);

        MainViewModel vm = ViewModelProvider.AndroidViewModelFactory.getInstance(getApplication()).create(MainViewModel.class);
        vm.getJson("25f297c2b3080");

    }
}
