package web.Service;


import web.Model.User;

import java.util.List;

public interface UserService {
    List<User> getUser(int id);
}
