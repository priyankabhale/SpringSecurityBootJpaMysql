package com.spring.security.mysql.SpringSecurityBootJpaMysql;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.security.mysql.SpringSecurityBootJpaMysql.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	Optional<User> findByUsername(String name);
}
