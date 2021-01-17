package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.text.Layout;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.toastlibrary.Toaster;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.btn);
        Button btn2 = findViewById(R.id.btn2);
        Button btn3 = findViewById(R.id.btn3);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toaster.InfoToast(MainActivity.this, "Info Toast!");
                Toast toast = Toast.makeText(MainActivity.this, "Helloooooo`", Toast.LENGTH_LONG);
                View view = toast.getView();
                int bg_color = Color.parseColor("#1FAA59");
                view.getBackground().setColorFilter(bg_color, PorterDuff.Mode.SRC_IN);
                TextView text = view.findViewById(android.R.id.message);

                text.setTextColor(Color.WHITE);
                text.setGravity(Gravity.FILL);
                toast.setGravity(Gravity.BOTTOM | Gravity.FILL_HORIZONTAL, 0,0);
                toast.show();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toaster.errorToast(MainActivity.this, "Error Toast!");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toaster.successToast(MainActivity.this, "Success Toast!");
            }
        });
    }
}