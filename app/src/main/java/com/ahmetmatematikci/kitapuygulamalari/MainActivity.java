package com.ahmetmatematikci.kitapuygulamalari;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends ListActivity {

    String[] sayfalar = {"CameraAPP", "SorCevap","KullaniciGirisi", "CustomButton","HareketAlgilayici","SharedPrefOrnek",
            "BasitWebTarayici", "TabHostOrnek","ViewDegistir", "StandartListView","CustomListView"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      //  setContentView(R.layout.activity_main);

        setListAdapter(new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1,sayfalar));


    }


    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        String sayfa = sayfalar[position];

        Class gis;
        try {
            gis = Class.forName("com.ahmetmatematikci.kitapuygulamalari." + sayfa);
            Intent i = new Intent(MainActivity.this, gis);
            startActivity(i);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

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
                Intent i = new Intent(MainActivity.this, ViewDegistir.class );
                startActivity(i);

                break;

            case R.id.ayarlarid:
                Intent intent = new Intent(MainActivity.this, Ayarlar.class);
                startActivity(intent);


                break;

            case R.id.cikis:
                finish();

                break;

        }
        return false;
    }
}
