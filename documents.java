package com.example.redhotmaids;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class documents extends AppCompatActivity {
    private WebView myDocView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_documents);
        myDocView=(WebView) findViewById(R.id.docView);
        WebSettings webSettings = myDocView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        myDocView.loadUrl("https://redhotcleaning.co.za/documents/");
        myDocView.setWebViewClient(new WebViewClient());
    }
    public void onBackPressed(){
        if (myDocView.canGoBack()){
            myDocView.goBack();
        }else{
            super.onBackPressed();
        }
    }

}
