package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private int i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    private void onView(){
        i=10;
    }
    public void networkRequest(){
        for(int j=0; j<i; j++){
            System.out.print("value of j "+j);
        }
    }
}
