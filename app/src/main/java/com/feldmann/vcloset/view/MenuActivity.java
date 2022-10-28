package com.feldmann.vcloset.view;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.feldmann.vcloset.R;
import com.feldmann.vcloset.controller.Controller;
import com.feldmann.vcloset.controller.ViewController;

public class MenuActivity extends AppCompatActivity {
    private final String tagLog = this.getClass().getName().toString();
    private Controller.msg msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        this.msg = new ViewController(this, tagLog);
        msg.logD("onCreate");
    }
}