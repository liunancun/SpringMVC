package com.lnc.springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.lnc.springmvc.bean.UserBean;

@Controller
public class UserController {

	@RequestMapping("/list")
	public ModelAndView list() {

		List<UserBean> users = new ArrayList<UserBean>();

		UserBean user = null;
		for (int i = 0; i < 10; i++) {
			user = new UserBean();
			user.setName(i + 1 + "-NAME");
			users.add(user);
		}

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("users", users);
		modelAndView.setViewName("/user/list");

		return modelAndView;
	}

}
