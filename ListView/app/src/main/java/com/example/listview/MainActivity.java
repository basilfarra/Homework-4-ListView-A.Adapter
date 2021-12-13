package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText et;
    Button bt;
    ListView lv;
    ArrayList<String> arrayList;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et = (EditText) findViewById(R.id.editTextTextPersonName3);
        bt = (Button) findViewById(R.id.button_addData);
        lv = (ListView) findViewById(R.id.listView_lv);

            arrayList = new ArrayList<String>();
            adapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_expandable_list_item_1, arrayList);
            lv.setAdapter(adapter);

            onClick();

    }

    public void onClick(){

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String result =  et.getText().toString();
                arrayList.add(result);
                adapter.notifyDataSetChanged();

            }
        });
    }
}