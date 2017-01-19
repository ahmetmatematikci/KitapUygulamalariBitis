package com.ahmetmatematikci.kitapuygulamalari;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ViewFlipper;
import android.widget.ViewSwitcher;

/**
 * Created by a on 1/19/17.
 */

public class ViewDegistir extends Activity  implements View.OnClickListener{
    ViewSwitcher   vS;
    ViewFlipper   vF;
    protected  void onCreate(Bundle s) {
        super.onCreate(s);
        setContentView(R.layout.veridegistir);

        vS = (ViewSwitcher)findViewById(R.id.vS);
        vF = (ViewFlipper)findViewById(R.id.vF);

        vS.setOnClickListener(this);
        vF.setOnClickListener(this);
        vF.setFlipInterval(2000);
        vF.startFlipping();


    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {

            case R.id.vS:
                vS.showNext();

                break;

            case  R.id.vF:
                vF.showNext();

                break;
        }

    }
}
