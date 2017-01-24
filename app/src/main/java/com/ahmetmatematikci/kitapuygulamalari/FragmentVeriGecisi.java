package com.ahmetmatematikci.kitapuygulamalari;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Bundle;

/**
 * Created by a on 1/24/17.
 */

public class FragmentVeriGecisi extends Activity implements Tasiyici{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragmentverigecisi);

    }

    @Override
    public void ilet(String isim) {
        FragmentManager manager = getFragmentManager();
        FragmentY fragmentY = (FragmentY)manager.findFragmentById(R.id.fragment2);
        fragmentY.yaziyiilet(isim);
    }
}
