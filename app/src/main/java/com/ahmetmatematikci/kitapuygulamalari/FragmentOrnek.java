package com.ahmetmatematikci.kitapuygulamalari;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by a on 1/24/17.
 */

public class FragmentOrnek extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragmentornek);
        ListView liste1 =(ListView)findViewById(R.id.listView2);
        String[] hayvanlar  = new String[] {"At", "Kaplan", "Fil", "Kedi", "At", "Kaplan", "Fil",
                "Kedi", "At", "Kaplan", "Fil", "Kedi","At", "Kaplan", "Fil", "Kedi" };

        ArrayAdapter adapter = new ArrayAdapter(FragmentOrnek.this, android.R.layout.simple_list_item_1, hayvanlar);
        liste1.setAdapter(adapter);
        liste1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
                String isim = String.valueOf(parent.getItemAtPosition(i));
                Bundle bundle = new Bundle();
                bundle.putString("isim" ,isim);


                FragmentB fragb = new FragmentB();
                fragb.setArguments(bundle);
                FragmentManager manager = getFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.add(R.id.layout6, fragb, "fragmentb" );
                transaction.commit();


            }
        });


    }
}
