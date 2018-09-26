package com.csdi.ati.fhapp;

/*import android.webkit.WebResourceRequest;
*/import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by Rajat Pratap Singh on 29-Mar-18.
 */

public class MyWebViewClient extends WebViewClient {
    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String request) {
        return false;
    }
}
