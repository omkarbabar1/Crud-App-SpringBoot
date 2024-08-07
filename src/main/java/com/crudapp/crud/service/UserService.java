package com.crudapp.crud.service;

import com.crudapp.crud.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    public void addUser(User user);
    public List<User> getAllUser(User user);
    public User getUserById(long Id);
    public User updateUser(User user) ;
    public void deleteUser(long id);

}
