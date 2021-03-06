package com.example.multiscreenapps3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class schoolClassesAdapter extends ArrayAdapter<schoolClasses> {

    private int mResource;
    private Context mContext;

    public schoolClassesAdapter(@NonNull Context context, int resource, @NonNull ArrayList<schoolClasses> objects) {
        super(context, resource, objects);
        this.mContext = context;
        this.mResource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(mContext);

        convertView = layoutInflater.inflate(mResource, parent, false);

        TextView cijfer = convertView.findViewById(R.id.cijfer);

        TextView vak = convertView.findViewById(R.id.vak);

        vak.setText(getItem(position).getvak());

        cijfer.setText(getItem(position).getcijfer());



        return convertView;
    }
}