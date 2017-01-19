package com.ahmetmatematikci.kitapuygulamalari;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by a on 1/18/17.
 */

public class SharedPrefOrnek extends Activity {
    EditText et1, et2;
    Button bt;
    String isim;
    String yas;

    protected  void onCreate(Bundle s) {
        super.onCreate(s);
        setContentView(R.layout.kullanicigirisi);
        et1 = (EditText)findViewById(R.id.editText);
        et2 = (EditText)findViewById(R.id.editText2);
        bt = (Button)findViewById(R.id.button4);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                isim = et1.getText().toString();
                yas = et2.getText().toString();
                sharedPrefencesKaydet();

            }



        });



    }

    private void sharedPrefencesKaydet() {
        SharedPreferences sP = getSharedPreferences("kullaniciverileri", Context.MODE_PRIVATE);
        SharedPreferences.Editor prefEditor = sP.edit();
        prefEditor.putString("isim", isim);
        prefEditor.putString("yas" , yas);
        prefEditor.commit();
        Log.i("tago", "shared prefences kaydedildi");
}
}