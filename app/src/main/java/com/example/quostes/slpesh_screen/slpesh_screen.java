package com.example.quostes.slpesh_screen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.quostes.R;
import com.example.quostes.java.MainActivity;

public class slpesh_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slpesh_screen);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run()
            {
                Intent intent = new Intent(slpesh_screen.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        },3000);
    }
}