package com.ahmetmatematikci.kitapuygulamalari;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by a on 1/23/17.
 */

public class ActivityFragment extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i("tago", "Activity onCreate çağırıldı");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activityfargment);
    }


    @Override
    public void onAttachFragment(Fragment fragment) {
        Log.i("Fragmentler", "Activity onAttachFragment çağırıldı");

        super.onAttachFragment(fragment);
    }

    @Override
    protected void onStart() {
        Log.i("Fragmentler", "Activity onStart çağırıldı");

        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.i("Fragmentler", "Activity onResume çağırıldı");

        super.onResume();
    }



    @Override
    protected void onPause() {
        Log.i("Fragmentler", "Activity onPause çağırıldı");

        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.i("Fragmentler", "Activity onStop çağırıldı");

        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.i("Fragmentler", "Activity onDestroy çağırıldı");

        super.onDestroy();
    }


}
