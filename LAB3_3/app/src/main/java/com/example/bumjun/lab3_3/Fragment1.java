package com.example.bumjun.lab3_3;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by bumju on 2018-04-25.
 */

public class Fragment1 extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // inflate fragment1 xml source
        ViewGroup rootView = (ViewGroup)inflater.inflate(R.layout.fragment1,container,false);

        return rootView;
    }

}
