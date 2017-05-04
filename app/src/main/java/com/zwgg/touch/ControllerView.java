package com.zwgg.touch;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

/**
 * Class: ControllerView
 * Author: ZhouWei
 * Date: 2017/5/3
 * Time: 10:07
 */

public class ControllerView extends RelativeLayout {

    private boolean isIntercept = false;
    private boolean isRequestDisallowIntercept = false;
    private boolean mTouchResult = false;

    public ControllerView(Context context) {
        super(context);
    }

    public ControllerView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ControllerView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        return isIntercept;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return super.onTouchEvent(event);
    }
}
