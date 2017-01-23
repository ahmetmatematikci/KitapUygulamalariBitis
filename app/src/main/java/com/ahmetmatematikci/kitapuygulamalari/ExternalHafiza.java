package com.ahmetmatematikci.kitapuygulamalari;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaScannerConnection;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Created by a on 1/20/17.
 */

public class ExternalHafiza extends Activity  {
    RadioGroup rg;
    RadioButton r1, r2,r3;
    EditText et;
    Button bt;
    boolean okunabilir, yazilabilir;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.externalhafiza);

        tanimlar();

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (r1.isChecked()) {

                    try {
                        externalUygunmu();
                        String dosyaadi =  et.getText().toString() + ".mp3";
                        File path = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MUSIC);
                        path.mkdir();
                        File file = new File(path, dosyaadi);
                        InputStream is = getResources().openRawResource(R.raw.kus);
                        OutputStream os = new FileOutputStream(file);

                        byte[] veriArrayi = new byte[is.available()];
                        is.read(veriArrayi);
                        os.write(veriArrayi);
                        is.close();
                        os.close();
                        Toast.makeText(ExternalHafiza.this, "Müziklere başarı ile kaydedildi", Toast.LENGTH_SHORT).show();
                        MediaScannerConnection.scanFile(ExternalHafiza.this, new String[]{file.toString()}, null, null);

                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                } else if (r2.isChecked()) {

                    try {
                        externalUygunmu();
                        String dosyaadi =  et.getText().toString() + ".jpg";
                        File path = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
                        path.mkdir();
                        File file = new File(path, dosyaadi);
                        InputStream is = getResources().openRawResource(R.raw.kumkat);
                        OutputStream os = new FileOutputStream(file);

                        byte[] veriArrayi = new byte[is.available()];
                        is.read(veriArrayi);
                        os.write(veriArrayi);
                        is.close();
                        os.close();
                        Toast.makeText(ExternalHafiza.this, "Resimlere başarı ile kaydedildi", Toast.LENGTH_SHORT).show();
                        MediaScannerConnection.scanFile(ExternalHafiza.this, new String[]{file.toString()}, null, null);

                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                }  else if (r3.isChecked()) {

                    try {
                        externalUygunmu();
                        String dosyaadi =  et.getText().toString() + ".txt";
                        File path = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
                        path.mkdir();
                        File file = new File(path, dosyaadi);
                        InputStream is = getResources().openRawResource(R.raw.yazi);
                        OutputStream os = new FileOutputStream(file);

                        byte[] veriArrayi = new byte[is.available()];
                        is.read(veriArrayi);
                        os.write(veriArrayi);
                        is.close();
                        os.close();
                        Toast.makeText(ExternalHafiza.this, "Indirilenlere başarı ile kaydedildi", Toast.LENGTH_SHORT).show();
                        MediaScannerConnection.scanFile(ExternalHafiza.this, new String[]{file.toString()}, null, null);

                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }




                } else {

                    Toast.makeText(ExternalHafiza.this, "Bu ekranda birini seçiniz", Toast.LENGTH_SHORT).show();


                }
            }
        });


        externalUygunmu();
    }

    private void externalUygunmu() {

        String durum= Environment.getExternalStorageState();
        if (durum.equals(Environment.MEDIA_MOUNTED)) {
            okunabilir = true;
            yazilabilir =  true;
            Log.i("hafıza kaydetme ", "okunabilir ve yazılabilir");

        } else if (durum.equals(Environment.MEDIA_MOUNTED_READ_ONLY)) {
            okunabilir = true;
            yazilabilir = false;
            Log.i("Hafıza kaydetme", "okunabilir ama yazılamaz");
        } else  {
            okunabilir = false;
            yazilabilir = false;
            Log.i("Hafıza kaydetme", "okunamaz yazılamaz");
        }
    }

    private void tanimlar() {
        et = (EditText)findViewById(R.id.editText9) ;

        rg = (RadioGroup)findViewById(R.id.radioGroup);
        r1 = (RadioButton)findViewById(R.id.radioButton8);
        r2 = (RadioButton)findViewById(R.id.radioButton9);
        r3 = (RadioButton)findViewById(R.id.radioButton10);
        bt  =(Button)findViewById(R.id.button17);

    }


}
