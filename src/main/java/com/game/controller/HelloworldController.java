package com.game.controller;


import java.io.BufferedReader;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;


@Controller
@RequestMapping("/helloworld") 
public class HelloworldController {

	/*@RequestMapping("/helloworld") 
	public void helloWorld(HttpServletRequest request, HttpServletResponse response) throws IOException {
        		
        //输出字符串
		 System.out.println(request);
	     System.out.println("============");
        response.getWriter().append("hello world123");           

    }*/
	@RequestMapping(value="/index",method=RequestMethod.GET)
	public String index(Model model)
	{
		model.addAttribute("test", "13");
		return "index";
	}
	@RequestMapping(value="/dologin",method=RequestMethod.POST)
	public void dologin(HttpServletRequest request,HttpServletResponse response)throws IOException, ServletException
	{

	
//		MultipartHttpServletRequest mRequest = (MultipartHttpServletRequest)request;
		//System.out.println(mRequest.getParameter("username"));
	
		/*System.out.println(file);
		System.out.println("123");

		System.out.println(request.getPart("img"));
		System.out.println("123");*/
		
		String username = request.getParameter("username").toString();
		System.out.println(username);
		System.out.println("123");
		response.setHeader("Content-type", "text/html;charset=UTF-8"); 
		response.getWriter().append(username);        
	}
}
