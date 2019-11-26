package com.example.mobil;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class MobilDetailActivity extends AppCompatActivity
{
    public static String EXTRA_NAME = "mobil_name";
    public static String EXTRA_PABRIKAN = "mobil_pabrikan";
    public static String EXTRA_DESC = "mobil_desc";
    public static String EXTRA_IMG = "mobil_photo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mobil_detail);

        ImageView mobilImg = findViewById(R.id.iv_mobil);
        TextView mobilName = findViewById(R.id.tv_mobil_name);
        TextView mobilPabrikan = findViewById(R.id.tv_mobil_pabrikan);
        TextView mobilDesc = findViewById(R.id.tv_mobil_desc);

        Glide.with(this).load(getIntent().getStringExtra(EXTRA_IMG)).into(mobilImg);
        mobilName.setText(getIntent().getStringExtra(EXTRA_NAME));
        mobilDesc.setText(getIntent().getStringExtra(EXTRA_DESC));
        mobilPabrikan.setText(getIntent().getStringExtra(EXTRA_PABRIKAN));

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setTitle("Detail " + getIntent().getStringExtra(EXTRA_NAME));
        }
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return super.onSupportNavigateUp();
    }
}
