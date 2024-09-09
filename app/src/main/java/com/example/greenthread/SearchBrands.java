package com.example.greenthread;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;


import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SearchBrands extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Item> itemList;
    private ItemAdapter itemAdapter;
    private SearchView searchView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_search_brands);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        searchView = findViewById(R.id.search_bar);
        searchView.clearFocus();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                filterList(newText);
                return true;
            }
        });

        ImageButton btn_back = findViewById(R.id.btn_back);

        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SearchBrands.this, MainActivity.class);
                startActivity(intent);
            }});

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        itemList = new ArrayList<>();

        itemList.add(new Item("Armani Exchange"));
        itemList.add(new Item("Adidas"));
        itemList.add(new Item("Balenciaga"));
        itemList.add(new Item("BOSS"));
        itemList.add(new Item("Calvin Klein"));
        itemList.add(new Item("Canada Goose"));
        itemList.add(new Item("Dior"));
        itemList.add(new Item("Fendi"));
        itemList.add(new Item("GAP"));
        itemList.add(new Item("Hanes"));
        itemList.add(new Item("Jack & Jones"));
        itemList.add(new Item("Lululemon"));
        itemList.add(new Item("ocean + main"));
        itemList.add(new Item("Prada"));
        itemList.add(new Item("The North Face"));
        itemList.add(new Item("Yves Saint Laurent"));



        itemAdapter = new ItemAdapter(itemList);
        recyclerView.setAdapter(itemAdapter);
    }

    private void filterList(String text) {
        List<Item> filteredList = new ArrayList<>();
    for (Item item: itemList) {
        if (item.getBrandName().toLowerCase().contains(text.toLowerCase())) {
            filteredList.add(item);
        }
    }

    if (filteredList.isEmpty()) {
        Toast.makeText(this, "No data found", Toast.LENGTH_SHORT).show();
    }
        itemAdapter.setFilteredList(filteredList);
    }
}



