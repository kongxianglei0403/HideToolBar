package com.kxl.atu.hidetoolbar;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;

import com.dingmouren.fallingview.FallingView;

public class MainActivity extends AppCompatActivity {

    FallingView fallingView;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //告诉Windows页面切换需要使用动画、
        getWindow().requestFeature(Window.FEATURE_CONTENT_TRANSITIONS);
        //全透明状态栏效果
        /*getWindow().requestFeature(Window.FEATURE_NO_TITLE);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS
                    | WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
            window.getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                    | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                    | View.SYSTEM_UI_FLAG_LAYOUT_STABLE);
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.TRANSPARENT);
            window.setNavigationBarColor(Color.TRANSPARENT);
        }*/
        setContentView(R.layout.activity_main);
        fallingView= (FallingView) findViewById(R.id.activity_main);
        imageView= (ImageView) findViewById(R.id.image);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,SecondActivity.class);
                startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(MainActivity.this,imageView,"atu").toBundle());
            }
        });
//        fallingView.setImageResource(R.drawable.snow_flake);//设置碎片的图片，默认是雪花
//        fallingView.setDelay(10);//设置碎片的飘落速度，数值越大，飘落的越慢，默认是10
//        fallingView.setDensity(100);//设置碎片的密度，数值越大，密度越大，默认是80
//        fallingView.setScale(3);//设置碎片的大小，数值越大，碎片越小，默认是3
    }
}
