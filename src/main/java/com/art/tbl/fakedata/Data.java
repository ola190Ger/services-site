package com.art.tbl.fakedata;
/*
@author ArtemFrunze
@class Data
@date 02.09.2021
@time 18:51 
*/

import com.art.tbl.model.*;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class Data {

    private List<Category> categories = new ArrayList<>(
            Arrays.asList(
                    new Category("1", "name","description", LocalDateTime.now(), LocalDateTime.now()),
                    new Category("2", "name","description", LocalDateTime.now(), LocalDateTime.now()),
                    new Category("3", "name", "description", LocalDateTime.now(), LocalDateTime.now()),
                    new Category("4", "name", "description", LocalDateTime.now(), LocalDateTime.now())
            )
    );

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    private List<ProvidedService> providedServices = new ArrayList<>(
            Arrays.asList(
                    new ProvidedService("1", "providedService1", null, this.categories.stream().map(Category::getId).collect(Collectors.toList()),"description", LocalDateTime.now(), LocalDateTime.now()),
                    new ProvidedService("2", "providedService2", null, this.categories.stream().map(Category::getId).collect(Collectors.toList()),"description", LocalDateTime.now(), LocalDateTime.now()),
                    new ProvidedService("3", "providedService3", null, this.categories.stream().map(Category::getId).collect(Collectors.toList()), "description", LocalDateTime.now(), LocalDateTime.now()),
                    new ProvidedService("4", "providedService4", null, this.categories.stream().map(Category::getId).collect(Collectors.toList()), "description", LocalDateTime.now(), LocalDateTime.now())
            )
    );
    public List<ProvidedService> getProvidedServices(){
        return providedServices;
    }

    public void setProvidedServices(List<ProvidedService> providedServices){
        this.providedServices = providedServices;
    }

    private List<Location> locations = new ArrayList<>(
            Arrays.asList(
            new Location("1", "country", "region", "city", null,"description", LocalDateTime.now(), LocalDateTime.now()),
            new Location("2", "country2", "region2", "city2",null,"description2", LocalDateTime.now(), LocalDateTime.now()),
            new Location("3", "country3", "region3", "city3",null, "description3", LocalDateTime.now(), LocalDateTime.now())
    )
    );

    public List<Location> getLocations() {
        return locations;
    }

    public void setLocations(List<Location> locations) {
        this.locations = locations;
    }

    private List<SocialNetwork> socialNetworks = new ArrayList<>(
            Arrays.asList(
                    new SocialNetwork("1", "name", "url", null,"description", LocalDateTime.now(), LocalDateTime.now()),
                    new SocialNetwork("2", "name2", "url2", null,"description2", LocalDateTime.now(), LocalDateTime.now()),
                    new SocialNetwork("3", "name3", "url3", null,"description3", LocalDateTime.now(), LocalDateTime.now())
            )
    );

    public List<SocialNetwork> getSocialNetworks() {
        return socialNetworks;
    }

    public void setSocialNetworks(List<SocialNetwork> socialNetworks) {
        this.socialNetworks = socialNetworks;
    }

    private List<User> users = new ArrayList<>(
            Arrays.asList(
                    new User("1", "name", "surname", "email", "password", "description", LocalDateTime.now(), LocalDateTime.now()),
                    new User("2", "name2", "surname", "email", "password", "description", LocalDateTime.now(), LocalDateTime.now()),
                    new User("3", "name3", "surname", "email", "password", "description", LocalDateTime.now(), LocalDateTime.now()),
                    new User("4", "name4", "surname", "email", "password", "description", LocalDateTime.now(), LocalDateTime.now())
            )
    );

    public List<User> getUsers(){
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    private  List<TypeContractor> typeContractors = new ArrayList<>(
            Arrays.asList(
                    new TypeContractor("1", "type1", "description1", LocalDateTime.now(), LocalDateTime.now()),
                    new TypeContractor("2", "type2", "description2", LocalDateTime.now(), LocalDateTime.now()),
                    new TypeContractor("3", "type3", "description3", LocalDateTime.now(), LocalDateTime.now())
            )
    );

    public List<TypeContractor> getTypeContractors() {
        return typeContractors;
    }

    public void setTypeContractors(List<TypeContractor> typeContractors) {
        this.typeContractors = typeContractors;
    }



    private  List<Reviews> reviews = new ArrayList<>(
            Arrays.asList(
                    new Reviews("1","text", null,"description", LocalDateTime.now(), LocalDateTime.now()),
                    new Reviews("2","text2", null,"description2", LocalDateTime.now(), LocalDateTime.now()),
                    new Reviews("3","text3", null,"description3", LocalDateTime.now(), LocalDateTime.now())
            )
    );

    public List<Reviews> getReviews() {
        return reviews;
    }

    public void setReviews(List<Reviews> reviews) {
        this.reviews = reviews;
    }
}
