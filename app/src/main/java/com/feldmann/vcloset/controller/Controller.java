package com.feldmann.vcloset.controller;

import android.app.Activity;
import android.content.Context;
import android.widget.Button;

public class Controller {
    public interface view{
        public Activity getActivity();
    }
    public interface msg{
        public void messageToast(String msg);
        public void logD(String msg);
    }
    public interface controllerLook{
        public void btnMenu(Button btnMenu);
    }
}
