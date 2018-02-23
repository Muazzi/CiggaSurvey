package com.i22works.abdool.muaz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Spinner;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import com.i22works.abdool.muaz.surveycigga.R;

import java.util.ArrayList;

public class Visabality extends AppCompatActivity {
  TableLayout tableLayout;
    private ArrayList<String> data = new ArrayList<String>();
    private ArrayList<String> data1 = new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visabality);

        tableLayout=(TableLayout)findViewById(R.id.mytable);

        data.add("Samsung");
        data.add("Apple");
        data.add("Pixle");
        data.add("Vivo");
        data1.add(" $109");
        data1.add(" $200");
        data1.add(" $399");
        data1.add(" $290");
        for(int i=0;i<data.size();i++)
        {
            TableRow row=new TableRow(this);
            String phone = data.get(i);
            String amount = data1.get(i);
            TextView tv1=new TextView(this);
            tv1.setText(phone);
            TextView tv2=new TextView(this);
            Spinner spinner = new Spinner(this);
            
            tv2.setText(amount);
            row.addView(tv1);
            row.addView(tv2);

            tableLayout.addView(row);
        }


    }
}
