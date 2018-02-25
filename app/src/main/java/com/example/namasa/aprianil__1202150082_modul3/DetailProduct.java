package com.example.namasa.aprianil__1202150082_modul3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class DetailProduct extends AppCompatActivity {
    ImageView gambar, battery;
    TextView nama, detail, ukuran;
    int hitungl = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        setTitle("Detail Air Mineral");

        //mencari gambar
        gambar = findViewById(R.id.detailGambar);
        nama = findViewById(R.id.detailNama);
        detail = findViewById(R.id.detailDesc);
        ukuran = findViewById(R.id.liter);
        battery = findViewById(R.id.battery);


        //set gambar
        gambar.setImageDrawable(this.getResources().getDrawable(Integer.valueOf(getIntent().getStringExtra("gambar"))));
        nama.setText(getIntent().getStringExtra("nama"));
        detail.setText(getIntent().getStringExtra("detail"));
        battery.setImageLevel(0);
    }

    //method untuk minus button
    public void minus(View view) {
        if (battery.getDrawable().getLevel() - 1 >= 0) {
            hitungl=hitungl-2;
            ukuran.setText(hitungl + "L");
            battery.setImageLevel(battery.getDrawable().getLevel() - 1);
        } else {
            battery.setImageLevel(0);
            Toast.makeText(this, "Almost empty!", Toast.LENGTH_LONG).show();
        }
    }

    //method untuk plus button
    public void plus(View view) {
        if (battery.getDrawable().getLevel() + 1 <=4) {
            hitungl=hitungl+2;
            ukuran.setText(hitungl + "L");
            battery.setImageLevel(battery.getDrawable().getLevel() + 1);
        } else {
            battery.setImageLevel(4);
            Toast.makeText(this, "Full!", Toast.LENGTH_LONG).show();
        }
    }
}
