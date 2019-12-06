package com.bdiiot.spring.boot.bd.dao;

import com.bdiiot.spring.boot.bd.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
