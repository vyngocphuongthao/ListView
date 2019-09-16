package com.example.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class SinhVienAdapter extends BaseAdapter {
    Context mycontexr;
    int mylayout;
    List<SinhVien> arraySinhVien;
    public  SinhVienAdapter(Context context, int layout, List<SinhVien>listSinhVien){
    mycontexr=context;
    mylayout=layout;
    arraySinhVien=listSinhVien;
    }
    @Override
    public int getCount() {
        return arraySinhVien.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater=(LayoutInflater) mycontexr.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view=inflater.inflate(mylayout,null);
        TextView txtHoTen=(TextView) view.findViewById(R.id.textViewHoTen);
        txtHoTen.setText(arraySinhVien.get(i).HoTen);
        TextView txtNamSinh=(TextView)view.findViewById(R.id.textViewNamSinh);
        txtNamSinh.setText( String.valueOf(arraySinhVien.get(i).NamSinh));
        return view;
    }
}
