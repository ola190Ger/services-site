package com.art.tbl.service.subscription.interfaces;
/*
@author ArtemFrunze
@class ISubscriptionService
@date 12.09.2021
@time 10:57 
*/

import com.art.tbl.model.Subscription;

import java.util.List;

public interface ISubscriptionService {
    Subscription create(Subscription subscription);
    Subscription get(String id);
    List<Subscription> getAll();
    Subscription update(Subscription subscription);
    Subscription delete(String id);
}
