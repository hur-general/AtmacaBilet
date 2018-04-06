package com.timposu.jsf.view;

import com.timposu.jsf.business.UserBusiness;
import com.timposu.jsf.controller.UserController;
import com.timposu.jsf.model.User;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.event.ActionEvent;
import java.io.Serializable;

@ManagedBean(name = "userbean")
@ApplicationScoped
public class UserBean implements Serializable {
    UserBusiness userBusiness = new UserBusiness();
    UserController controller = new UserController();
    String status = null;

    User registeringUser = new User();


    public void attributeListener(ActionEvent event) {
        registeringUser.setFirstName((String) event.getComponent().getAttributes().get("username"));
        status = userBusiness.loginUserWithFirstName(registeringUser);
    }

    public String getStatus() {
        return status;
    }

    public UserController getController() {
        return controller;
    }

    public User getRegisteringUser() {
        return registeringUser;
    }

    public void setRegisteringUser(User registeringUser) {
        this.registeringUser = registeringUser;
    }

    public UserBusiness getUserBusiness() {
        return userBusiness;
    }
}
