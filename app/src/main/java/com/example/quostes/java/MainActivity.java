package com.example.quostes.java;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.quostes.Adepters.Adapter;
import com.example.quostes.R;


public class MainActivity extends AppCompatActivity {

    public RecyclerView recycl_view;
//main array
   String[] type ={"ALONE","ANGRY","ANIVERSARY","ATTITUDE","AWESOME","BEAUTIFUL",
           "HAPPY","BIRTHDAY","CREATIVE","EMOTIONAL","FRIENDS","LOVE"};

    String[] name = {"Love", "Friendship", " Birthday ", "Attitude", "Alone", "Failure", " God ", "Power", "Experience", "Leadership", " Science ", "Sports",};


   int[] img ={R.drawable.alone,R.drawable.angry,R.drawable.aniversary,R.drawable.attitude,R.drawable.awesome,R.drawable.beautiful
   ,R.drawable.happy,R.drawable.birthday,R.drawable.creative,R.drawable.emotional,R.drawable.friend,R.drawable.love};
    private ImageView back;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        binding();




        Adapter adapter = new Adapter(MainActivity.this,type,img);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recycl_view.setLayoutManager(layoutManager);
        recycl_view.setAdapter(adapter);


    }

    private void binding() {

        recycl_view = findViewById(R.id.recycl_view);
    }
}