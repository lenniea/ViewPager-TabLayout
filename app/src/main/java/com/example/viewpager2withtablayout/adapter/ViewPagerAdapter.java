package com.example.viewpager2withtablayout.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.example.viewpager2withtablayout.fragment.BirdFragment;
import com.example.viewpager2withtablayout.fragment.CatFragment;
import com.example.viewpager2withtablayout.fragment.DogFragment;

public class ViewPagerAdapter extends FragmentStateAdapter {

    public ViewPagerAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new CatFragment();
            case 1:
                return new DogFragment();
            default:
                return new BirdFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}