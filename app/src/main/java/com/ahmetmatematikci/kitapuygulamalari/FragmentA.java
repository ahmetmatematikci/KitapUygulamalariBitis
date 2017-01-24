package com.ahmetmatematikci.kitapuygulamalari;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by a on 1/24/17.
 */

public class FragmentA extends Fragment {


    @Override
    public void onAttach(Context context) {
        Log.i("FragmentA", "Fragment onAttach Çağırıldı");
        super.onAttach(context);
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        Log.i("FragmentA", "Fragment onAttach Çağırıldı");
        super.onCreate(savedInstanceState);
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.i("FragmentA", "Fragment onCreateView Çağırıldı");
        View view = inflater.inflate(R.layout.fragmenta, container, false);
        return view;
    }


    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        Log.i("FragmentA", "Fragment onActivityCreated Çağırıldı");
        super.onActivityCreated(savedInstanceState);
    }


    @Override
    public void onStart() {
        Log.i("FragmentA", "Fragment onStart Çağırıldı");
        super.onStart();
    }


    @Override
    public void onResume() {
        Log.i("FragmentA", "Fragment onResume Çağırıldı");
        super.onResume();
    }

    @Override
    public void onPause() {
        Log.i("FragmentA", "Fragment onPause Çağırıldı");
        super.onPause();
    }


    @Override
    public void onStop() {
        Log.i("FragmentA", "Fragment onStop Çağırıldı");
        super.onStop();
    }

    @Override
    public void onDestroyView() {
        Log.i("FragmentA", "Fragment onDestroyView Çağırıldı");
        super.onDestroyView();
    }

    @Override
    public void onDestroy() {
        Log.i("FragmentA", "Fragment onDestroy Çağırıldı");
        super.onDestroy();
    }

    @Override
    public void onDetach() {
        Log.i("FragmentA", "Fragment onDetach Çağırıldı");
        super.onDetach();
    }

}
