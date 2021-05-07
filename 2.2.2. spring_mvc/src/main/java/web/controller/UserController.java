package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;
import web.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    private UserService users;

    UserController(){
    }

    public UserService getUsers() {
        return users;
    }
    @Autowired
    public void setUsers(UserService users) {
        this.users = users;
    }

    @GetMapping(value = "/")
    public ModelAndView getUser(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("list");
        modelAndView.addObject("users", users.getListUser());
        return modelAndView;
    }


}
