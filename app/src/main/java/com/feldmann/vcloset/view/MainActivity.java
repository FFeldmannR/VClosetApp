package com.feldmann.vcloset.view;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.feldmann.vcloset.R;
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
        this.btnIniciar( ((Button) findViewById(R.id.btnIniciar)) );
    }

    private void btnIniciar(Button btnIniciar){
        btnIniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //
                Intent in = new Intent(getActivity(), LookActivity.class);
                getActivity().startActivity(in);
            }
        });
    }

    @Override
    public Activity getActivity() { return this; }
}