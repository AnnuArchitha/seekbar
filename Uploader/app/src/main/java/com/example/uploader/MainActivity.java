package com.example.uploader;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {
    Button start,end,upload;
    ProgressBar progress,prohori;
    int progress1 =0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        progress=findViewById(R.id.progressBar);
        prohori=findViewById(R.id.progressBarhori);
        start = findViewById(R.id.start);
        end = findViewById(R.id.end);
        upload = findViewById(R.id.upload);
        progress.setVisibility(View.GONE);
    }

    public void Upload(View view) {
        fake(progress1);
    }

    public void End(View view) {
        progress.setVisibility(View.GONE);
    }

    public void Start(View view) {
        progress.setVisibility(View.VISIBLE);
    }
    public void fake(final int progress1){
        prohori.setProgress(progress1);
        Thread thre =new Thread(new Runnable() {
            @Override
            public void run() {

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                fake(progress1+10);

            }
        });
        thre.start();

    }

}
