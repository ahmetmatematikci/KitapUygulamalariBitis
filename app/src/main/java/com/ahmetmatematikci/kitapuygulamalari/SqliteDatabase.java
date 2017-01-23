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
    Button bt1, bt2,bt3, bt4, bt5,bt6,bt7;

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
        bt4 =(Button)findViewById(R.id.button21);
        bt5 =(Button)findViewById(R.id.button22);
        bt6 =(Button)findViewById(R.id.button23);
        bt7 =(Button)findViewById(R.id.button24);

        et1 = (EditText)findViewById(R.id.editText10);
        et2 = (EditText)findViewById(R.id.editText11);
        et3 = (EditText)findViewById(R.id.editText12);
        et4 = (EditText)findViewById(R.id.editText13);

        bt1.setOnClickListener(this);
        bt2.setOnClickListener(this);
        bt3.setOnClickListener(this);
        bt4.setOnClickListener(this);
        bt5.setOnClickListener(this);
        bt6.setOnClickListener(this);
        bt7.setOnClickListener(this);

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

            case R.id.button21:

                String duzenleencekuye = et4.getText().toString();
                int duzenlenecek = Integer.valueOf(duzenleencekuye);
                String yeniaraba = et1.getText().toString();
                String yenimodel = et2.getText().toString();
                String  yenideger = et3.getText().toString();

                DatabaseClass dbclass = new DatabaseClass(SqliteDatabase.this);
                dbclass.open();
                dbclass.yenile(duzenlenecek, yeniaraba, yenimodel, yenideger);
                dbclass.close();
                Toast.makeText(SqliteDatabase.this,  duzenlenecek + ".  Satır Başarı ile Güncellendi", Toast.LENGTH_SHORT).show();

                break;

            case R.id.button22:
                String markaid = et4.getText().toString();
                int markid = Integer.valueOf(markaid);
                DatabaseClass dbc = new DatabaseClass(SqliteDatabase.this);
                dbc.open();
               String donenmarka =  dbc.markayidondur(markid);
                dbc.close();
                Toast.makeText(SqliteDatabase.this,  donenmarka , Toast.LENGTH_SHORT).show();

                break;

            case R.id.button23:
                String modelid = et4.getText().toString();
                int modid = Integer.valueOf(modelid);
                DatabaseClass dbcc = new DatabaseClass(SqliteDatabase.this);
                dbcc.open();
                String donenmodel =  dbcc.modelidondur(modid);
                dbcc.close();
                Toast.makeText(SqliteDatabase.this,  donenmodel , Toast.LENGTH_SHORT).show();


                break;


            case R.id.button24:
                String degerid = et4.getText().toString();
                int degid = Integer.valueOf(degerid);
                DatabaseClass dbccc = new DatabaseClass(SqliteDatabase.this);
                dbccc.open();
                String donendeger =  dbccc.degeridondur(degid);
                dbccc.close();
                Toast.makeText(SqliteDatabase.this,  donendeger , Toast.LENGTH_SHORT).show();


                break;
        }


    }
}
