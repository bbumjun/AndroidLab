package com.example.bumjun.interfragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by bumju on 2018-04-16.
 */

public class Fragment2 extends Fragment {

    public View onCreateView (LayoutInflater inflater ,ViewGroup container, Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment2,container,false);

    }
    public void onStart() {
        super.onStart();
        Button btnGetText = getActivity().findViewById(R.id.btnGetText);
        btnGetText.setOnClickListener(new View.OnClickListener() {

            public void onClick (View v ) {

                TextView lbl = getActivity().findViewById(R.id.lablFragment1);
                Toast.makeText(getActivity(),lbl.getText(),Toast.LENGTH_SHORT).show();
            }
        });


    }

}
