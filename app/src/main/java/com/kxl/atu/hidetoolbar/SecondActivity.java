package com.kxl.atu.hidetoolbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.dingmouren.fallingview.FallingView;

public class SecondActivity extends AppCompatActivity {

    FallingView fallingView;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        fallingView= (FallingView) findViewById(R.id.second_falling);
        imageView= (ImageView) findViewById(R.id.second_image);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SecondActivity.this.finish();
            }
        });
    }
}
