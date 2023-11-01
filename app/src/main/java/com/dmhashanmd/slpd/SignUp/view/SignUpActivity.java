package com.dmhashanmd.slpd.SignUp.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.dmhashanmd.slpd.R;
import com.dmhashanmd.slpd.SignUp.controller.SignUpController;

public class SignUpActivity extends AppCompatActivity {

    private SignUpController controller;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        controller = new SignUpController(this);
    }
}