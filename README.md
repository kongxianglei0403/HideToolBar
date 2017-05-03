# HideToolBar
雪花效果（fallingview）以及共享元素
# usage
```groovy
compile 'com.dingmouren.fallingview:fallingview:1.0.1'
```
# simple(雪花效果)
```java

<com.dingmouren.fallingview.FallingView
        android:id="@+id/activity_main"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        app:fallingDelay="10"
        app:flakeDensity="50"
        app:flakeScale="3"
        app:flakeSrc="@drawable/snow_flake">
        <ImageView
            android:id="@+id/image"
            android:layout_width="100dp"
            android:layout_height="200dp"
            android:background="@drawable/atu"
            android:transitionName="atu"/>
</com.dingmouren.fallingview.FallingView>
```

# 共享元素

## usage
```java
//在setContentView();之前告诉Windows页面切换需要使用动画、
getWindow().requestFeature(Window.FEATURE_CONTENT_TRANSITIONS);
android:transitionName="atu" 

第一个参数当前activity，第二个参数共享的view，第三个参数  就是上面的transitionName  两个transitionName一定要一样
startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(MainActivity.this,imageView,"atu").toBundle());
```
### capture
<img src='C:\Users\Administrator\Desktop\atu.gif' width='240'/>


