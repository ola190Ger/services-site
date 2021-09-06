package com.art.tbl.service.user.impls;/*
@author OlgaGereliuk
@class UserServiceImpl
@Date 06.09.2021
@Time 20:51
*/

import com.art.tbl.model.User;
import com.art.tbl.repository.UserRepositoryFake;
import com.art.tbl.service.user.interfaces.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    UserRepositoryFake repo;

    @Override
    public User create(User user) {
        return repo.create(user);
    }

    @Override
    public User get(String id) {
        return repo.get(id);
    }

    @Override
    public User update(User user) {
        return repo.update(user);
    }

    @Override
    public User delete(String id) {
        return repo.delete(id);
    }

    @Override
    public List<User> getAll() {
        return repo.getAll();
    }
}
