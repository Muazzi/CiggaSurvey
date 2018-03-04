package com.i22works.abdool.muaz.surveycigga;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

import com.i22works.abdool.muaz.model.Model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by muaz1 on 2018/03/04.
 */

public class CustomVisibilityAdapter  extends ArrayAdapter<Model> {

    public List<Model> modelArrayList = new ArrayList<>();
    Context context;
    int layoutResourceID;
    CheckBox hotspot,eyelevel,lowershelf,notvisable;
    Model m=null;
    public CustomVisibilityAdapter(@NonNull Context context, int resource, List<Model> models) {
        super(context, resource,models);
        this.layoutResourceID=resource;
        this.context=context;
        this.modelArrayList=models;
    }

    @Override
    public int getCount() {
        return modelArrayList.size();
    }

    @Nullable
    @Override
    public Model getItem(int position) {
        return  modelArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        if (convertView==null)
        {
            LayoutInflater inflater =((Activity) context).getLayoutInflater();
            convertView=inflater.inflate(layoutResourceID,parent,false);
        }

        TextView textView =(TextView) convertView.findViewById(R.id.name);
        hotspot=(CheckBox)convertView.findViewById(R.id.hotspot);

        hotspot.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                {
                    modelArrayList.get(position).setHotspot(isChecked);
                }

            }
        });


        eyelevel=(CheckBox)convertView.findViewById(R.id.eye);
        eyelevel.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                modelArrayList.get(position).setEyeLevel(isChecked);
            }
        });

        lowershelf=(CheckBox)convertView.findViewById(R.id.shelf);

        lowershelf.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                modelArrayList.get(position).setLowerShelf(isChecked);
            }
        });


        notvisable=(CheckBox)convertView.findViewById(R.id.notVisable);
        notvisable.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                modelArrayList.get(position).setVisable(isChecked);
            }
        });

        m =modelArrayList.get(position);

        hotspot.setChecked(m.isHotspot());
        eyelevel.setChecked(m.isEyeLevel());
        lowershelf.setChecked(m.isLowerShelf());
        notvisable.setChecked(m.getVisable());



        textView.setText(m.getName());
        return  convertView;
    }

}
