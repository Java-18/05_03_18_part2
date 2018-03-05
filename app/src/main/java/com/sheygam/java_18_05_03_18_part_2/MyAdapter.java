package com.sheygam.java_18_05_03_18_part_2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by gregorysheygam on 05/03/2018.
 */

public class MyAdapter extends BaseAdapter {
    private ArrayList<Person> items;
    private Context context;

    public MyAdapter(Context context) {
        this.context = context;
        items = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            items.add(new Person("Person " + i,"person"+i+"@mail.com"));
        }
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null){
//           LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            LayoutInflater inflater = LayoutInflater.from(context);
//            convertView = inflater.inflate(R.layout.my_row,null);
//            convertView = inflater.inflate(R.layout.my_row,parent);
            convertView = inflater.inflate(R.layout.my_row,parent,false);
        }
        Person p = items.get(position);
        TextView nameTxt = convertView.findViewById(R.id.name_txt);
        TextView emailTxt = convertView.findViewById(R.id.email_txt);
        nameTxt.setText(p.getName());
        emailTxt.setText(p.getEmail());
        return convertView;
    }

    public void addPerson(Person p){
        items.add(0, p);
        notifyDataSetChanged();
    }
}
