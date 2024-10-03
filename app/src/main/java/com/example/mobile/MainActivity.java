package com.example.mobile;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import Adapter.Cars;
import Model.Product;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    Cars Cars;
    List<Product> productList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Initialize the product list
        productList = new ArrayList<>();
        productList.add(new Product("Mazda RX-7", "second hand", 250000, "https://www.unlockmen.com/wp-content/uploads/2016/01/mazda-rx7-fd3s-.jpg"));
        productList.add(new Product("Nissan Skyline R34", "second hand", 500000, "https://inwfile.com/s-gf/y6hzjh.jpg"));
        productList.add(new Product("Nissan GRT R35", "first hand", 1000000, "https://www-asia.nissan-cdn.net/content/dam/Nissan/th/news/2017-gtr/6_52A2826.jpg.ximg.l_12_m.smart.jpg"));
        productList.add(new Product("Toyota GR Supra", "first hand", 750000, "https://cf.autodeft2.pw/uploads/images/Toyota-GR-Supra-Matte-White-Edition-1.jpg"));

        Cars = new Cars(this, productList);
        recyclerView.setAdapter(Cars);
    }
}
