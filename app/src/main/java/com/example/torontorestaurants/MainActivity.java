package com.example.torontorestaurants;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

//4 categories:

// Italian: Goodfellas Wood Oven Pizza; Stelvio; Donatello Restaurant.
// Greek: Estiatorio VOLOS, Pantheon Restaurant; Mezes.
// Chinese: Mother's Dumplings; Dumpling House; Lai Wah Heen.
// French: ALO RESTAURANT; Scaramouche Restaurant; GEORGE Restaurant.

public class MainActivity extends AppCompatActivity {
    private EditText txtTaskId, txtTaskName, txtTaskDescription;
    private ListView lstTasks;
    ArrayAdapter<String> tasksAdapter;
    private com.example.torontorestaurants.onClickInterface onclickInterface;

    private RecyclerView recyclerView;
    private com.example.torontorestaurants.TypeItemAdapter itemAdapter;
    private RecyclerView.LayoutManager layoutManager;
    List<com.example.torontorestaurants.Type> types = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTitle(getResources().getText(R.string.title_activity_main));
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setInitialData();
        onclickInterface = new com.example.torontorestaurants.onClickInterface() {
            @Override
            public void setClick(int pos) {
              //  Toast.makeText(MainActivity.this,"Position is "+pos,Toast.LENGTH_LONG).show();
                switch (pos) {
                    case 0:
                        Intent intent1 = new Intent(MainActivity.this, com.example.torontorestaurants.Italian.class);
                        startActivity(intent1);
                        break;

                    case 1:
                        Intent intent2 = new Intent(MainActivity.this, com.example.torontorestaurants.Greek.class);
                        startActivity(intent2);
                        break;

                    case 2:
                        Intent intent3 = new Intent(MainActivity.this, com.example.torontorestaurants.Chinese.class);
                        startActivity(intent3);
                        break;

                    case 3:
                        Intent intent4 = new Intent(MainActivity.this, com.example.torontorestaurants.French.class);
                        startActivity(intent4);
                        break;
                }

            }
        };

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        com.example.torontorestaurants.TypeItemAdapter adapter = new com.example.torontorestaurants.TypeItemAdapter(this, types, onclickInterface);
        recyclerView.setAdapter(adapter);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

    }

    private void setInitialData(){
        types.add(new com.example.torontorestaurants.Type(getResources().getString(R.string.cat1)));
        types.add(new com.example.torontorestaurants.Type(getResources().getString(R.string.cat2)));
        types.add(new com.example.torontorestaurants.Type(getResources().getString(R.string.cat3)));
        types.add(new com.example.torontorestaurants.Type(getResources().getString(R.string.cat4)));
    }
}