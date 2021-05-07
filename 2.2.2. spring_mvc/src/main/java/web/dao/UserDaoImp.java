package web.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import web.model.User;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDaoImp implements UserDao{

    private SessionFactory sessionFactory;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }

    public UserDaoImp() {
    }

    @Override
    public List<User> getListUser() {
        List<User> list = sessionFactory.getCurrentSession().createQuery("from User",User.class).list();
        return sessionFactory.getCurrentSession().createQuery("from User",User.class).list();
    }

    @Override
    public User getById(int id) {

        return null;
    }

    @Override
    public void add(User user) {

    }

    @Override
    public void delete(User user) {

    }

    @Override
    public void edit(User user) {

    }
}
