package com.art.tbl.service.reviews.impls;
/*
@author ArtemFrunze
@class ReviewsServiceImpl
@date 06.09.2021
@time 22:06 
*/

import com.art.tbl.model.Reviews;
import com.art.tbl.repository.ReviewsRepositoryFake;
import com.art.tbl.service.reviews.interfaces.IReviewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewsServiceImpl implements IReviewsService {
    @Autowired
    ReviewsRepositoryFake repo;

    @Override
    public Reviews create(Reviews reviews) {
        return repo.create(reviews);
    }

    @Override
    public Reviews get(String id) {
        return repo.get(id);
    }

    @Override
    public List<Reviews> getAll() {
        return repo.getAll();
    }

    @Override
    public Reviews update(Reviews reviews) {
        return repo.update(reviews);
    }

    @Override
    public Reviews delete(String id) {
        return repo.delete(id);
    }
}
