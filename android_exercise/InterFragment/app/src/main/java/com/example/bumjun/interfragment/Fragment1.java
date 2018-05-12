package com.example.bumjun.interfragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by bumju on 2018-04-16.
 */

public class Fragment1 extends Fragment{

    public View onCreateView (LayoutInflater inflater, ViewGroup container , Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragement1,container,false);
    }
}
