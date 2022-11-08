package com.example.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button b_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b_view = findViewById(R.id.btn_view);

        b_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openViewM();
            }
        });


    }

    public void openViewM(){
        Intent i = new Intent(this, ViewList.class);
        startActivity(i);
    }

}