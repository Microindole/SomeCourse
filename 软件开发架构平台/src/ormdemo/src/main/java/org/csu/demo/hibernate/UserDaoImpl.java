package org.csu.demo.hibernate;


import jakarta.persistence.EntityManagerFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao{


    @Autowired
    private EntityManagerFactory entityManagerFactory;

    @Override
    public User findUser(Integer id) {
        SessionFactory sessionFactory = entityManagerFactory.unwrap(SessionFactory.class);
        Session session = sessionFactory.openSession();
//        session.beginTransaction();
        User user = session.get(User.class, id);
//        user.setPassword("123456");
//        session.close();
        return user;
    }
}
