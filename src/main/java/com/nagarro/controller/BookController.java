package com.nagarro.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.nagarro.service.BookService;

@Controller
public class BookController {
	
	@Autowired
	BookService bookService = new BookService();
	

	
	
	
	@RequestMapping(value = "booklist", method = RequestMethod.GET)
	public ModelAndView add(HttpServletRequest request, HttpServletResponse response) 
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("display");
		mv.addObject("result",bookService.getAllBooks());
		return mv;
	}

}


