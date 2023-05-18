package com.tkachev.testspringdatajpa.repository.custom.impl;

import com.tkachev.testspringdatajpa.repository.custom.UserRepositoryCustom;
import jakarta.persistence.EntityManager;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class UserRepositoryCustomImpl implements UserRepositoryCustom {

    private EntityManager entityManager;

//    @Override
//    public Optional<User> findByName(String name) {
//        // реализация кастомного запроса
//        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
//        CriteriaQuery<User> cq = cb.createQuery(User.class);
//
//        Root<User> user = cq.from(User.class);
//        cq.where(cb.equal(user.get("name"), name));
//
//        List<User> resultList = entityManager.createQuery(cq).getResultList();
//        if (CollectionUtils.isEmpty(resultList)) {
//            return Optional.empty();
//        }
//
//        return Optional.of(resultList.get(0));
//    }

    @Override
    public Long getCount() {
        return entityManager.createQuery("select count(*) from user_", Long.class).getSingleResult();
    }
}
