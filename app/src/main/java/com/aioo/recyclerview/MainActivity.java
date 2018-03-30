package com.aioo.recyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvApps;
    private ArrayList<App> apps = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvApps = findViewById(R.id.rv_apps);
        rvApps.setLayoutManager(new LinearLayoutManager(this));

        //初始化数据
        for (int i = 0;i<50;i++){
            App app = new App();
            app.setIcon(getResources().getDrawable(R.mipmap.ic_launcher));
            app.setName(getString(R.string.app_name)+i);
            apps.add(app);
        }

        rvApps.setAdapter(new MyAdapter(apps));
    }
}
