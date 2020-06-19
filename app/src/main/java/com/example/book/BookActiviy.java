package com.example.book;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class BookActiviy extends AppCompatActivity {
    public static final String BOOK_ID_KEY = "bookid";
    private Button btnalready, btnfav, btnwish, btnreading;
    private TextView bookname, pages, author, longdesc;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_activiy);

        initView();

        Intent intent = getIntent();
         if (null != intent) {
         int bookid =intent.getIntExtra(BOOK_ID_KEY,0);
         if (bookid !=0){
             Bookmodel incomingbook =utils.getInstance().getBoolById(bookid);
             if(null != incomingbook){
                 setData(incomingbook);

                 handleAreadyread(incomingbook);
                 handleFavBook(incomingbook);
                 handleReadingBook(incomingbook);
                 handleWishingBook(incomingbook);
             }

  }
    }



}
    private void handleWishingBook(final Bookmodel bookmodel) {
            ArrayList<Bookmodel> wishingBooks = utils.getInstance().getWishlist();
            Boolean existInwish = false;
            for (Bookmodel b : wishingBooks) {
                if (b.getBookid() == bookmodel.getBookid()) ;{
                    existInwish = true;
                }
            }
            if(existInwish){
                btnwish.setEnabled(false );
            }
            else {
                btnwish.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(utils.getInstance().addwishbook(bookmodel)){
                            Toast.makeText(BookActiviy.this, "book added", Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(BookActiviy.this,wishBooks.class);
                            startActivity(intent);
                        }
                        else {
                            Toast.makeText(BookActiviy.this, "try again", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }

        }


        private void handleReadingBook( final Bookmodel bookmodel) {
            ArrayList<Bookmodel> readingBook = utils.getInstance().getReadings();
            Boolean existInreading = false;
            for (Bookmodel b : readingBook) {
                if (b.getBookid() == bookmodel.getBookid()) ;{
                    existInreading = true;
                }
            }
            if(existInreading){
                btnreading.setEnabled(false );
            }
            else {
                btnreading.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(utils.getInstance().addreads(bookmodel)){
                            Toast.makeText(BookActiviy.this, "book added", Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(BookActiviy.this,ReadingBook.class);
                            startActivity(intent);
                        }
                        else {
                            Toast.makeText(BookActiviy.this, "try again", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }

        }




        private void handleFavBook( final Bookmodel bookmodel) {
            ArrayList<Bookmodel> FavBook = utils.getInstance().getFavbook();
            Boolean existInfav = false;
            for (Bookmodel b : FavBook) {
                if (b.getBookid() == bookmodel.getBookid()) ;{
                    existInfav = true;
                }
            }
            if(existInfav){
                btnfav.setEnabled(false);
            }
            else {
                btnfav.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(utils.getInstance().addFavbook(bookmodel)){
                            Toast.makeText(BookActiviy.this, "book added fav", Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(BookActiviy.this,FavBooks.class);
                            startActivity(intent);
                        }
                        else {
                            Toast.makeText(BookActiviy.this, "try again", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }

        }

        private void handleAreadyread(final Bookmodel bookmodel) {
            ArrayList<Bookmodel> alreadyreadbook = utils.getInstance().getAlreadyreads();
            Boolean existInAllreadyread = false;
            for (Bookmodel b: alreadyreadbook) {
                if (b.getBookid() == bookmodel.getBookid()) ;{
                    existInAllreadyread = true;
                }
            }
            if(existInAllreadyread){
                btnalready.setEnabled(false);
            }
            else {
                btnalready.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(utils.getInstance().AddallreadyreadBook(bookmodel)){
                            Toast.makeText(BookActiviy.this, "book added to already", Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(BookActiviy.this,allreadyreadBook.class);
                            startActivity(intent);
                        }
                        else {
                            Toast.makeText(BookActiviy.this, "try again", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }

    }

    private void setData(Bookmodel bookmodel) {
        bookname.setText(bookmodel.getName());
        pages.setText(String.valueOf(bookmodel.getPages()));
        longdesc.setText(bookmodel.getDescribtion());
        Glide.with(this)
                .asBitmap()
                .load(bookmodel.getAuthr())
                .into(imageView);
    }


    private void initView() {
        btnalready = findViewById(R.id.alreadyread);
        btnfav = findViewById(R.id.favbook);
        btnreading = findViewById(R.id.currentlyread);
        btnwish = findViewById(R.id.wish);

        bookname = findViewById(R.id.boookname);
        pages = findViewById(R.id.number);
        author = findViewById(R.id.author);
        longdesc= findViewById(R.id.longD);


        imageView = findViewById(R.id.bookimage);

    }
}
