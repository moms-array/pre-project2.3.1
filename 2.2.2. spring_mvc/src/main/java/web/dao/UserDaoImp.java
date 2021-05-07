package web.dao;

import org.hibernate.ReplicationMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import web.model.User;
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
    public User getById(long id) {

        return sessionFactory.getCurrentSession().get(User.class,id);
    }

    @Override
    public void add(User user) {
        sessionFactory.getCurrentSession().save(user);
    }

    @Override
    public void delete(User user) {
        sessionFactory.getCurrentSession().delete(user);
    }

    @Override
    public void edit(User user) {
        sessionFactory.getCurrentSession().update(user);

    }
}
