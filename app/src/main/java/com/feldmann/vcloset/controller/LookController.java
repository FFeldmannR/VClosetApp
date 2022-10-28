package com.feldmann.vcloset.controller;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import com.feldmann.vcloset.view.MenuActivity;

public class LookController implements Controller.controllerLook{
    private Context context;
    private Controller.msg msg;

    public LookController(Context context) {
        this.context = context;
    }

    @Override
    public void btnMenu(Button btnMenu) {
        btnMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                msg.logD("btnMenu Clicado");
                Intent in = new Intent(context, MenuActivity.class);
                context.startActivity(in);
            }
        });
    }
}
