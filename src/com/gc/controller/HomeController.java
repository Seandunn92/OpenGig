package com.gc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/*
 * author: Antonella Solomon
 *
 */

@Controller
public class HomeController {

	@RequestMapping("/welcome")
	public ModelAndView helloWorld() {

		String message = "<br><div style='text-align:center;'>"
				+ "<h3>This message is coming from HomeController.java</h3>";
		return new ModelAndView("welcome", "message", message);
	}

	@RequestMapping("/admin")
	public ModelAndView AdminPage() {

		String message = "<br><div style='text-align:center;'>"
				+ "<h3>Welcome Admin!</h3>";
		return new ModelAndView("admin", "message", message);
	}

	@RequestMapping("/comedian")
	public ModelAndView ComedianPage() {

		String message = "<br><div style='text-align:center;'>"
				+ "<h3>Welcome Comedian!</h3>";
		return new ModelAndView("comedian", "message", message);
	}

	@RequestMapping("/comedianAfterAA")
	public ModelAndView ComedianAfterAnnArborClickedPage() {

		String message = "<br><div style='text-align:center;'>"
				+ "<h3>Welcome Comedian!</h3>";
		return new ModelAndView("comedianAfterAA", "message", message);
	}

	@RequestMapping("/addMatt")
	public ModelAndView AdminAfterMattAdded() {

		String message = "<br><div style='text-align:center;'>"
				+ "<h3>Welcome Comedian!</h3>";
		return new ModelAndView("adminAfterMatt", "message", message);
	}

	@RequestMapping("/removeJim")
	public ModelAndView AdminAfterJimRemoved() {

		String message = "<br><div style='text-align:center;'>"
				+ "<h3>Welcome Comedian!</h3>";
		return new ModelAndView("adminAfterJim", "message", message);
	}
}
