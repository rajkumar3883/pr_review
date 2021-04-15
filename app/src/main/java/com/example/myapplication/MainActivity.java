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
    private void onView6(){
    i=20;
    System.out.print("values of i "+i);    
    }
    public void networkRequest(){
        for(int j=0; j<i; j++){
            System.out.print("value of j "+j);
        }
       // networkRequestt();
        //

    }
public void newViewMethod(Bundle savedInstanceState){
        // Todo
}


}
