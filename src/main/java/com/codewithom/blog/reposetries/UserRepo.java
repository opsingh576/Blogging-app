package com.codewithom.blog.reposetries;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codewithom.blog.entities.User;

public interface UserRepo extends JpaRepository<User, Integer> {

}
