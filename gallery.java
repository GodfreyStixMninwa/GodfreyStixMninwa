package com.example.redhotmaids;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class gallery extends AppCompatActivity {
    private WebView myGalleryView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);
        myGalleryView=(WebView) findViewById(R.id.galleryView);
        WebSettings webSettings = myGalleryView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        myGalleryView.loadUrl("https://redhotcleaning.co.za/gallery/");
        myGalleryView.setWebViewClient(new WebViewClient());
    }
    public void onBackPressed(){
        if (myGalleryView.canGoBack()){
            myGalleryView.goBack();
        }else{
            super.onBackPressed();
        }
    }
}
