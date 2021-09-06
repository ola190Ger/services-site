package com.art.tbl.repository;
/*
@author ArtemFrunze
@class ReviewsRepositoryFake
@date 06.09.2021
@time 21:59 
*/

import com.art.tbl.fakedata.Data;
import com.art.tbl.model.Reviews;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Repository
public class ReviewsRepositoryFake {
    @Autowired
    Data data;

    public Reviews create(Reviews reviews) {
        UUID id = UUID.randomUUID();
        reviews.setId(id.toString());
        reviews.setCreatedAt(LocalDateTime.now());
        reviews.setUpdatedAt(LocalDateTime.now());
        data.getReviews().add(reviews);
        return reviews;
    }

    public Reviews get(String id) {
        return this.getAll().stream().filter(item -> item.getId().equals(id)).findFirst()
                .get();
    }

    public Reviews update(Reviews reviews) {
        Reviews rev = get(reviews.getId());
        reviews.setCreatedAt(rev.getCreatedAt());
        reviews.setUpdatedAt(LocalDateTime.now());
        data.getReviews().set(data.getReviews().indexOf(rev), reviews);
        return reviews;
    }

    public Reviews delete(String id) {
        Reviews reviews = get(id);
        data.getReviews().remove(get(id));
        return reviews;
    }

    public List<Reviews> getAll() {
        return data.getReviews();
    }
}
