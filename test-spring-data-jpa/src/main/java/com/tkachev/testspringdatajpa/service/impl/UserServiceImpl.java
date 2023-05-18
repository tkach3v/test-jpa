package com.tkachev.testspringdatajpa.service.impl;

import com.tkachev.testspringdatajpa.entity.User;
import com.tkachev.testspringdatajpa.repository.UserRepository;
import com.tkachev.testspringdatajpa.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

import static com.tkachev.testspringdatajpa.service.specification.UserSpecification.byName;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    // Пример использования спецификации
    @Override
    public User getUserByName(String name) {
        List<User> users = userRepository.findAll(byName(name));
        if (CollectionUtils.isEmpty(users)) {
            return null;
        }

        return users.get(0);
    }

    // Пример query methods
    @Override
    public User getUserByNameAndAge(String name, Integer age) {
        return userRepository.findByNameAndAge(name, age).orElse(null);
    }

    // Пример использования кастомной репы с методом на jpql/sql
    @Override
    public Long getCount() {
        return userRepository.getCount();
    }
}
