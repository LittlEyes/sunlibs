package com.litteyes.sunmoveview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.sdzn.fzx.student.sunlibrary.SunProgressBar;


public class MainActivity extends AppCompatActivity {

    private SunProgressBar bar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bar = (SunProgressBar) findViewById(R.id.sun_bar);
        bar.post(new Runnable() {
            @Override
            public void run() {
                bar.startAnimator(0, 1, 1500);
            }
        });
        bar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bar.startAnimator(0, 1, 1500);
            }
        });
    }
}
