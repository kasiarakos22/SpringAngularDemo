package com.kasiarakos.demo.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kasiarakos.demo.domain.User;

@Repository
public interface UserRepository extends CrudRepository<User,Long> {
}
