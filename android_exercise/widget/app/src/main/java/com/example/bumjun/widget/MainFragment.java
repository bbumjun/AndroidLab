package com.example.bumjun.widget;


import android.support.v4.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by bumju on 2018-04-16.
 */

public class MainFragment extends Fragment {

    public View onCreateView(LayoutInflater inflater , ViewGroup container , Bundle savedInstaceState) {

        ViewGroup rootView =(ViewGroup) inflater.inflate(R.layout.fragment_main,container,false);
        return rootView;

    }
}
