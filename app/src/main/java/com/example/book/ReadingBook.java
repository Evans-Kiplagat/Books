package com.example.book;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

public class ReadingBook extends AppCompatActivity {
    private RecyclerView readingrecycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reading_book);
        readingrecycler =findViewById(R.id.readingRecycler);

        Adapter adapter = new Adapter(this);
        readingrecycler.setAdapter(adapter);
        readingrecycler.setLayoutManager(new LinearLayoutManager(this));

        adapter.setBooks(utils.getInstance().getReadings());
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(this,MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK|Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
}
