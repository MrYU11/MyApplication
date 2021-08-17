package com.bw.myapplication;

import android.app.Activity;
import android.app.Application;
import android.content.Context;

/**
 * @author zqy
 * @description:
 * @date :2021/8/17 19:28
 */
public class Toast extends android.widget.Toast {
    /**
     * Construct an empty Toast object.  You must call {@link #setView} before you
     * can call {@link #show}.
     *
     * @param context The context to use.  Usually your {@link Application}
     *                or {@link Activity} object.
     */
    public Toast(Context context) {
        super(context);
    }
}
