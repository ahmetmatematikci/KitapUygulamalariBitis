package com.ahmetmatematikci.kitapuygulamalari;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

/**
 * Created by a on 1/18/17.
 */

public class KullaniciGirisi extends Activity  implements View.OnClickListener{

    EditText et1, et2;
    Button bt;


    protected  void onCreate(Bundle s){
        super.onCreate(s);
        setContentView(R.layout.kullanicigirisi);

        tanimlar();

    }

    private void tanimlar() {
        et1 = (EditText)findViewById(R.id.editText);
        et2 = (EditText)findViewById(R.id.editText2);
        bt = (Button)findViewById(R.id.button4);

        bt.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String isim = et1.getText().toString();
        String yas= et2.getText().toString();
        Intent i = new Intent(KullaniciGirisi.this, VeriAlisi.class);
        i.putExtra("ad",isim);
        i.putExtra("yas", yas);
        startActivity(i);

    }
}
