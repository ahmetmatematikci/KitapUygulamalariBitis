package com.ahmetmatematikci.kitapuygulamalari;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by a on 1/20/17.
 */

public class InternalHafiza extends Activity {
    EditText et1;
    TextView tv1;
    Button bt1, bt2;
    String FILENAME="dosya";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.internalhafiza);
        et1 = (EditText)findViewById(R.id.editText8);
        tv1 = (TextView)findViewById(R.id.textView17);
        bt1 = (Button)findViewById(R.id.button15);
        bt2 = (Button)findViewById(R.id.button16);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String kullanicininverdigi = et1.getText().toString();
                try {
                    FileOutputStream fos = openFileOutput(FILENAME, MODE_PRIVATE);
                    fos.write(kullanicininverdigi.getBytes());
                    fos.close();
                    Toast.makeText(InternalHafiza.this, "Internala Yaızldı", Toast.LENGTH_LONG).show();

                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String hafizadaalinan = null;
                try {
                    FileInputStream fis = openFileInput(FILENAME);
                    byte[] veriarrayi = new byte[fis.available()];

                    while (fis.read(veriarrayi )!=-1) {
                        hafizadaalinan = new String(veriarrayi);

                    }
                    tv1.setText(hafizadaalinan);
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                    e.getMessage();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        });

    }
}
