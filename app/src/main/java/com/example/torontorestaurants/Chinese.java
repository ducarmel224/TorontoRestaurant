package com.example.torontorestaurants;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Chinese extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTitle(getResources().getText(R.string.cat3));
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chinese);
    }
    public void Loc1_reg(View view) {
        Intent intent1 = new Intent(this, com.example.torontorestaurants.MotherDumplingsRegular.class);
        startActivity(intent1);
    }

    public void Loc1_sat(View view) {
        Intent intent2 = new Intent(this, com.example.torontorestaurants.MotherDumplingsSat.class);
        startActivity(intent2);
    }
    public void Loc2_reg(View view) {
        Intent intent3 = new Intent(this, com.example.torontorestaurants.DumplingHouseRegular.class);
        startActivity(intent3);
    }

    public void Loc2_sat(View view) {
        Intent intent4 = new Intent(this, com.example.torontorestaurants.DumplingHouseSat.class);
        startActivity(intent4);
    }
    public void Loc3_reg(View view) {
        Intent intent5 = new Intent(this, LaiWahRegular.class);
        startActivity(intent5);
    }

    public void Loc3_sat(View view) {
        Intent intent6 = new Intent(this, com.example.torontorestaurants.LaiWahSat.class);
        startActivity(intent6);
    }
}