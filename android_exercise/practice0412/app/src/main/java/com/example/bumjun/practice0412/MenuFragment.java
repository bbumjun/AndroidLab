package com.example.bumjun.practice0412;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by bumju on 2018-04-16.
 */

public class MenuFragment  extends Fragment {

    public View onCretView (LayoutInflater inflater , ViewGroup container, Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_menu,container,false);
        return rootView;
    }
}
