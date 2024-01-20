package com.example.exercieactivitesb;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.exercieactivitesb.databinding.ActivityMainBinding;
import com.example.exercieactivitesb.databinding.Page2Binding;

public class Page2 extends AppCompatActivity
{
    private Page2Binding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page2);
        binding = Page2Binding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        binding.textView.setText(getIntent().getStringExtra("EditText"));

    }
}
