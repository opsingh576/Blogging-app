package com.codewithom.blog.reposetries;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codewithom.blog.entities.Category;
import com.codewithom.blog.entities.Post;
import com.codewithom.blog.entities.User;

public interface PostRepo extends JpaRepository<Post,Integer> 
{

	List<Post> findByUser(User user);
	List<Post> findByCategory(Category category);
	List<Post> findByTitleContaining(String title);
}
