package com.codewithom.blog.services;

import java.util.List;

import com.codewithom.blog.entities.Post;
import com.codewithom.blog.paylods.PostDto;
import com.codewithom.blog.paylods.PostResponse;

public interface PostService {
	
	//create
	PostDto createPost(PostDto postDto, Integer userId, Integer categoryId);
	
	//update
	
	PostDto updatePost(PostDto postDto, Integer postId);
	
	//delete
	
	void deletePost(Integer PostId);
	
	//get All posts
	
	PostResponse getAllPost(Integer pageNumber,Integer pageSize,String sortBy, String sortDir);
	
	//getSingle post
	
	PostDto getPostById(Integer postId);
	
	//getAll Post by category
	
	List<PostDto> getPostsByCategoy(Integer categoryId);
	
	//get All posts by user
	
	List<PostDto> getPostsByUser(Integer userId);
	
	//search posts
	List<PostDto> searchPosts(String keyword);

}
