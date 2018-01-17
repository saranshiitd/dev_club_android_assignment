package com.example.root.buttoncounter;

//import android.app.FragmentContainer;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by root on 17/1/18.
 */

public class Tab1 extends Fragment {
    int current;
    TextView textViewT1;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        return super.onCreateView(inflater, container, savedInstanceState);
        View rootView = inflater.inflate(R.layout.tab1_layout, container, false);
        textViewT1 = rootView.getRootView().findViewById(R.id.countT1);
        MainActivity.current1=this.getActivity().getPreferences(Context.MODE_PRIVATE).getInt("current1",0);
        textViewT1.setText(String.valueOf(MainActivity.current1));
        Button buttonT1 = rootView.getRootView().findViewById(R.id.buttonT1);
        Button resetT1 = rootView.getRootView().findViewById(R.id.button2T1);
        resetT1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.current1 = 0;
                textViewT1.setText(String.valueOf(MainActivity.current1));
            }
        });
        buttonT1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.current1+=1;
                textViewT1.setText(String.valueOf(String.valueOf(MainActivity.current1)));

            }
        });
        return rootView;

    }
//    @Override
//    public void onSaveInstanceState(Bundle outState) {
//        super.onSaveInstanceState(outState);
//        outState.putInt("current",current);
//    }
//
//    @Override
//    public void onViewStateRestored(@Nullable Bundle savedInstanceState) {
//        super.onViewStateRestored(savedInstanceState);
//        current
//    }
//
}
