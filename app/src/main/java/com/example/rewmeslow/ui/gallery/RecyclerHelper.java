package com.example.rewmeslow.ui.gallery;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.util.Log;
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


import com.example.rewmeslow.MainActivity;
import com.example.rewmeslow.R;
import com.squareup.picasso.Picasso;

import java.io.InputStream;
import java.util.ArrayList;

public class RecyclerHelper extends RecyclerView.Adapter<RecyclerHelper.MyAdapter> {

    public class MyAdapter extends RecyclerView.ViewHolder {
        TextView name,age;
        ImageView pic;
        Button btn;
        public MyAdapter(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name);
            age = itemView.findViewById(R.id.age);
            pic = itemView.findViewById(R.id.pic);
            btn = itemView.findViewById(R.id.btn);
            


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
        new DownloadImageTask(holder.pic).execute(String.valueOf(arr.get(position).link));

    }






    @Override
    public int getItemCount() {
        return arr.size();
    }


    private class DownloadImageTask extends AsyncTask<String, Void, Bitmap> {
        ImageView bmImage;

        public DownloadImageTask(ImageView bmImage) {
            this.bmImage = bmImage;
        }

        @SuppressLint("LongLogTag")
        protected Bitmap doInBackground(String... urls) {
            String urldisplay = urls[0];
            Bitmap mIcon11 = null;
            try {
                InputStream in = new java.net.URL(urldisplay).openStream();
                mIcon11 = BitmapFactory.decodeStream(in);
            } catch (Exception e) {
                Log.e("Ошибка передачи изображения", e.getMessage());
                e.printStackTrace();
            }
            return mIcon11;
        }

        protected void onPostExecute(Bitmap result) {
            bmImage.setImageBitmap(result);
        }

    }
}








