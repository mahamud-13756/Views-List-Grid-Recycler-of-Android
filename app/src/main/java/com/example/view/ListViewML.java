package com.example.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class ListViewML extends AppCompatActivity {
    ListView listView;

    String[] MovieName={"Spider Man","Bat Man","Super Man","X-Men","Captain America","Iron Man"};
    int[] Images={R.drawable.spiderman,R.drawable.batman,R.drawable.superman,R.drawable.xmen,R.drawable.captain,R.drawable.ironman,};
    String[] Rating = {"7.4","8.2","8.5","7.6","8.8","8.6"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_ml);

        listView= findViewById(R.id.listMovie);

        Adapter adapter = new Adapter(this,MovieName,Images,Rating);
        listView.setAdapter(adapter);

    }
}