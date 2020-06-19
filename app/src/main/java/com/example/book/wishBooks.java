package com.example.book;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

public class wishBooks extends AppCompatActivity {
   private RecyclerView wishRecyclerview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wish_books);
        wishRecyclerview= findViewById(R.id.wishbookrecycler);
        Adapter adapter = new Adapter(this);
        wishRecyclerview.setAdapter(adapter);
        wishRecyclerview.setLayoutManager(new LinearLayoutManager(this));

        adapter.setBooks(utils.getInstance().getWishlist());

    }
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(this,MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK|Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
}
