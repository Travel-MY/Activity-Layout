package com.esikmalazman.relativelayout;

import static com.esikmalazman.relativelayout.R.color.brand_turqoise;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    Button date;
    Button files;
    Button location;
    Button activity;
    ImageView bgImage;

    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        renderView();
    }

    // Method to configure view
    private void renderView() {
        date = findViewById(R.id.date);
        files = findViewById(R.id.files);
        location = findViewById(R.id.Location);
        activity = findViewById(R.id.activity);
        bgImage = findViewById(R.id.imageView);

        // Set image
        bgImage.setImageResource(R.drawable.iceland);
        // Retrieve current window
        View decorView = getWindow().getDecorView();
        // Hide navigation bottom
        int uiOptions = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION;
        decorView.setSystemUiVisibility(uiOptions);
        // Hide status bar
        decorView.setSystemUiVisibility(View.INVISIBLE);
    }
}