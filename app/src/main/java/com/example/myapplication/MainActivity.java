package com.example.myapplication;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

public class MainActivity extends AppCompatActivity {

    private TextView mCountTextView;
    private MainViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mCountTextView = findViewById(R.id.count_text_view);

        viewModel = new ViewModelProvider(this).get(MainViewModel.class);

        // 알아서 UI 업데이트
        viewModel.countLiveData.observe(this, count -> updateUI(count));

        // 데이터를 변경하는 부분
        findViewById(R.id.fab).setOnClickListener(v -> viewModel.increase());
        findViewById(R.id.decrease_button).setOnClickListener(v -> viewModel.decrease());
    }

    private void updateUI(int count) {
        mCountTextView.setText(count + "");
    }


}
