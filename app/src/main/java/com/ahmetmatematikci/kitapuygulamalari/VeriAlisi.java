package com.ahmetmatematikci.kitapuygulamalari;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by a on 1/18/17.
 */

public class VeriAlisi extends Activity {
    TextView tv5,tv7;
    ImageView iv;
    protected  void onCreate(Bundle s) {
        super.onCreate(s);
        setContentView(R.layout.verialisi);
        tanimlar();

        Intent i = getIntent();
        String isim = i.getStringExtra("ad");
        String yas = i.getStringExtra("yas");
        tv5.setText(isim);
        tv7.setText(yas);
        if (yas.charAt(0) == '2') {
            Bitmap bmp = BitmapFactory.decodeResource(getResources(), R.mipmap.first);
            iv.setImageBitmap(bmp);


        } else {
            Bitmap bmp = BitmapFactory.decodeResource(getResources(), R.mipmap.delete);
            iv.setImageBitmap(bmp);

        }




    }

    private void tanimlar() {


        tv5 = (TextView)findViewById(R.id.textView5);
        tv7 = (TextView)findViewById(R.id.textView7);
        iv = (ImageView)findViewById(R.id.imageView3);
    }
}
