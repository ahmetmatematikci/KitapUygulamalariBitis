package com.ahmetmatematikci.kitapuygulamalari;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;

/**
 * Created by a on 1/24/17.
 */

public class FragmentB extends Fragment {
    String isim;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        isim = getArguments().getString("isim");

        View view = inflater.inflate(R.layout.fragmentb, container, false);
        return view;
    }


    @Override
    public void onActivityCreated(Bundle savedInstanceState) {

        super.onActivityCreated(savedInstanceState);
        TextView tv = (TextView) getActivity().findViewById(R.id.textView23);
        tv.setText(isim);
        ViewFlipper flipper = (ViewFlipper)getActivity().findViewById(R.id.fliper);
        ImageView image1 = (ImageView)getActivity().findViewById(R.id.imageView4);
        ImageView image2 = (ImageView)getActivity().findViewById(R.id.imageView5);
        ImageView image3 = (ImageView)getActivity().findViewById(R.id.imageView6);

        if(isim.equals("At")) {

            image1.setImageResource(R.mipmap.a);
            image2.setImageResource(R.mipmap.b);
            image3.setImageResource(R.mipmap.c);


        } else if (isim.equals("Kaplan")) {
            image1.setImageResource(R.mipmap.d);
            image2.setImageResource(R.mipmap.e);
            image3.setImageResource(R.mipmap.f);

        } else if (isim.equals("Fil")) {

            image1.setImageResource(R.mipmap.g);
            image2.setImageResource(R.mipmap.h);
            image3.setImageResource(R.mipmap.l);

        }else if (isim.equals("Kedi")) {
            image1.setImageResource(R.mipmap.m);
            image2.setImageResource(R.mipmap.n);
            image3.setImageResource(R.mipmap.r);


        }
        flipper.setFlipInterval(1000);
             flipper.startFlipping();

    }


}
