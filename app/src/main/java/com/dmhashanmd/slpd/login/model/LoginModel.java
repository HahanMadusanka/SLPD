package com.dmhashanmd.slpd.login.model;



import android.os.Handler;
import android.os.Looper;


import com.dmhashanmd.slpd.login.controller.LoginController;


public class LoginModel {
    private LoginController controller;
    private final Handler handler = new Handler(Looper.getMainLooper());

    public LoginModel(LoginController loginController) {
        this.controller = loginController;
    }

    public void login(String username, String password) {
        class Class_login implements Runnable {
            @Override
            public void run() {
            }
        }
        Class_login class_login = new Class_login();
        new Thread(class_login).start();
    }

}
