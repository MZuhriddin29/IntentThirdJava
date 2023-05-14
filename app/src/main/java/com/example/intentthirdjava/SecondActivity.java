package com.example.intentthirdjava;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.intentthirdjava.model.Student;

public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        initView();
    }

    private void initView() {
        TextView tvw_data = findViewById(R.id.tv_second);
        Student student = (Student) getIntent().getParcelableExtra("zzz");
        tvw_data.setText(student.toString());
    }
}
