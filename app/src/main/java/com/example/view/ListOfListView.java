package com.example.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ListOfListView extends AppCompatActivity {
    Button b_ml,b_trm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_of_list_view);

        b_ml=findViewById(R.id.btn_ML);
        b_trm= findViewById(R.id.btn_TRM);



        b_ml.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openML();
            }
        });
    }


    public void openML(){
        Intent i = new Intent(this,ListViewML.class);
        startActivity(i);
    }
}