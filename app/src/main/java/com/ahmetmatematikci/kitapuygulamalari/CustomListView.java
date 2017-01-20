package com.ahmetmatematikci.kitapuygulamalari;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by a on 1/19/17.
 */

public class CustomListView extends Activity{
    ArrayList<Hayvan> hayvanlar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.standartlistview);
        hayvanlar = new ArrayList();

        hayvanlariekle();
        ListView liste1 = (ListView)findViewById(R.id.listView);
        HayvanAdapter adapter = new HayvanAdapter(CustomListView.this, R.layout.listitem_row, hayvanlar);
        liste1.setAdapter(adapter);

    }

    private void hayvanlariekle() {
        hayvanlar.add(new Hayvan(R.mipmap.b, "Kurt"));
        hayvanlar.add(new Hayvan(R.mipmap.c, "Komodo Ejderi"));
        hayvanlar.add(new Hayvan(R.mipmap.d, "kertenkele"));
        hayvanlar.add(new Hayvan(R.mipmap.e, "Yılan"));
        hayvanlar.add(new Hayvan(R.mipmap.f, "Kurt"));
        hayvanlar.add(new Hayvan(R.mipmap.g, "Komodo Ejderi"));
        hayvanlar.add(new Hayvan(R.mipmap.h, "Kurt"));
        hayvanlar.add(new Hayvan(R.mipmap.k, "Komodo Ejderi"));
        hayvanlar.add(new Hayvan(R.mipmap.l, "Kurt"));
        hayvanlar.add(new Hayvan(R.mipmap.m, "Komodo Ejderi"));
        hayvanlar.add(new Hayvan(R.mipmap.n, "Kurt"));
        hayvanlar.add(new Hayvan(R.mipmap.x, "Komodo Ejderi"));
        hayvanlar.add(new Hayvan(R.mipmap.y, "Kurt"));



    }
}
