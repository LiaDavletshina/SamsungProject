package com.example.rewmeslow.ui.home;
import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import org.jetbrains.annotations.NotNull;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import com.example.rewmeslow.R;
import com.example.rewmeslow.databinding.FragmentHomeBinding;
import com.example.rewmeslow.ui.gallery.Bild;
import com.example.rewmeslow.ui.gallery.GalleryFragment;
import com.example.rewmeslow.ui.gallery.RecyclerHelper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import static com.example.rewmeslow.ui.gallery.GalleryFragment.bildList;

public class HomeFragment extends Fragment {
    TextView agehome, namehome,description;
    ImageView pichome;
    OkHttpClient client;
    String myResponse;
    public int DayCount;

    final String url = "http://worldtimeapi.org/api/timezone/Europe/Moscow";
    private FragmentHomeBinding binding;



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel = new ViewModelProvider(this).get(HomeViewModel.class);
        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        DayCount = 3;
        pichome = root.findViewById(R.id.pichome);
        agehome = root.findViewById(R.id.agehome);
        namehome = root.findViewById(R.id.namehome);
        description = root.findViewById(R.id.description);
        description.setText("Работу над картиной Герасимов начинает в 1934 году заказу, внесенному по предложению члена Реввоенсовета Ефима Щаденко. Сохранился ряд портретных этюдов, изображающих отдельных командиров армии. Создание такого большого количества этюдов было необычным для творческого метода художника, что он отдельно отметил в своих воспоминаниях.\n" +
                "\n" +
                "В 1937 году картина была показана в Париже на Всемирной выставке и получило высшую награду — Гран-При.\n" +
                "\n" );















        agehome.setText(String.valueOf(bildList.get(DayCount).year));
        namehome.setText(String.valueOf(bildList.get(DayCount).name) + "  "+  bildList.get(DayCount).author);
        new DownloadImageTask2(pichome).execute(String.valueOf(bildList.get(DayCount).link));








        homeViewModel.getText().observe(getViewLifecycleOwner(), s -> { });
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
    /*public int APIReq(String url){
    client = new OkHttpClient();
    OkHttpClient client = new OkHttpClient();
    Request request = new Request.Builder()
            .url(url)
            .build();

        client.newCall(request).enqueue(new Callback() {
        @Override
        public void onFailure(@NotNull Call call, @NotNull IOException e) {
            e.printStackTrace();
        }

        @Override
        public void onResponse(@NotNull Call call, @NotNull Response response) throws IOException {
            if (response.isSuccessful()) {
                int a = 1;
                assert response.body() != null;}}



    myResponse = response.body().string();
    GsonBuilder builder = new GsonBuilder();
    Gson gson = builder.create();
    Day day = gson.fromJson(myResponse, Day.class);
    DayCount = day.day_of_year % 10;
    return DayCount;

        }
    );

    }*/

}



































