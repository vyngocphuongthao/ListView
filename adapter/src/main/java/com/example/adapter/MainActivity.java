package com.example.adapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvSinhVien;
    ArrayList<SinhVien>mangSinhVien;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvSinhVien=(ListView)findViewById(R.id.lvSinhVien);
        mangSinhVien= new ArrayList<SinhVien>();

        mangSinhVien.add(new SinhVien("Nguyen A",1990));
        mangSinhVien.add(new SinhVien("Nguyen B",1990));
        mangSinhVien.add(new SinhVien("Nguyen C",1990));
        mangSinhVien.add(new SinhVien("Nguyen D",1990));
        mangSinhVien.add(new SinhVien("Nguyen E",1990));

        SinhVienAdapter adapter= new SinhVienAdapter(
                MainActivity.this,
                R.layout.dong_sinh_vien,
                mangSinhVien

        );
        lvSinhVien.setAdapter(adapter);

    }
}
