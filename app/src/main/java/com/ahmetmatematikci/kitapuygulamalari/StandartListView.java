package com.ahmetmatematikci.kitapuygulamalari;

import android.app.Activity;
import android.os.Bundle;
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



    }
}
