package com.enjoy.ceiling;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Star> starList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        RecyclerView recyclerView = findViewById(R.id.rv_list);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        // 自定义分割线
        recyclerView.addItemDecoration(new StarDecoration(this));
        recyclerView.setAdapter(new StarAdapter(this, starList));
    }

    private void init() {
        starList = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 12; j++) {
                if (i % 2 == 0) {
                    starList.add(new Star("中原" + j, "中原找房" + i));
                } else {
                    starList.add(new Star("贝壳" + j, "贝壳找房" + i));
                }
            }
        }
    }
}