package com.feldmann.vcloset;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;

import com.feldmann.vcloset.controller.Controller;
import com.feldmann.vcloset.controller.ViewController;

public class MainActivity extends AppCompatActivity implements Controller.view {
    private final String tagLog = this.getClass().getName().toString();
    private Controller.msg msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.msg = new ViewController(this, tagLog);
        msg.logD("onCreate");
    }

    @Override
    public Activity getActivity() {
        return this;
    }
}