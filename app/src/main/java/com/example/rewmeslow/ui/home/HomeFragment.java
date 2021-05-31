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
    TextView agehome, namehome;
    ImageView pichome;

    //private static final String TAG = "Info";
    final String url = "http://worldtimeapi.org/api/timezone/Europe/Moscow";
    private FragmentHomeBinding binding;
    OkHttpClient client;
    int hash = 1;
    public int aye;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel = new ViewModelProvider(this).get(HomeViewModel.class);
        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        client = new OkHttpClient();

        OkHttpClient client = new OkHttpClient();
        pichome = root.findViewById(R.id.pichome);
        agehome = root.findViewById(R.id.agehome);
        namehome = root.findViewById(R.id.namehome);
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
                if (response.isSuccessful()){
                    GsonBuilder builder = new GsonBuilder();
                    Gson gson = builder.create();
                    assert response.body() != null;
                    String myResponce = response.body().string();
                    Day fuck = gson.fromJson(myResponce, Day.class);
                    int eah = fuck.day_of_year;
                    hash = eah/10;
                    aye = hash;
                }
            }
        });

        ;
        agehome.setText(String.valueOf(bildList.get(aye).year));
        namehome.setText(String.valueOf(bildList.get(aye).name));
        //new DownloadImageTask2(pichome).execute(String.valueOf(bildList.get(aye).link));







        homeViewModel.getText().observe(getViewLifecycleOwner(), s -> { });
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }



    public void rendering(ArrayList<Bild> bild, int hash){

    }

}







































class Day {
    String abbreviation;
    String ip;
    String datetime;
    int day_of_week;
    int day_of_year;
    boolean dst;
    Object dst_from;
    int dst_offset;
    Object dst_until;
    int raw_offset;
    String timezone;
    double unixtime;
    String utc_datetime;
    String utc_offset;
    int week_number;

}

