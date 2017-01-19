package com.ahmetmatematikci.kitapuygulamalari;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

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


    }
}
