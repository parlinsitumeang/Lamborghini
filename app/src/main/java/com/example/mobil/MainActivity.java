package com.example.mobil;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.mobil.adapters.MobilListAdapter;
import com.example.mobil.dummy.MobilDummy;
import com.example.mobil.models.Mobil;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
{
    private RecyclerView rvMobil;
    private ArrayList<Mobil> listMobil = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvMobil = findViewById(R.id.rv_main);
        rvMobil.setHasFixedSize(true);
        listMobil.addAll(MobilDummy.getData());

        showRecyclerList();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.item, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.about_me:
                Intent intent = new Intent(MainActivity.this, AboutActivity.class);
                startActivity(intent);
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    private void showRecyclerList() {
        rvMobil.setLayoutManager(new LinearLayoutManager(this));
        MobilListAdapter MobilListAdapter = new MobilListAdapter(listMobil);
        rvMobil.setAdapter(MobilListAdapter);
        MobilListAdapter.setOnItemClickCallback(new MobilListAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Mobil data) {
                moveToDetail(data);
            }
        });

    }

    private void moveToDetail(Mobil data) {
        Intent intent = new Intent(MainActivity.this, MobilDetailActivity.class);
        intent.putExtra(MobilDetailActivity.EXTRA_NAME, data.getName());
        intent.putExtra(MobilDetailActivity.EXTRA_PABRIKAN, data.getOrigin());
        intent.putExtra(MobilDetailActivity.EXTRA_DESC, data.getDescription());
        intent.putExtra(MobilDetailActivity.EXTRA_IMG, data.getPhoto());
        startActivity(intent);
    }
}
