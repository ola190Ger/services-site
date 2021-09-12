package com.art.tbl.service.subscription.impls;
/*
@author ArtemFrunze
@class SubscriptionServiceImpl
@date 12.09.2021
@time 10:58 
*/

import com.art.tbl.model.Subscription;
import com.art.tbl.repository.SubscriptionRepository;
import com.art.tbl.service.subscription.interfaces.ISubscriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubscriptionServiceImpl implements ISubscriptionService {
    @Autowired
    SubscriptionRepository repo;

    @Override
    public Subscription create(Subscription subscription) {
        return repo.create(subscription);
    }

    @Override
    public Subscription get(String id) {
        return repo.get(id);
    }

    @Override
    public List<Subscription> getAll() {
        return repo.getAll();
    }

    @Override
    public Subscription update(Subscription subscription) {
        return repo.update(subscription);
    }

    @Override
    public Subscription delete(String id) {
        return repo.delete(id);
    }
}
