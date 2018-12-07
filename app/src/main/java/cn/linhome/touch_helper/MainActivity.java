package cn.linhome.touch_helper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;

import cn.linhome.lib.touchhelper.FTouchHelper;

public class MainActivity extends AppCompatActivity
{
    private FTouchHelper mTouchHelper = new FTouchHelper();

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTouchHelper.setDebug(true);
    }


    @Override
    public boolean onTouchEvent(MotionEvent event)
    {
        mTouchHelper.processTouchEvent(event);
        return super.onTouchEvent(event);
    }
}
