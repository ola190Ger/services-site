package com.art.tbl.service.socialnetwork.impls;
/*
@author ArtemFrunze
@class SocialNetworkServiceImpl
@date 06.09.2021
@time 21:26 
*/

import com.art.tbl.model.SocialNetwork;
import com.art.tbl.repository.SocialNetworkRepositoryFake;
import com.art.tbl.service.socialnetwork.interfaces.ISocialNetworkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SocialNetworkServiceImpl implements ISocialNetworkService {
    @Autowired
    SocialNetworkRepositoryFake repo;

    @Override
    public SocialNetwork create(SocialNetwork socialNetwork) {
        return repo.create(socialNetwork);
    }

    @Override
    public SocialNetwork get(String id) {
        return repo.get(id);
    }

    @Override
    public List<SocialNetwork> getall() {
        return repo.getAll();
    }

    @Override
    public SocialNetwork update(SocialNetwork socialNetwork) {
        return repo.update(socialNetwork);
    }

    @Override
    public SocialNetwork delete(String id) {
        return repo.delete(id);
    }
}
