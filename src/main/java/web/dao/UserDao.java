package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {
    void save(User user);

    void delete(long id);

    void update(User user);

    List<User> findAll();

    User findById(long id);
}