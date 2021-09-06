package com.art.tbl.repository;
/*
@author ArtemFrunze
@class SocialNetworkRepositoriFake
@date 06.09.2021
@time 21:17 
*/

import com.art.tbl.fakedata.Data;
import com.art.tbl.model.SocialNetwork;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Repository
public class SocialNetworkRepositoryFake {
    @Autowired
    Data data;

    public SocialNetwork create(SocialNetwork socialNetwork)
    {
        UUID id = UUID.randomUUID();
        socialNetwork.setId(id.toString());
        socialNetwork.setCreatedAt(LocalDateTime.now());
        socialNetwork.setUpdatedAt(LocalDateTime.now());
        data.getSocialNetworks().add(socialNetwork);
        return socialNetwork;
    }

    public List<SocialNetwork> getAll()
    {
        return data.getSocialNetworks();
    }

    public SocialNetwork get(String id){
        return getAll().parallelStream().filter(s -> s.getId().equals(id)).findFirst().orElseGet(() -> get(id));
    }

    public SocialNetwork update(SocialNetwork socialNetwork) {
        SocialNetwork socnet = get(socialNetwork.getId());
        socialNetwork.setCreatedAt(socnet.getCreatedAt());
        socialNetwork.setUpdatedAt(LocalDateTime.now());
        data.getSocialNetworks().set(data.getSocialNetworks().indexOf(socnet), socialNetwork);
        return socialNetwork;
    }

    public SocialNetwork delete(String id){
        SocialNetwork socialNetwork = get(id);
        data.getSocialNetworks().remove(get(id));
        return socialNetwork;
    }
}
