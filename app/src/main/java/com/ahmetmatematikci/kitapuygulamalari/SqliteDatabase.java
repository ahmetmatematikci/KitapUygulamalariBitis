package com.ahmetmatematikci.kitapuygulamalari;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


/**
 * Created by a on 1/23/17.
 */

public class SqliteDatabase  extends Activity implements View.OnClickListener{

    EditText et1, et2,et3, et4;
    Button bt1, bt2,bt3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sqlitedatabase);

        tanimlar();


    }

    private void tanimlar() {
        bt1 = (Button)findViewById(R.id.button18);
        bt2 =(Button)findViewById(R.id.button19);
        bt3 =(Button)findViewById(R.id.button20);

        et1 = (EditText)findViewById(R.id.editText10);
        et2 = (EditText)findViewById(R.id.editText11);
        et3 = (EditText)findViewById(R.id.editText12);
        et4 = (EditText)findViewById(R.id.editText13);

        bt1.setOnClickListener(this);
        bt2.setOnClickListener(this);
        bt3.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {

            case R.id.button18:

                String araba = et1.getText().toString();
                String model = et2.getText().toString();
                String deger = et3.getText().toString();
                DatabaseClass db = new DatabaseClass(SqliteDatabase.this);
                db.open();
                db.olustur(araba, model, deger);
                db.close();
                Log.i("Database işlemleri", "DB başarılı");
                Toast.makeText(SqliteDatabase.this, "Veri Tabanına kayıt başarılı", Toast.LENGTH_SHORT).show();


                break;

            case R.id.button19:

                Intent i = new Intent(SqliteDatabase.this, sqldatabasegoruntu.class);
                startActivity(i);


                break;

            case R.id.button20:
                String silinecekuye = et4.getText().toString();
                int silinecek = Integer.valueOf(silinecekuye);
                DatabaseClass databaseclass = new DatabaseClass(SqliteDatabase.this);
                databaseclass.open();
                databaseclass.sil(silinecek);
                databaseclass.close();
                Toast.makeText(SqliteDatabase.this,  silinecek + ".  Satır Başarı ile silindi", Toast.LENGTH_SHORT).show();


                break;
        }


    }
}
