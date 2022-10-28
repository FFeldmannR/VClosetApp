package com.feldmann.vcloset.controller;

import android.app.Activity;

public class Controller {
    public interface view{
        public Activity getActivity();
    }
    public interface msg{
        public void messageToast(String msg);
        public void logD(String msg);
    }
}
