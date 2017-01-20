package com.ahmetmatematikci.kitapuygulamalari;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

/**
 * Created by a on 1/19/17.
 */

public class StandartListView  extends Activity{
    ListView liste1;

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);



    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {

        switch (item.getItemId()) {

            case R.id.ulasid:
                Intent i = new Intent(StandartListView.this, ViewDegistir.class );
                startActivity(i);

                break;

            case R.id.ayarlarid:
                Intent intent = new Intent(StandartListView.this, Ayarlar.class);
                startActivity(intent);


                break;

            case R.id.cikis:
                //finish();   //Direk kapatıyor
                AlertDialog.Builder builder = new AlertDialog.Builder(StandartListView.this);
                builder.setTitle("Çıkmak mı İstiyorsunuz");
                builder.setMessage("Çıkmak mı istiyorsunuz");
                builder.setCancelable(false);       //Ekranda butona basana kadar kalıyor.
                builder.setIcon(android.R.drawable.alert_dark_frame);
                builder.setPositiveButton("Evet İstiyorum", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        StandartListView.this.finish();
                    }
                });
                builder.setNegativeButton("Vazgeç", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(StandartListView.this, "Tekrardan Hoş geldiniz", Toast.LENGTH_LONG).show();
                        dialogInterface.dismiss();

                    }
                });

                AlertDialog dialog = builder.create();
                dialog.show();

                break;

        }



        return super.onContextItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.standartlistview);
        String[] hayvanlar = new String[] {"Kedi", "Köpek", "Fil", "Kurt","Aslan", "Balık","Kedi",
                "Köpek", "Fil", "Kurt","Aslan", "Balık","Kedi", "Köpek", "Fil", "Kurt","Aslan", "Balık"};

        liste1 = (ListView)findViewById(R.id.listView);
        ArrayAdapter hayvanlarListesi = new ArrayAdapter(this,android.R.layout.simple_list_item_1, hayvanlar);
        liste1.setAdapter(hayvanlarListesi);

        liste1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {

                String secilenHayvan = String.valueOf(parent.getItemAtPosition(i));
                Toast.makeText(StandartListView.this, secilenHayvan, Toast.LENGTH_SHORT).show();

            }
        });

        registerForContextMenu(liste1);




    }
}
