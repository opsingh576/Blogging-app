package com.codewithom.blog.reposetries;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codewithom.blog.entities.Category;

public interface CategoryRepo extends JpaRepository<Category,Integer>{

}
