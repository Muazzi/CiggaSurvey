package com.i22works.abdool.muaz.surveycigga;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CheckedTextView;
import android.widget.TextView;

import com.i22works.abdool.muaz.model.Customer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by muaz1 on 2018/02/23.
 */

public class CustomAdapter extends ArrayAdapter {

    private List<String> brand_names;
    Context context;

    public CustomAdapter(@NonNull Context context,List<String>brand_names  ) {
        super(context,R.layout.row);
        this.context=context;
        this.brand_names=brand_names;


    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater =((Activity)context).getLayoutInflater();
        convertView=inflater.inflate(R.layout.row,parent,false);
        CheckedTextView textView =(CheckedTextView)convertView.findViewById(R.id.checkbox);

         String name =  brand_names.get(position);
        Log.i("the name",name);
        textView.setText(name);

        return  convertView;
    }

    @Override
    public int getCount() {
        return brand_names.size();
    }

    @Nullable
    @Override
    public Object getItem(int position) {
        return  brand_names.get(position);
    }

    @Override
    public long getItemId(int position) {
        return  position;
    }
}
