package com.dmhashanmd.slpd.SignUp.model;

import com.dmhashanmd.slpd.SignUp.controller.SignUpController;

public class SignUpModel {
    private SignUpController controller;
    public SignUpModel(SignUpController signUpController) {
        this.controller = signUpController;
    }
}
