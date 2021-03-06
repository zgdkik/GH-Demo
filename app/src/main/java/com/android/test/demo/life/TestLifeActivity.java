package com.android.test.demo.life;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.FrameLayout;

import com.android.test.demo.R;

public class TestLifeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /**
         * 1、通过写在xml中，然后setContentView() --> ok
         */
        //setContentView(R.layout.layout_test_life);

        /**
         * 2、代码new -->ok
         */
        FrameLayout.LayoutParams params = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.MATCH_PARENT, FrameLayout.LayoutParams.MATCH_PARENT);
        FrameLayout parent = new FrameLayout(getApplicationContext());
        addContentView(parent, params);

        TestView view = new TestView(getApplicationContext());
        view.setBackgroundColor(0x55ff0000);
        parent.addView(view, new FrameLayout.LayoutParams(FrameLayout.LayoutParams.MATCH_PARENT, 200));
    }
}
