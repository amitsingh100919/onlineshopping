package com.amitsingh.onlineshopping.dao;

import java.util.List;

import com.amitsingh.onlineshopping.dto.Category;

public interface CategoryDao {
	
	Category get(int id);
	List <Category> list();
	boolean add(Category category);
	boolean update(Category category);
	boolean delete(Category category);
	

}
