package web.controller;

import Database.Service.CarService;
import Database.Service.CarServiceImp;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CarController {
    CarService cars = new CarServiceImp();
    CarController(){
    }

    @GetMapping(value = "/cars")
    public String printCar(ModelMap modelMap,@RequestParam(defaultValue = "5") int count){
        modelMap.addAttribute("cars",cars.getCar(count));
        return "index1";
    }
}
