package com.tkachev.testspringdatajpa.repository;

import com.tkachev.testspringdatajpa.entity.User;
import com.tkachev.testspringdatajpa.repository.custom.UserRepositoryCustom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long>, JpaSpecificationExecutor<User>, UserRepositoryCustom {
    Optional<User> findByNameAndAge(String name, Integer age);
}
