package com.example.torontorestaurants;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class French extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTitle(getResources().getText(R.string.cat4));
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_french);
    }
    public void Loc1_reg(View view) {
        Intent intent1 = new Intent(this, AloRegular.class);
        startActivity(intent1);
    }

    public void Loc1_sat(View view) {
        Intent intent2 = new Intent(this, com.example.torontorestaurants.AloSat.class);
        startActivity(intent2);
    }
    public void Loc2_reg(View view) {
        Intent intent3 = new Intent(this, com.example.torontorestaurants.ScaramoucheRegular.class);
        startActivity(intent3);
    }

    public void Loc2_sat(View view) {
        Intent intent4 = new Intent(this, ScaramoucheSat.class);
        startActivity(intent4);
    }
    public void Loc3_reg(View view) {
        Intent intent5 = new Intent(this, com.example.torontorestaurants.GeorgeRegular.class);
        startActivity(intent5);
    }

    public void Loc3_sat(View view) {
        Intent intent6 = new Intent(this, com.example.torontorestaurants.GeorgeSat.class);
        startActivity(intent6);
    }
}