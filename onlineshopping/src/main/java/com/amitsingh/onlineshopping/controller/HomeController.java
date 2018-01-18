package com.amitsingh.onlineshopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.amitsingh.onlineshopping.dao.CategoryDao;
import com.amitsingh.onlineshopping.dto.Category;


@Controller
public class HomeController {
	@Autowired
	private Category categoryDAO;
	@RequestMapping(value= {"/","/index","/home"})
	public ModelAndView index() {
		ModelAndView mv =new ModelAndView("index");
		mv.addObject("title","Home");
		mv.addObject("categories",((CategoryDao) categoryDAO).list());
		return mv;
		
	}
	@RequestMapping(value= "/about")
	public ModelAndView about() {
		return new ModelAndView("about");
	}
	@RequestMapping(value= "/codes")
	public ModelAndView codes() {
		return new ModelAndView("codes");
	}
	@RequestMapping(value="/faq")
	public ModelAndView faq() {
		return new ModelAndView("faq");
	}
	@RequestMapping(value="/icons")
	public ModelAndView icons() {
		return new ModelAndView("icons");
	}
	@RequestMapping(value="/mail")
	public ModelAndView mail() {
		return new ModelAndView("mail");
	}
	@RequestMapping(value="/products")
	public ModelAndView products() {
		return new ModelAndView("products");
	}
	@RequestMapping(value="/products1")
	public ModelAndView products1() {
		return new ModelAndView("products1");
	}
	@RequestMapping(value="/products2")
	public  ModelAndView products2() {
		return new ModelAndView("products2");
	}
	@RequestMapping(value="/single")
	public ModelAndView single() {
		return new ModelAndView("single");
	}
	
	/*
	 * method to load all the products and based on category
	 */
	@RequestMapping(value="/show/all/products")
	public ModelAndView ShowAllProducts() {
		ModelAndView mv =new ModelAndView("index");
		mv.addObject("title","All Products");
		//passing the list of category
		mv.addObject("categories",((CategoryDao) categoryDAO).list());
		return mv;
	}
	@RequestMapping(value="/show/category/{id}/products")
	public ModelAndView ShowCategoryProducts(@PathVariable("id") int id) {
		ModelAndView mv =new ModelAndView("index");
		// CategoryDAO to fetch a single category
		Category category=null;
		category=((CategoryDao) categoryDAO).get(id);
		mv.addObject("title",category.getName());
		//passing the list of category
		mv.addObject("categories",((CategoryDao) categoryDAO).list());
		//passing the single category object
		mv.addObject("category",category);
		return mv;
	}

}
