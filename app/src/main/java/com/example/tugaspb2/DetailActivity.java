package com.example.tugaspb2;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        // Retrieve data passed from previous activity
        String name = getIntent().getStringExtra("name");
        String nim = getIntent().getStringExtra("nim");
        int imageResourceId = getIntent().getIntExtra("image", 0); // Retrieve image resource ID

        // Display data in TextViews and ImageView
        TextView textViewName = findViewById(R.id.textViewName);
        TextView textViewNim = findViewById(R.id.textViewNim);
        ImageView imageView = findViewById(R.id.imageView);

        textViewName.setText(name);
        textViewNim.setText(nim);
        imageView.setImageResource(imageResourceId); // Set image resource
    }
}
