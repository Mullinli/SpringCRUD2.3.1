package web.service;

import java.util.List;

import web.model.User;

public interface UserService {
    void save(User user);

    void delete(long id);

    void update(User user);

    User findById(long id);

    List<User> findAll();
}
