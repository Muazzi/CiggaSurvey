package com.i22works.abdool.muaz.surveycigga;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class StoreInfo extends AppCompatActivity {


    RadioGroup Q1,Q2,Q3,Q4,Q5,Q6;
    String manger_choice,kiosk_choice,gltc,spar,display_unit,menthol;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store_info);

        Q1=(RadioGroup)findViewById(R.id.rg_manger_name);

        Q2=(RadioGroup)findViewById(R.id.rg_kiosk_name);
        Q3=(RadioGroup)findViewById(R.id.rg_gltc);
        Q4=(RadioGroup)findViewById(R.id.rg_spar);
        Q5=(RadioGroup)findViewById(R.id.rg_display_unit);
        Q6=(RadioGroup)findViewById(R.id.rg_menthol);

    }

    private  String GetChoice(RadioGroup rg)
    {
        int selectedRadioButtonID = rg.getCheckedRadioButtonId();
        if (selectedRadioButtonID != -1) {

            RadioButton selectedRadioButton = (RadioButton) findViewById(selectedRadioButtonID);
            String selectedRadioButtonText = selectedRadioButton.getText().toString();

           return  selectedRadioButtonText;
        }
        else
        {
            return  "None was selected";
        }
    }


    public void send_store_survey_data(View view) {
   manger_choice=GetChoice(Q1);
   kiosk_choice=GetChoice(Q2);
        gltc=GetChoice(Q3);
        spar=GetChoice(Q4);
        display_unit=GetChoice(Q5);
        menthol=GetChoice(Q6);

        Log.i("manager_choice",manger_choice);
        Log.i("kiosk_choice",kiosk_choice);
        Log.i("gltc_choice",gltc);
        Log.i("spar_choice",spar);
        Log.i("display_choice",display_unit);
        Log.i("menthol_choice",menthol);



    }
}
