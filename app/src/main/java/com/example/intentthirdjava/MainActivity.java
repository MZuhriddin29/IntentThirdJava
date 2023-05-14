package com.example.intentthirdjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.intentthirdjava.model.Student;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        Button b_check = findViewById(R.id.b_check);
        b_check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Student student = new Student(21,"Zuhriddin");
                startSecondActivity(student);
            }
        });
    }

    void startSecondActivity(Student student){
        Intent intent =new Intent(this , SecondActivity.class);
        intent.putExtra("zzz" , student);
        startActivity(intent);
    }
}