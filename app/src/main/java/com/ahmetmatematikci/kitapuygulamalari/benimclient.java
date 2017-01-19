package com.ahmetmatematikci.kitapuygulamalari;

import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by a on 1/18/17.
 */
public class benimclient extends WebViewClient {

    @Override
    public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {

        view.loadUrl(String.valueOf(request));


        return super.shouldOverrideUrlLoading(view, request);
    }
}
