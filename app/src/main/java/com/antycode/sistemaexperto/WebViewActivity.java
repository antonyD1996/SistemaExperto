package com.antycode.sistemaexperto;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebView;

public class WebViewActivity extends AppCompatActivity {

    WebView myWebView;
    String url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        url = Utilidades.getReporteUrl();

        myWebView = findViewById(R.id.idWebView);
        myWebView.getSettings().setJavaScriptEnabled(true);
        myWebView.loadUrl(Utilidades.getReporteUrl());
    }
}
