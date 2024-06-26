package com.example.whatsappchat.Adapter;

import android.widget.Switch;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.whatsappchat.Fragments.CallsFragment;
import com.example.whatsappchat.Fragments.ChatsFragment;
import com.example.whatsappchat.Fragments.StatusFragment;

public class FragmentsAdapter extends FragmentPagerAdapter {
    public FragmentsAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch  (position)
    {
        case 0: return new ChatsFragment();
        case 1: return new StatusFragment();
        case 2: return new CallsFragment();
        default:return new ChatsFragment();

    }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {

        String Title = null;
        if (position == 0)
        {
            Title = "CHATS";
        }
        if (position == 1)
        {
            Title = "STATUS";
        }
        if (position == 2)
        {
            Title = "CALLS";
        }
        return Title;



    }
}
