package com.timposu.jsf.business;

import com.timposu.jsf.model.User;

public class UserBusiness {

    public String loginUserWithFirstName(User user) {

        if (user.getFirstName().equals("admin"))
            return "Hosgeldin";
        else return "Yanlıs giriş";

    }
}
