package com.ahmetmatematikci.kitapuygulamalari;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by a on 1/24/17.
 */

public class FragmentY extends Fragment{
    TextView tv;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragmenty, container,false);

        tv = (TextView)view.findViewById(R.id.textView25);


        return view;
    }

    public void yaziyiilet(String isim) {
        tv.setText("Hoş Geldin "+ isim);
    }
}


