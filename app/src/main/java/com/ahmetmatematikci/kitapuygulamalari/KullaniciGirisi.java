package com.ahmetmatematikci.kitapuygulamalari;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

/**
 * Created by a on 1/18/17.
 */

public class KullaniciGirisi extends AppCompatActivity implements View.OnClickListener{

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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);

        MenuInflater menux = getMenuInflater();
        menux.inflate(R.menu.menu_main, menu);
        return  true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {

            case R.id.ulasid:
                Intent i = new Intent(KullaniciGirisi.this, ViewDegistir.class );
                startActivity(i);

                break;

            case R.id.ayarlarid:
                Intent intent = new Intent(KullaniciGirisi.this, Ayarlar.class);
                startActivity(intent);


                break;

            case R.id.cikis:
                finish();

                break;

        }
        return false;
    }
}
