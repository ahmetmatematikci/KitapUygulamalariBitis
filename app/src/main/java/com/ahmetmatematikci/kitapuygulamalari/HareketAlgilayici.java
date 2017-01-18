package com.ahmetmatematikci.kitapuygulamalari;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.GestureDetectorCompat;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.TextView;

public  class  HareketAlgilayici extends Activity implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener {
    GestureDetectorCompat algilayici;
    TextView tv;

    protected void onCreate(Bundle s) {
        super.onCreate(s);
        setContentView(R.layout.hareketalgilayici);

        algilayici = new GestureDetectorCompat(this,this);
        algilayici.setOnDoubleTapListener(this);

        tv = (TextView)findViewById(R.id.textView10);
    }


    @Override
    public boolean onTouchEvent(MotionEvent event) {
        algilayici.onTouchEvent(event);
        return super.onTouchEvent(event);
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        tv.setText("onDown");
        return true;
    }

    @Override
    public void onShowPress(MotionEvent motionEvent) {
        tv.setText("onShowPress");

    }

    @Override
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        tv.setText("onSingleTapUp");
        return true;
    }

    @Override
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
        tv.setText("onScroll");
        return true;
    }

    @Override
    public void onLongPress(MotionEvent motionEvent) {
        tv.setText("onLongPress");

    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
        tv.setText("onFling");
        return true;
    }

    @Override
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        tv.setText("onSingleTapConfirmed");
        return true;
    }

    @Override
    public boolean onDoubleTap(MotionEvent motionEvent) {
        tv.setText("onDoubleTap");
        return true;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        tv.setText("onDoubleTapEvent");
        return true;
    }
}