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

public class Tab2 extends Fragment {
    int current;
    TextView textViewT2;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        return super.onCreateView(inflater, container, savedInstanceState);
        View rootView = inflater.inflate(R.layout.tab2_layout, container, false);
        textViewT2 = rootView.getRootView().findViewById(R.id.countT2);
        MainActivity.current2=this.getActivity().getPreferences(Context.MODE_PRIVATE).getInt("current2",0);

        textViewT2.setText(String.valueOf(MainActivity.current2));
        Button buttonT2 = rootView.getRootView().findViewById(R.id.buttonT2);
        buttonT2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.current2 +=1;
                textViewT2.setText(String.valueOf(MainActivity.current2));
            }
        });
        Button resetT2 = rootView.getRootView().findViewById(R.id.button2T2);
        resetT2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.current2 = 0;
                textViewT2.setText(String.valueOf(MainActivity.current2));
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
//            textViewT2.setText(String.valueOf(current));
//        }catch (NullPointerException e){
//            current =9;
//            Log.d("", "onActivityCreated: exception found");
//        }
//
//    }
}
