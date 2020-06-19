package com.example.book;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

public class allreadyreadBook extends AppCompatActivity {
    private RecyclerView alreadyrecycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_allreadyread_book);
        alreadyrecycler = findViewById(R.id.alreadyreadrecycler);

        Adapter radapter =new Adapter(this );
        alreadyrecycler.setAdapter(radapter);
        alreadyrecycler.setLayoutManager(new LinearLayoutManager(this));
        radapter.setBooks(utils.getInstance().getAlreadyreads());

    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(this,MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK|Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
}
