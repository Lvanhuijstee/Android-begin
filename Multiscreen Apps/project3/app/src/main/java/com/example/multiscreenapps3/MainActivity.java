package com.example.multiscreenapps3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.list);

        ArrayList<schoolClasses> arrayList = new ArrayList<>();
        arrayList.add(new schoolClasses(R.layout.list_item, "10", "Rekenen"));
        arrayList.add(new schoolClasses(R.layout.list_item, "10", "Loopbaan & Burgerschap"));
        arrayList.add(new schoolClasses(R.layout.list_item, "10", "Nederlands"));
        arrayList.add(new schoolClasses(R.layout.list_item, "10", "Engels"));


        schoolClassesAdapter schoolClassesAdapter = new schoolClassesAdapter(this, R.layout.list_item,arrayList);

        listView.setAdapter(schoolClassesAdapter);

    }
}
