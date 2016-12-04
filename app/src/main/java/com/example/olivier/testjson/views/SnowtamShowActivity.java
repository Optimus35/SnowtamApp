package com.example.olivier.testjson.views;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.olivier.testjson.R;
import com.example.olivier.testjson.models.Snowtam;
import com.example.olivier.testjson.models.SnowtamGenerator;

import org.json.JSONException;

import static com.example.olivier.testjson.views.CodeInputActivity.SNOWTAM_CODE;

public class SnowtamShowActivity extends Fragment {

    private String scoderecu ="C) 17 F) 1 / 1 / 1 G) XX / XX / XX H) 5 / 5 / 5 N) A1 A2 A3 A4 A5 A6 A7 A8 A9 B C D E F G H J M N U W Y / 1 R) ALL REPORTED APRONS / 1 T) CONTAMINATION / 100 / 100 / 100 / PERCENT.) .23 NOV 12: 24 2016 UNTIL 24 NOV 12: 24 2016. CREATED: 23 NOV 12: 28 2016 ";


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


        txtview1.setText(sn.getC());
        txtview2.setText(sn.getF());
        txtview3.setText(sn.getG());
        txtview4.setText(sn.getH());
        txtview5.setText(sn.getN());
        txtview6.setText(sn.getR());
        txtview7.setText(sn.getT());
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        Bundle bundle = getArguments();
        if (bundle != null) {
            snowtam = sno;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.raw_snowtam_fragment);
        Intent intent = getIntent();

        Snowtam sn;
        SnowtamGenerator snowtamGenerator = new SnowtamGenerator(this);
        try {
            sn = snowtamGenerator.getSnowtam(intent.getStringExtra(SNOWTAM_CODE));


        } catch (JSONException e) {
            e.printStackTrace();
        }


    }
}
