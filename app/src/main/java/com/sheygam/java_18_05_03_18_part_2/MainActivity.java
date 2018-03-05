package com.sheygam.java_18_05_03_18_part_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private String[] arr = {"Name1",
            "Name2",
            "Name3",
            "Name4",
            "Name5",
            "Name6",
            "Name7",
            "Name8",
            "Name9",
            "Name10",
            "Name11",
            "Name12",
            "Name13",
            "Name14",
            "Name15"};
    private ListView myList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myList = findViewById(R.id.my_list);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,R.layout.my_simple_row,arr);
//        myList.setAdapter(adapter);
        final MyAdapter myAdapter = new MyAdapter(this);
        myList.setAdapter(myAdapter);
        Button addBtn = findViewById(R.id.add_btn);
        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myAdapter.addPerson(new Person("Vasya","vasya@mail.com"));
            }
        });
//        Button button = new Button(this);
//        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.WRAP_CONTENT);
//        params.weight = 1;
//        button.setLayoutParams(params);
//        Button button1 = new Button(this);
//        LinearLayout.LayoutParams params2 = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.WRAP_CONTENT);
//        params2.weight = 1;
//        button.setLayoutParams(params2);
//
//        LinearLayout linearLayout = new LinearLayout(this);
//        ViewGroup.LayoutParams params1 = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
//        linearLayout.setOrientation(LinearLayout.HORIZONTAL);
//        linearLayout.setLayoutParams(params1);
//        linearLayout.addView(button);
//        linearLayout.addView(button1);
//        setContentView(linearLayout);
    }
}
