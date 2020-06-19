package com.example.book;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
     private Button allbooks;
    private Button favorite;
    private Button wishlist;
    private Button allready;
    private Button readingbooks;
    private Button about;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Booksintial();
        allbooks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Allbooks.class);
                startActivity(intent);
            }
        });

        allready.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,allreadyreadBook.class);
                startActivity(intent);


            }
        });
        wishlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent intent = new Intent(MainActivity.this,wishBooks.class);
               startActivity(intent);
            }

        });

        favorite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,FavBooks.class);
                startActivity(intent);
            }
        });

         readingbooks.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
               Intent intent = new Intent(MainActivity.this,ReadingBook.class);
               startActivity(intent);


             }
         });

        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder builder =new AlertDialog.Builder(MainActivity.this);
                builder.setTitle(getString(R.string.app_name));
                builder.setMessage("wannna know more about this app ...... Developed by Evan.... pres or to check out the ideas");

                builder.setNegativeButton("DISMIS", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });

                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(MainActivity.this,About.class);
                        startActivity(intent);
                    }
                });

                builder.create().show();


            }
        });

     utils.getInstance();

    }
   private void Booksintial(){
        allbooks= findViewById(R.id.allbooks);
       favorite= findViewById(R.id.favourite);
       wishlist= findViewById(R.id.wish);
       allready= findViewById(R.id.already);
       readingbooks= findViewById(R.id.currently);
       about= findViewById(R.id.about);

    }
}
