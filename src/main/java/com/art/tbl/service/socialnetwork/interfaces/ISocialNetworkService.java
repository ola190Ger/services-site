package com.art.tbl.service.socialnetwork.interfaces;
/*
@author ArtemFrunze
@class ISocialNetwork
@date 06.09.2021
@time 21:24 
*/

import com.art.tbl.model.SocialNetwork;

import java.util.List;

public interface ISocialNetworkService {
    SocialNetwork create(SocialNetwork socialNetwork);
    SocialNetwork get(String id);
    List<SocialNetwork> getall();
    SocialNetwork update(SocialNetwork socialNetwork);
    SocialNetwork delete(String id);
}
