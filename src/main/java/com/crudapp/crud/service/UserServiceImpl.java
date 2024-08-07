package com.crudapp.crud.service;

import com.crudapp.crud.dao.UserDao;
import com.crudapp.crud.model.User;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService{


    private UserDao userDao;

    @Override
    public void addUser(User user) {
         userDao.save(user);
    }

    @Override
    public List<User> getAllUser(User user) {
        return userDao.findAll();
    }

    @Override
    public User getUserById(long Id) {
        return userDao.findAll().stream().filter(custmerr -> custmerr.getId()==Id).findFirst().orElseThrow(()->new IllegalStateException("Customer "+Id+" Not Found"));
    }

    @Override
    public User updateUser(User user) {
       return userDao.save(user);
    }

    @Override
    public void deleteUser(long id) {
         userDao.deleteById(id);
    }


}
