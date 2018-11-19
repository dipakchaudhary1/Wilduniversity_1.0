package com.wu.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.wu.bean.Admin;
import com.wu.dao.AdminDAO;



/**
 * This controller routes accesses to the application to the appropriate
 * hanlder methods. 
 *
 */
@Controller
public class LoginController {

	@Autowired
	AdminDAO adminDAO;
	
}
