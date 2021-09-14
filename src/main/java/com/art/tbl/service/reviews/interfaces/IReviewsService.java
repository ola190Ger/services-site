package com.art.tbl.service.reviews.interfaces;
/*
@author ArtemFrunze
@class IReviewsServices
@date 06.09.2021
@time 22:04 
*/

import com.art.tbl.model.Reviews;

import java.util.List;

public interface IReviewsService {
    Reviews create(Reviews reviews);
    Reviews get(String id);
    List<Reviews> getAll();
    Reviews update(Reviews reviews);
    Reviews delete(String id);
}
