package com.example.rewmeslow.ui.gallery;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.rewmeslow.DBHelper;
import com.example.rewmeslow.R;
import com.example.rewmeslow.databinding.FragmentGalleryBinding;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Objects;

public class GalleryFragment extends Fragment {

    private GalleryViewModel galleryViewModel;
    private FragmentGalleryBinding binding;
    SQLiteDatabase db;
    int i = 0;
    DBHelper dbHelper;
    RecyclerView rv;
    ArrayList<Bild> bildList = new ArrayList<>();

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        readData();

        galleryViewModel =
                new ViewModelProvider(this).get(GalleryViewModel.class);
        dbHelper = new DBHelper(requireActivity().getApplicationContext(), "TestDB", null, 1);// хуйня, мне не нравится
        db = dbHelper.getReadableDatabase();
        
        binding = FragmentGalleryBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        rv = root.findViewById(R.id.rwlay);
        final TextView textView = binding.textGallery;
        RecyclerHelper rh = new RecyclerHelper(bildList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(requireActivity().getApplicationContext());
        rv.setLayoutManager(layoutManager);
        rv.setAdapter(rh);
        galleryViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }

    @Override
    public void onDestroyView() {

        super.onDestroyView();
        binding = null;
    }

    public void readData() {
        dbHelper = new DBHelper(requireActivity().getApplicationContext(), "TestDB", null, 1);// хуйня, мне не нравится
        db = dbHelper.getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM bilde", null);
        while (c.moveToNext()) {
            bildList.add(new Bild(c.getString(1), Integer.parseInt(c.getString(2)), c.getString(3) , c.getString(4)));


        }

    }
}