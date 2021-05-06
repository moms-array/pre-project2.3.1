package web.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.Model.User;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImp implements UserService {

    private List<User> users = new ArrayList<>();

    @Autowired
    public UserServiceImp(){
        users.add(new User(1,"Mike","ko"));
        users.add(new User(2,"ur","coasdupe"));
        users.add(new User(3,"qr","qer"));
        users.add(new User(4,"bmzxcw","c"));
        users.add(new User(5,"qw","tr"));
    }

    public List<User> getUsers() {
        return users;
    }

    public void setCars(List<User> cars) {
        this.users = users;
    }

    @Override
    public List<User> getUser(int count) {
        if(count <= users.size()) {
            return users.subList(0, count);
        } else{
            return users;
        }
    }
}
