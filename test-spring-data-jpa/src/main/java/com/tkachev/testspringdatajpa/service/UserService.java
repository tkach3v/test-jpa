package com.tkachev.testspringdatajpa.service;

import com.tkachev.testspringdatajpa.entity.User;

public interface UserService {

    User getUserById(Long id);

    User getUserByName(String name);

    User getUserByNameAndAge(String name, Integer age);

    Long getCount();
}
