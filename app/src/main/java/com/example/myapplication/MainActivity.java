package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lsds;
    ArrayList<String> list;
    Button bt;
    EditText edt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lsds=(ListView)findViewById(R.id.lsds);
        list= new ArrayList<String>();
        bt= (Button)findViewById(R.id.bt);
        edt=(EditText)findViewById(R.id.edt);

        list.add("Phuong Thao");
        list.add("Phuong Uyen");
        list.add("Thuy Linh");
        list.add("Vu Duong");
        list.add("Thanh Thuy");
        list.add("Tien Phuong");

        final ArrayAdapter adapter;
        adapter = new ArrayAdapter(
                MainActivity.this,
                android.R.layout.simple_expandable_list_item_1,
                list
        );
        lsds.setAdapter(adapter);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ten= edt.getText().toString();
                list.add(ten);
                adapter.notifyDataSetChanged();
                edt.setText("");

            }
        });
    }
}
