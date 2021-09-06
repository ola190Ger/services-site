package com.art.tbl.service.user.interfaces;/*
@author OlgaGereliuk
@class IUserService
@Date 06.09.2021
@Time 20:49
*/

import com.art.tbl.model.User;

import java.util.List;

public interface IUserService {
    User create(User user);
    User get(String id);
    User update(User category);
    User delete(String id);
    List<User> getAll();
}
