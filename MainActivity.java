package com.example.redhotmaids;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private CardView bookCard,contactCard,DocumentsCard,galleryCard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Defining Cards
        bookCard= (CardView) findViewById(R.id.bookings);
        contactCard= (CardView) findViewById(R.id.contacts);
        DocumentsCard= (CardView) findViewById(R.id.documents);
        galleryCard= (CardView) findViewById(R.id.gallery);
        //Adding a listener to the Cards
        bookCard.setOnClickListener(this);
        contactCard.setOnClickListener(this);
        DocumentsCard.setOnClickListener(this);
        galleryCard.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;
         switch (v.getId()){
             case R.id.bookings: i = new Intent(this,bookings.class);startActivity(i);break;
             case R.id.contacts: i = new Intent(this,contacts.class);startActivity(i);break;
             case R.id.documents: i = new Intent(this,documents.class);startActivity(i);break;
             case R.id.gallery: i = new Intent(this,gallery.class);startActivity(i);break;
         }
    }
}

