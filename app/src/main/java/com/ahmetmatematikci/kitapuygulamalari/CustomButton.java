package com.ahmetmatematikci.kitapuygulamalari;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by a on 1/18/17.
 */

public class CustomButton  extends Activity implements View.OnClickListener{
    TextView tv9;
    Carpici c;
    EditText et3, et4;
    Button bt5;
    protected  void onCreate(Bundle s) {
        super.onCreate(s);
        setContentView(R.layout.custombutton);
        et3 = (EditText)findViewById(R.id.editText3);
        et4 = (EditText)findViewById(R.id.editText4);
        bt5 = (Button)findViewById(R.id.button5);
        tv9 = (TextView)findViewById(R.id.textView9) ;
        bt5.setOnClickListener(this);



    }

    @Override
    public void onClick(View view) {

        int a = Integer.valueOf(et3.getText().toString());
        int b = Integer.valueOf(et4.getText().toString());
        c = new Carpici(a,b);
        int d = c.carp(a,b);
        tv9.setText(""+ d);

    }
}
