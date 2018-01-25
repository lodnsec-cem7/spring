package com.game.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


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
	@ResponseBody
	public Map<String,String> index(Model model)
	{
		Map<String,String> result = new HashMap();
		result.put("aa","123");
		result.put("bb","dsads");
		//model.addAttribute("test", "13");
		return result;
	}
	@RequestMapping(value="/dologin",method=RequestMethod.POST)
	public void dologin(HttpServletRequest request,HttpServletResponse response,String username,MultipartFile img)throws IOException, ServletException
	{
		System.out.println(username);
		System.out.println(img);
		System.out.println(img.getOriginalFilename());

//		MultipartHttpServletRequest mRequest = (MultipartHttpServletRequest)request;
		//System.out.println(mRequest.getParameter("username"));
	
		/*System.out.println(file);
		System.out.println("123");

		System.out.println(request.getPart("img"));
		System.out.println("123");*/
		
//		String username = request.getParameter("username").toString();
		System.out.println(username);
		System.out.println("123");
		response.setHeader("Content-type", "text/html;charset=UTF-8"); 
		response.getWriter().append(username);



	}
}
