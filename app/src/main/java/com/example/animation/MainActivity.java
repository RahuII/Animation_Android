package com.example.animation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    boolean showImage1 = true;
    public void fade(View view){
//        Log.i("Info", "fade: working");
        ImageView imageView2 = (ImageView) findViewById(R.id.imageView);
        ImageView imageView1 = (ImageView) findViewById(R.id.imageView1);
        if(showImage1){
            showImage1 = false;
            imageView1.animate().alpha(0).setDuration(1000);
            imageView2.animate().alpha(1).setDuration(1000);
        }
        else{
            showImage1 = true;

            imageView1.animate().alpha(1).setDuration(1000);
            imageView2.animate().alpha(0).setDuration(1000);
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}