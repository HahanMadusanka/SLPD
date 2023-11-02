package com.dmhashanmd.slpd.SignUp.model;

import static android.content.ContentValues.TAG;

import android.util.Log;

import com.dmhashanmd.slpd.SignUp.controller.SignUpController;
import com.dmhashanmd.slpd.utils.db.model.User;
import com.dmhashanmd.slpd.utils.interfaces.CallBack;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthUserCollisionException;

import java.util.Objects;

public class SignUpModel {
    private SignUpController controller;
    private static final FirebaseAuth auth = FirebaseAuth.getInstance();
    public SignUpModel(SignUpController signUpController) {
        this.controller = signUpController;
    }

    public void createUser(User user, CallBack callBack) {
        class Class_createUser implements Runnable {
            @Override
            public void run() {
                auth.createUserWithEmailAndPassword(user.getEmail(), user.getPassword()).addOnCompleteListener(task -> {
                    if (task.isSuccessful()) {
                        user.setId(Objects.requireNonNull(auth.getCurrentUser()).getUid());
                        callBack.onSuccess();
                    } else {
                        if (task.getException() instanceof FirebaseAuthUserCollisionException) {
                            Log.d(TAG, "Already registered");
                            callBack.onFail("Already registered");
                        } else {
                            callBack.onFail(Objects.requireNonNull(task.getException()).getMessage());
                        }

                    }
                });
            }
        }
        Class_createUser class_createUser = new Class_createUser();
        new Thread(class_createUser).start();
    }

    public void saveUserData(User user) {
        class Class_saveUserData implements Runnable {
            @Override
            public void run() {
                controller.onSuccess();
            }
        }
        Class_saveUserData class_saveUserData = new Class_saveUserData();
        new Thread(class_saveUserData).start();
    }


}
