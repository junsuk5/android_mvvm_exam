package com.example.myapplication;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    private FloatingActionButton mFloatingActionButton;
    private TextView mCountTextView;

    private int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mFloatingActionButton = findViewById(R.id.fab);
        mCountTextView = findViewById(R.id.count_text_view);

        mCountTextView.setText(count + "");

        mFloatingActionButton.setOnClickListener(v -> {
            // 여기
            count++;
            mCountTextView.setText(count + "");
        });
    }
}
