package com.tkachev.testspringdatajpa.service.specification;

import com.tkachev.testspringdatajpa.entity.User;
import com.tkachev.testspringdatajpa.entity.User_;
import org.springframework.data.jpa.domain.Specification;

public class UserSpecification {

    private UserSpecification() {
    }

    // User_.NAME - метамодель сущности User сгенерированная hibernate-jpamodelgen
    public static Specification<User> byName(String name) {
        return (root, query, criteriaBuilder) -> criteriaBuilder.equal(root.get(User_.NAME), name);
    }
}
