package com.su.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddController {

		@RequestMapping(value="/add", method = RequestMethod.GET)
		public ModelAndView addMe(@RequestParam String a1, @RequestParam String a2) {
			//System.out.println(a1);
			//System.out.println(a2);
			int i = Integer.parseInt(a1);
			int j = Integer.parseInt(a2);
			int k = i + j;
			
			ModelAndView result = new ModelAndView("display");
			result.addObject("result",k);
			System.out.println(System.getenv("POSTGRESQL_USER"));
			System.out.println(System.getenv("POSTGRESQL_PASSWORD"));
			return result;
		}
}
