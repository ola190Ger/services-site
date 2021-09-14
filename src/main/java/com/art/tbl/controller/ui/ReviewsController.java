package com.art.tbl.controller.ui;
/*
@author OlgaGereliuk
@class ReviewsController
@Date 14.09.2021
@Time 21:10
*/

import com.art.tbl.model.Reviews;
import com.art.tbl.service.reviews.impls.ReviewsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/web/reviews")
@Controller
public class ReviewsController {
    @Autowired
    ReviewsServiceImpl reviewsService;

    @RequestMapping(value = {"/", "/index"}, method = RequestMethod.GET)
    public String index(Model model){
        model.addAttribute("message", "Hello world!");
        return "index";
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String reviewsList(Model model){
        model.addAttribute("reviews", reviewsService.getAll());
        return "reviewsList";
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public String deleteReview(Model model, @PathVariable("id") String id)
    {
        reviewsService.delete(id);
        return "redirect:/web/reviews/list";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public String editReviw(Model model, @PathVariable("id") String id)
    {
        Reviews review = reviewsService.get(id);
        model.addAttribute("review", review);
        return "editReviw";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
    public String editReviw(Model model,
                               @ModelAttribute("review") Reviews review,
                               @PathVariable("id") String id)
    {
        reviewsService.update(review);
        return "redirect:/web/reviews/list";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String addReview(Model model)
    {
        Reviews review = new Reviews();
        model.addAttribute("review", review);
        return "addReview";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addReview(Model model,
                              @ModelAttribute("review") Reviews review)
    {
        reviewsService.create(review);
        return "redirect:/web/reviews/list";
    }

}
