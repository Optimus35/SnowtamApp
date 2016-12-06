package com.example.olivier.snowtamapp.views;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.olivier.snowtamapp.R;
import com.example.olivier.snowtamapp.models.Snowtam;

public class SnowtamRawFragment extends Fragment {


    private Snowtam snowtam;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.raw_snowtam_fragment, container, false);
        TextView txtview1 = (TextView) view.findViewById(R.id.textView);
        TextView txtview2 = (TextView) view.findViewById(R.id.textView2);
        TextView txtview3 = (TextView) view.findViewById(R.id.textView3);
        TextView txtview4 = (TextView) view.findViewById(R.id.textView4);
        TextView txtview5 = (TextView) view.findViewById(R.id.textView5);
        TextView txtview6 = (TextView) view.findViewById(R.id.textView6);
        TextView txtview7 = (TextView) view.findViewById(R.id.textView7);


        txtview1.setText(snowtam.getC());
        txtview2.setText(snowtam.getF());
        txtview3.setText(snowtam.getG());
        txtview4.setText(snowtam.getH());
        txtview5.setText(snowtam.getN());
        txtview6.setText(snowtam.getR());
        txtview7.setText(snowtam.getT());
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    public void setSnowtam(Snowtam snowtam) {
        this.snowtam = snowtam;
    }

}

