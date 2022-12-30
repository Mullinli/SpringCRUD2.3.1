package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.UserDao;
import web.model.User;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class UserServiceImp implements UserService {
    @Autowired
    private UserDao userDao;

    @Transactional
    public void save(User user) {
        userDao.save(user);
    }

    @Transactional
    public void delete(long id) {
        userDao.delete(id);

    }

    @Transactional
    public void update(User user) {
        userDao.update(user);
    }

    @Transactional
    public User findById(long id) {
        return userDao.findById(id);
    }

    @Transactional
    public List<User> findAll() {
        return userDao.findAll();
    }
}
