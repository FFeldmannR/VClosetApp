package com.feldmann.vcloset.view;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.feldmann.vcloset.R;
import com.feldmann.vcloset.controller.Controller;

public class LookActivity extends AppCompatActivity {
    private final String tagLog = this.getClass().getName().toString();
    private Controller.msg msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_look);
    }
}