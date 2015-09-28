package com.lnc.springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.lnc.springmvc.bean.UserBean;

public class UserListController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {

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
