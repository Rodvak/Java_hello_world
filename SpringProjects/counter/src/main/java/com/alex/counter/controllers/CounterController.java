package com.alex.counter.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CounterController {

	
	@RequestMapping("/your_server")
	// We use HttpSession session because of dependency injection, HTTPSession is the TYPE and session is just a VARIABLE that holds HTTPSession.
	public String your_server(HttpSession session) {
			// "count" is just a KEY VARIABLE that holds a VALUE, in this case 0.
		if (session.getAttribute("count") == null) { // if count in session is null...
			// setAttribute initializes the count in session with the variable "count".
			session.setAttribute("count", 0); // Set 0 to count...
			}
			else { // else if someone is in session...
			// We need to increment the count by 1, so we use getAttribute and setAttribute.
			// We cast the info from session and convert it to INTEGER because once you save data in session it becomes an OBJECT TYPE.
			// GETATTRIBUTE gets the KEY VARIABLE "count" with its value 0
			Integer currentCount = (Integer) session.getAttribute("count");
			// Then, we UPDATE our variable "count" which was equal to 0 with SETATTRIBUTE and sum +1.
			//  Watch how we use the KEY VARIABLE "count", assign a NEW VALUE with  our created variable "currentCount" and sum +1.
			session.setAttribute("count", currentCount +1); // sum +1 to session count...
				
			}
		
			return "index.jsp";
	}
	
	// This counter function could be in your_server function and show the  count in the same page index.jsp. BUT the assignment want us to create another site and show it there.
	// So, I could get rid of everything and just add Model model injection, add line 41 to the upper function and ${countShow} would be at index.jsp
	@RequestMapping("/your_server/counter") 
	public String counter(HttpSession session, Model model) {
		Integer currentCount = (Integer) session.getAttribute("count");
		
		model.addAttribute("countToShow", currentCount);
		
		return "counter.jsp";
	}
}
