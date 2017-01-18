package com.ahmetmatematikci.kitapuygulamalari;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

/**
 * Created by a on 1/18/17.
 */

public class SorCevap extends Activity implements View.OnClickListener {

    Button bt;
    RadioGroup rg;

    RadioButton r1,r2,r3,r4;

    public void onCreate (Bundle s) {
        super.onCreate(s);
        setContentView(R.layout.sorcevap);
        tanimlar();


    }

    private void tanimlar() {

       rg  = (RadioGroup)findViewById(R.id.rg) ;

        bt = (Button)findViewById(R.id.button3);
        r1 = (RadioButton)findViewById(R.id.radioButton);
        r2 = (RadioButton)findViewById(R.id.radioButton2);
        r3 = (RadioButton)findViewById(R.id.radioButton3);
        r4 = (RadioButton)findViewById(R.id.radioButton4);
        bt.setOnClickListener(this);


    }


    @Override
    public void onClick(View view) {
        if (r1.isChecked()){
            Toast.makeText(this,"Yanlış Cevap", Toast.LENGTH_LONG).show();
        } else if(r2.isChecked()) {
            Toast.makeText(this,"Yanlış Cevap", Toast.LENGTH_LONG).show();

        } else if (r3.isChecked()) {
            Toast.makeText(this,"Doğru Cevap", Toast.LENGTH_LONG).show();


        } else  if (r4.isChecked()) {
            Toast.makeText(this,"Doğru Cevap", Toast.LENGTH_LONG).show();

        }

    }
}
