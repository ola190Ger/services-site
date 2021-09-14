package com.art.tbl.repository;/*
@author OlgaGereliuk
@class UserRepositoryFake
@Date 06.09.2021
@Time 20:53
*/

import com.art.tbl.fakedata.Data;
import com.art.tbl.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Repository
public class UserRepositoryFake {
    @Autowired
    Data data;

    public User create(User user) {
        UUID id = UUID.randomUUID();
        user.setId(id.toString());
        user.setCreatedAt(LocalDateTime.now());
        user.setUpdatedAt(LocalDateTime.now());
        data.getUsers().add(user);
        return user;
    }

    public User get(String id) {
        return getAll().parallelStream().filter(s -> s.getId().equals(id)).findFirst().orElseGet(() -> get(id));

    }

    public User update(User user) {
        User user1 = get(user.getId());
        user.setCreatedAt(user1.getCreatedAt());
        user.setUpdatedAt(LocalDateTime.now());
        data.getUsers().set(data.getUsers().indexOf(user1), user);
        return user;
    }

    public User delete(String id) {
        User user = get(id);
        data.getUsers().remove(get(id));
        return user;
    }

    public List<User> getAll() {
        return data.getUsers();
    }
}
