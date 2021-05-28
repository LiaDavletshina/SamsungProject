package com.example.rewmeslow.ui.gallery;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;


import com.example.rewmeslow.R;

import java.util.ArrayList;

public class RecyclerHelper extends RecyclerView.Adapter<RecyclerHelper.MyAdapter> {

    public class MyAdapter extends RecyclerView.ViewHolder {
        TextView name,age;
        ImageView pic;
        public MyAdapter(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name);
            age = itemView.findViewById(R.id.age);
            pic = itemView.findViewById(R.id.pic);
        }
    }

    ArrayList<Bild> arr;

    public RecyclerHelper(ArrayList<Bild> arr) {
        this.arr = arr;
    }

    @NonNull
    @Override
    public RecyclerHelper.MyAdapter onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.rwlayout, parent, false);
        MyAdapter myAdapter = new MyAdapter(v);
        return myAdapter;
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter holder, int position) {
        holder.name.setText(arr.get(position).name);
        holder.age.setText(String.valueOf(arr.get(position).year));
        //holder.pic.set(String.valueOf(arr.get(position).pic));
    }

    @Override
    public int getItemCount() {
        return arr.size();
    }
}