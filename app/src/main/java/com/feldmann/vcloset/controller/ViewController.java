package com.feldmann.vcloset.controller;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

public class ViewController implements Controller.msg {
    private Context context;
    private String tag;

    public ViewController(Context context, String tag) {
        this.context = context;
        this.tag = tag;
    }

    @Override
    public void messageToast(String msg) { Toast.makeText(context, msg, Toast.LENGTH_LONG).show(); }

    @Override
    public void logD(String msg) { Log.d(tag, msg); }
}
