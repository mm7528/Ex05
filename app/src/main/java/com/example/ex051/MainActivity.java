package com.example.ex051;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageButton btn;
    ImageView iv1;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.ib);
        iv1 =(ImageView) findViewById(R.id.iv);
    }

    public void clicking(View view) {
        int x = (int) (101 * Math.random()) % 3 + 1;


        if (x == 1) {
            btn.setImageResource(R.drawable.one);
            iv1.setImageResource(R.drawable.one);
        }
        if (x == 2) {
            btn.setImageResource(R.drawable.two);
            iv1.setImageResource(R.drawable.two);
        }
        if (x == 3) {
            btn.setImageResource(R.drawable.three);
            iv1.setImageResource(R.drawable.three);
        }
    }
}
