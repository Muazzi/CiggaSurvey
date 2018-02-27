package com.i22works.abdool.muaz.surveycigga;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class VisitingInformation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visiting_information);

        EditText designation =(EditText)findViewById(R.id.edt_designation);
        EditText contact = (EditText)findViewById(R.id.edt_contact_info);
        Button btn_finish=(Button)findViewById(R.id.Complete);
    }
}
