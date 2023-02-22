package kr.kh.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import kr.kh.test.service.AdminService;

public class AdminController {

	@Autowired
	AdminService adminService;
	
	@RequestMapping(value = "/admin/board/type/list", method = RequestMethod.GET)
	public ModelAndView boardtypelist(ModelAndView mv) {
		mv.setViewName("/admin/boardTypeList");
		return mv;
	}
}
