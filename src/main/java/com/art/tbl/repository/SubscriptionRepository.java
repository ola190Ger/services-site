package com.art.tbl.repository;
/*
@author ArtemFrunze
@class SubscriptionRepository
@date 12.09.2021
@time 10:52 
*/

import com.art.tbl.fakedata.Data;
import com.art.tbl.model.Subscription;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Repository
public class SubscriptionRepository {
    @Autowired
    Data data;

    public Subscription create(Subscription subscription) {
        UUID id = UUID.randomUUID();
        subscription.setId(id.toString());
        subscription.setCreatedAt(LocalDateTime.now());
        subscription.setUpdatedAt(LocalDateTime.now());
        data.getSubscriptions().add(subscription);
        return subscription;
    }

    public Subscription get(String id) {
        return this.getAll().stream().filter(item -> item.getId().equals(id)).findFirst()
                .get();
    }

    public Subscription update(Subscription subscription) {
        Subscription sub = get(subscription.getId());
        subscription.setCreatedAt(sub.getCreatedAt());
        subscription.setUpdatedAt(LocalDateTime.now());
        data.getSubscriptions().set(data.getSubscriptions().indexOf(sub), subscription);
        return subscription;
    }

    public Subscription delete(String id) {
        Subscription subscription = get(id);
        data.getSubscriptions().remove(get(id));
        return subscription;
    }

    public List<Subscription> getAll() {
        return data.getSubscriptions();
    }
}
