package com.example.livemusic;


import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PageAdapter extends FragmentPagerAdapter {
    int counttab;
    public PageAdapter( FragmentManager fm, int counttab) {
        super(fm);
        this.counttab = counttab ;
    }

    @Override
    public Fragment getItem(int i) {

        switch (i) {

            case 0 :
                tabMusic dafsong = new tabMusic();
                return  dafsong;
            case 1 :
                Fragment_artist fragment_artist = new Fragment_artist();
                return  fragment_artist;
            default :
                return null;

        }
    }

    @Override
    public int getCount() {
        return counttab;
    }
}
