package com.ahmetmatematikci.kitapuygulamalari;

import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.preference.PreferenceFragment;

/**
 * Created by a on 1/19/17.
 */
public class Ayarlar extends PreferenceActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AyarlarFragment aF = new AyarlarFragment();
        getFragmentManager().beginTransaction().replace(android.R.id.content, aF).commit();


    }

    public static class AyarlarFragment extends PreferenceFragment {

        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            addPreferencesFromResource(R.xml.ayarlar);

        }
    }
}
