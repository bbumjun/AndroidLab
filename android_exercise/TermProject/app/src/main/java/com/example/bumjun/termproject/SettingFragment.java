package com.example.bumjun.termproject;import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.bumjun.termproject.R;

public class SettingFragment extends Fragment {

public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
    ViewGroup rootView = (ViewGroup)inflater.inflate(R.layout.fragment_setting,container,false);



    return rootView;
}

}
