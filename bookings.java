package com.example.redhotmaids;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class bookings extends AppCompatActivity {
    private WebView myBookView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bookings);
        myBookView=(WebView) findViewById(R.id.bookView);
        WebSettings webSettings = myBookView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        myBookView.loadUrl("https://redhotcleaning.co.za/get-quote/");
        myBookView.setWebViewClient(new WebViewClient());
    }
    public void onBackPressed(){
        if (myBookView.canGoBack()){
            myBookView.goBack();
        }else{
            super.onBackPressed();
        }
    }
}
