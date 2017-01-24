package com.ahmetmatematikci.kitapuygulamalari;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by a on 1/24/17.
 */

public class FragmentX  extends Fragment{
    Button bt;
    EditText et;
    Tasiyici tasiyici;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragmentx, container, false);
        tasiyici = (Tasiyici)getActivity();
        bt = (Button)view.findViewById(R.id.button27);
        et = (EditText)view.findViewById(R.id.editText14);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String isim = et.getText().toString();
                tasiyici.ilet(isim);

            }
        });

        return view;
    }
}
