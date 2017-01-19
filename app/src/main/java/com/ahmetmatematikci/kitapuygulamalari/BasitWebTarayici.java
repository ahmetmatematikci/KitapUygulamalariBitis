package com.ahmetmatematikci.kitapuygulamalari;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by a on 1/18/17.
 */

public class BasitWebTarayici extends Activity implements View.OnClickListener{

    Button bt1, bt2,bt3,bt4, bt5;
    EditText et;
    WebView wv;

    protected  void onCreate(Bundle s) {
        super.onCreate(s);
        setContentView(R.layout.basitwebtarayici);

        tanimlar();

    }

    private void tanimlar() {



        bt1 =(Button)findViewById(R.id.button6);
        bt2 =(Button)findViewById(R.id.button7);
        bt3 =(Button)findViewById(R.id.button8);
        bt4 =(Button)findViewById(R.id.button9);
        bt5 =(Button)findViewById(R.id.button10);

        et = (EditText)findViewById(R.id.editText5);
        wv = (WebView)findViewById(R.id.wv);
        wv.setWebViewClient(new benimclient());
        wv.getSettings().setJavaScriptEnabled(true);
        wv.getSettings().setLoadWithOverviewMode(true);
        wv.getSettings().setUseWideViewPort(true);





        bt1.setOnClickListener(this);
        bt2.setOnClickListener(this);
        bt3.setOnClickListener(this);
        bt4.setOnClickListener(this);
        bt5.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {

            case R.id.button6:

                String site = et.getText().toString();
                wv.loadUrl(site);


                break;

            case R.id.button7:
                if (wv.canGoBack()){
                wv.goBack();}

                break;

            case R.id.button8:
                if (wv.canGoForward()){
                    wv.goForward();}

                break;

            case R.id.button9:
                wv.reload();

                break;

            case R.id.button10:
                wv.clearHistory();

                break;
        }

    }
}
