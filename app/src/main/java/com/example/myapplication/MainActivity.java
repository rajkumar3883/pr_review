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
    private void onView2(){
        i=10;
    }
    private void onView3(){
        i=10;
    }
    private void onView4(){
        i=10;
        networkRequest();
    }
    public void networkRequest(){
        for(int j=0; j<i; j++){
            System.out.print("value of j "+j);
        }
       // networkRequestt();
    }
    public void networkRequest2(){
        onView4();
        for(int j=0; j<i; j++){
            System.out.print("value of j "+j);
        }}
        private int k=10;
    private int l=7;
    private int m=8;
    private int n=8;
    private int o=8;
    public void networkRequest3(){
        onView4();
        for(int j=0; j<i; j++){
            System.out.print("value of j "+j);
        }}


}
