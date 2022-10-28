package com.feldmann.vcloset.view;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.os.Bundle;
import com.feldmann.vcloset.R;
import com.feldmann.vcloset.controller.Controller;
import com.feldmann.vcloset.controller.LookController;
import com.feldmann.vcloset.controller.ViewController;

public class LookActivity extends AppCompatActivity implements Controller.view{
    private final String tagLog = this.getClass().getName().toString();
    private Controller.msg msg;
    private Controller.controllerLook look;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_look);
        this.msg = new ViewController(getActivity(), tagLog);
        this.look = new LookController(getActivity());
        msg.logD("onCreate");
    }

    @Override
    public Activity getActivity() { return this; }
}