package com.ahmetmatematikci.kitapuygulamalari;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

/**
 * Created by a on 1/18/17.
 */

public class GirisEkrani extends Activity {
    MediaPlayer mP;
    public void onCreate (Bundle s){
        super.onCreate(s);
        setContentView(R.layout.girisekrani);

        mP= MediaPlayer.create(this,R.raw.kus);
        mP.start();

        Thread zamanlayici = new Thread(){
            public void run() {
                try {
                    sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    Intent i = new Intent(GirisEkrani.this, MainActivity.class);
                    startActivity(i);


                }
            }
        };
        zamanlayici.start();
    }

    protected void onStop() {
        mP.release();
        finish();
        super.onStop();
    }

}
