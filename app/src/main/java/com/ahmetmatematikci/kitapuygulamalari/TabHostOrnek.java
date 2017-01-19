package com.ahmetmatematikci.kitapuygulamalari;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.widget.TabHost;

import static com.ahmetmatematikci.kitapuygulamalari.R.mipmap.ic_launcher;

/**
 * Created by a on 1/19/17.
 */

public class TabHostOrnek  extends Activity{
    TabHost thost;
    TabHost.TabSpec ts1, ts2, ts3,ts4;


    protected  void onCreate(Bundle s) {
        super.onCreate(s);
        setContentView(R.layout.tabhostornek);
        thost = (TabHost)findViewById(R.id.thost);
                thost.setup();





        ts1 =thost.newTabSpec("Etiket1");
        Drawable d = ContextCompat.getDrawable(this, ic_launcher );
        ts1.setIndicator("", d);
        ts1.setContent(R.id.tab1);
        thost.addTab(ts1);

        ts2 =thost.newTabSpec("Etiket2");
        Drawable d2 = ContextCompat.getDrawable(this, R.mipmap.first );
        ts2.setIndicator("", d2);
        ts2.setContent(R.id.tab2);
        thost.addTab(ts2);


        ts3 =thost.newTabSpec("Etiket3");
        Drawable d3 = ContextCompat.getDrawable(this, R.mipmap.reload );
        ts3.setIndicator("", d3);
        ts3.setContent(R.id.tab3);
        thost.addTab(ts3);


        ts4 =thost.newTabSpec("Etiket4");
        ts4.setIndicator("Resim Yok");
        ts4.setContent(R.id.tab4);
        thost.addTab(ts4);



    }
}
