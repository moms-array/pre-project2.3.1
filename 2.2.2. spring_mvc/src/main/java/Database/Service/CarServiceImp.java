package Database.Service;

import Database.Model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImp implements CarService{

    @Autowired
    private List<Car> cars = new ArrayList<>();

    public CarServiceImp(){
        cars.add(new Car(1,"bmw","coupe"));
        cars.add(new Car(2,"bmw","coupe"));
        cars.add(new Car(3,"bmw","coupe"));
        cars.add(new Car(4,"bmw","coupe"));
        cars.add(new Car(5,"bmw","coupe"));
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    @Override
    public List<Car> getCar(int count) {
        if(count <= cars.size()) {
            return cars.subList(0, count);
        } else{
            return cars;
        }
    }
}
