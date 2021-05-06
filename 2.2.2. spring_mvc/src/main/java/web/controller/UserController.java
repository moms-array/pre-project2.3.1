package web.controller;

import web.Service.UserService;
import web.Service.UserServiceImp;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {
    UserService users = new UserServiceImp();
    UserController(){
    }

    @GetMapping(value = "/users")
    public String printCar(ModelMap modelMap,@RequestParam(defaultValue = "5") int count){
        modelMap.addAttribute("users",users.getUser(count));
        return "index1";
    }
}
