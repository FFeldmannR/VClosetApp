package com.feldmann.vcloset.view;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import com.feldmann.vcloset.R;
import com.feldmann.vcloset.controller.Controller;
import com.feldmann.vcloset.controller.ViewController;

public class CadastroActivity extends AppCompatActivity {
    private final String tagLog = this.getClass().getName().toString();
    private Controller.msg msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
        this.msg = new ViewController(this, tagLog);
        msg.logD("onCreate");
    }

    @Override
    protected void onResume() {
        super.onResume();
        msg.logD("onResume");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        msg.logD("onDestroy");
    }

}