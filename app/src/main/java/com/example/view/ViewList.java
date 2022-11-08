package com.example.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ViewList extends AppCompatActivity {
    Button b_listView, b_gridView, recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_list);

        b_listView = findViewById(R.id.btn_listview);
        b_gridView = findViewById(R.id.btn_gridview);
        recyclerView = findViewById(R.id.btn_recyclerview);



        b_listView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openList();
            }
        });


        b_gridView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });



        recyclerView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


    }

    public void openList(){
        Intent i = new Intent(this,ListOfListView.class);
        startActivity(i);
    }

}