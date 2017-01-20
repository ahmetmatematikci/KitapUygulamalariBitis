package com.ahmetmatematikci.kitapuygulamalari;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by a on 1/20/17.
 */

public class ActivityHayatDongusu extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i("tago", "oncreate çağrıldı");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kullanicigirisi);
    }


    @Override
    protected void onStart() {
        Log.i("tago", "onStart çağrıldı");
        super.onStart();
    }

    @Override
    protected void onPostResume() {
        Log.i("tago", "onPostResume çağrıldı");
        super.onPostResume();
    }

    @Override
    protected void onPause() {
        Log.i("tago", "onPause çağrıldı");
        super.onPause();
    }





    @Override
    protected void onStop() {
        Log.i("tago", "onStop çağrıldı");
        super.onStop();
    }




    @Override
    protected void onDestroy() {
        Log.i("tago", "onDestroy çağrıldı");
        super.onDestroy();
    }
}
