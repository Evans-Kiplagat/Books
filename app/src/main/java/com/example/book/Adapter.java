package com.example.book;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.Arrays;

import static com.example.book.BookActiviy.BOOK_ID_KEY;

public class Adapter extends RecyclerView.Adapter<Adapter.Viewholder> {
        private ArrayList<Bookmodel> books = new ArrayList<>();
       private Context mcontext;

    public Adapter(Context mcontext) {
        this.mcontext = mcontext;
    }

    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.booklist,parent,false);
        return new Viewholder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, final int position) {
     holder.name.setText(books.get(position).getName());

        Glide.with(mcontext)
                .asBitmap()
                .load(books.get(position).getAuthr())
                .into(holder.image);

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mcontext,BookActiviy.class);
                intent.putExtra(BOOK_ID_KEY,books.get(position).getBookid());
                mcontext.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return books.size();

     /*   31548274*/
    }

    public void setBooks(ArrayList<Bookmodel> books) {
        this.books = books;
        notifyDataSetChanged();
    }

    public class Viewholder extends RecyclerView.ViewHolder {
        private TextView name;
        private ImageView image;
        private CardView cardView;

        public Viewholder(@NonNull View itemView) {
            super(itemView);
            name=itemView.findViewById(R.id.name);
          cardView=itemView.findViewById(R.id.parent);
            image=itemView.findViewById(R.id.image);

        }
    }
}
