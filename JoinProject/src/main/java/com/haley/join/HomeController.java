package com.haley.join;

import java.sql.Connection;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.haley.join.dao.JoinDao;
import com.haley.join.domain.Join;

@Controller
public class HomeController {

	@Autowired
	private JoinDao joinDao;

	@Autowired
	DataSource ds;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {


		return "home";
	}

	// 회원가입 페이지로 이동
	@RequestMapping(value = "join.do", method = RequestMethod.GET)
	public String toJoin(Locale locale, Model model) {

		return "join";
	}

	// 회원가입 버튼 입력
	@RequestMapping(value = "join", method = RequestMethod.POST)
	public String join(Join join) {

		System.out.println(join);

		return "join";
	}

}
