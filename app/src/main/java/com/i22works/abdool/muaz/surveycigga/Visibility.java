package com.i22works.abdool.muaz.surveycigga;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.i22works.abdool.muaz.model.Model;

import java.util.ArrayList;
import java.util.List;

public class Visibility extends AppCompatActivity {
  private ArrayList<String> brands;
  public  CustomVisibilityAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visibility);
        Bundle bundle =getIntent().getExtras();

        brands=bundle.getStringArrayList(constants.CHOSEN_BRANDS);

        ListView listView=(ListView)findViewById(R.id.listview);

        adapter = new CustomVisibilityAdapter(this,R.layout.custom_visibility_row,intialize(brands));
        listView.setAdapter(adapter);





    }

    private List<Model> intialize(ArrayList<String> brands) {

        ArrayList<Model> models = new ArrayList<>();
        boolean state=false;
        for (String s:brands
             ) {




            models.add(new Model(s,false,false,false,false));

        }

        return  models;
    }

    public void gotoAvailbility(View view) {
    }
}
