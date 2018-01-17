package com.example.root.buttoncounter;

import android.content.Context;
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

public class Tab3 extends Fragment {
    int current;
    TextView textViewT3;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        return super.onCreateView(inflater, container, savedInstanceState);
        View rootView = inflater.inflate(R.layout.tab3_layout, container, false);
        textViewT3 = rootView.getRootView().findViewById(R.id.countT3);
        MainActivity.current3=this.getActivity().getPreferences(Context.MODE_PRIVATE).getInt("current3",0);

        textViewT3.setText(String.valueOf(MainActivity.current3));
        Button buttonT3 = rootView.getRootView().findViewById(R.id.buttonT3);
        buttonT3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.current3+=1;
                textViewT3.setText(String.valueOf(MainActivity.current3));
            }
        });
        Button resetT3 = rootView.getRootView().findViewById(R.id.button2T3);
        resetT3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.current3 = 0;
                textViewT3.setText(String.valueOf(MainActivity.current3));
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
//    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
//        super.onActivityCreated(savedInstanceState);
//        try {
//
//            current = savedInstanceState.getInt("current");
//            textViewT3.setText(String.valueOf(current));
//        }catch (NullPointerException e){
//            Log.d("", "onActivityCreated: exception found");
//            current =9;
//        }
//
//    }
}
