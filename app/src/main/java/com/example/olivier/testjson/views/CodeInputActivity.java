package com.example.olivier.testjson.views;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.example.olivier.testjson.R;

import java.util.ArrayList;


public class CodeInputActivity extends AppCompatActivity {

    public final static String SNOWTAM_CODE = "snowtamCode";
    ListView listCode;
    Button okButton;
    EditText etInputCode;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_code_input);
        getComponents();
        setListAdapterAndClickListener();
    }

    private void getComponents() {
        listCode = (ListView) findViewById(R.id.listCode);
        okButton = (Button) findViewById(R.id.okbutton);
        etInputCode = (EditText) findViewById(R.id.etInputCode);
    }

    private void setListAdapterAndClickListener() {
        ArrayList<String> codes = new ArrayList<>();
        adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, codes);
        listCode.setAdapter(adapter);
        listCode.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(CodeInputActivity.this, SnowtamShowActivity.class);
                intent.putExtra(SNOWTAM_CODE, etInputCode.getText().toString());
                startActivity(intent);
            }
        });
    }

    public void addCode(View view) {
        adapter.add(etInputCode.getText().toString());
    }
}
