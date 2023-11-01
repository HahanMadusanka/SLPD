package com.dmhashanmd.slpd.SignUp.controller;

import com.dmhashanmd.slpd.SignUp.model.SignUpModel;
import com.dmhashanmd.slpd.SignUp.view.SignUpActivity;

public class SignUpController {
    private SignUpActivity view;
    private SignUpModel model;
    public SignUpController(SignUpActivity signUpActivity) {
        this.view = signUpActivity;
        this.model = new SignUpModel(this);
    }
}
