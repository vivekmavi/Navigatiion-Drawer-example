package com.example.hi.navigationhigh;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Vivek extends Fragment {

 TextView textView;
    public Vivek() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
      View view = inflater.inflate(R.layout.fragment_vivek, container, false);
        textView = (TextView)view.findViewById(R.id.vivek);
       String s  =  MainActivity.sharedPreferences.getString("username","");
        textView.setText(s);
        Log.e("vivieklogin",s);




        return view;
    }

}
