package com.example.olivier.testjson;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String scoderecu ="B) 10011230 C) 17 F) 1 / 1 / 1 G) XX / XX / XX H) 5 / 5 / 5 N) A1 A2 A3 A4 A5 A6 A7 A8 A9 B C D E F G H J M N U W Y / 1 R) ALL REPORTED APRONS / 1 T) CONTAMINATION / 100 / 100 / 100 / PERCENT.) .23 NOV 12: 24 2016 UNTIL 24 NOV 12: 24 2016. CREATED: 23 NOV 12: 28 2016 ";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView txtview1 =(TextView)findViewById(R.id.textView);
        TextView txtview2 =(TextView)findViewById(R.id.textView2);
        TextView txtview3 =(TextView)findViewById(R.id.textView3);
        TextView txtview4 =(TextView)findViewById(R.id.textView4);
        TextView txtview5 =(TextView)findViewById(R.id.textView5);
        TextView txtview6 =(TextView)findViewById(R.id.textView6);
        TextView txtview7 =(TextView)findViewById(R.id.textView7);


      /*  txtview1.setText(sn.getB());
        txtview2.setText(td.getTradB());
        txtview3.setText(td.getTradG());
        txtview4.setText(td.getTradH());
        txtview5.setText(td.getTradN());
        txtview6.setText(td.getTradR());
      */  txtview7.setText(td.getTradT());

    }
}
