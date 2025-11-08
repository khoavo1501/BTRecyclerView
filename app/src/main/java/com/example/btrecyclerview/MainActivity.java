package com.example.btrecyclerview;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements RecyclerViewClickListener_2224 {

    RecyclerView recyclerView_2224;
    ArrayList<Landmark_2224> landmarkList_2224;
    LandmarkAdapter_2224 adapter_2224;

    @Override
    protected void onCreate(Bundle savedInstanceState_2224) {
        super.onCreate(savedInstanceState_2224);
        setContentView(R.layout.activity_main);

        recyclerView_2224 = findViewById(R.id.recyclerView_2224);

        landmarkList_2224 = new ArrayList<>();

        prepareData_2224();

        adapter_2224 = new LandmarkAdapter_2224(landmarkList_2224, this, this);

        recyclerView_2224.setLayoutManager(new LinearLayoutManager(this));
        recyclerView_2224.setAdapter(adapter_2224);
    }

    private void prepareData_2224() {
        landmarkList_2224.add(new Landmark_2224("Tháp Eiffel", "Paris, Pháp", android.R.drawable.ic_menu_gallery));
        landmarkList_2224.add(new Landmark_2224("Tượng Nữ thần Tự do", "New York, Mỹ", android.R.drawable.ic_menu_camera));
        landmarkList_2224.add(new Landmark_2224("Nhà hát Opera Sydney", "Sydney, Úc", android.R.drawable.ic_menu_mapmode));
        landmarkList_2224.add(new Landmark_2224("Vạn Lý Trường Thành", "Trung Quốc", android.R.drawable.ic_menu_compass));
        landmarkList_2224.add(new Landmark_2224("Đấu trường Colosseum", "Rome, Ý", android.R.drawable.ic_menu_manage));
        landmarkList_2224.add(new Landmark_2224("Kim tự tháp Giza", "Cairo, Ai Cập", android.R.drawable.ic_menu_send));
    }

    @Override
    public void onItemClick_2224(int position_2224) {
        Landmark_2224 clickedItem_2224 = landmarkList_2224.get(position_2224);

        Toast.makeText(this, "Bạn đã chọn: " + clickedItem_2224.getName_2224(), Toast.LENGTH_SHORT).show();

    }
}