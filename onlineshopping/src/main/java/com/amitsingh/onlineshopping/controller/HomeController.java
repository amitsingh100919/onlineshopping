package com.amitsingh.onlineshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HomeController {
	@RequestMapping(value= {"/","/index","/home"})
	public ModelAndView index() {
		return new ModelAndView("index");
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

}
