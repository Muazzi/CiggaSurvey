package com.i22works.abdool.muaz.surveycigga;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BasicInformation extends AppCompatActivity {
   private  String name_of_store;
   private EditText edt_name_of_store;
   private Button btn_next;
   private ListView listView_brands;
    private ArrayList<String> items;
private  CustomAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_information);

        edt_name_of_store =(EditText)findViewById(R.id.Storename);
        btn_next=(Button)findViewById(R.id.next);
        listView_brands=(ListView) findViewById(R.id.Brands);


        List<String> names = Arrays.asList(getResources().getStringArray(R.array.brands));

        adapter = new CustomAdapter(this,names);
        listView_brands.setAdapter(adapter);



    }
}
