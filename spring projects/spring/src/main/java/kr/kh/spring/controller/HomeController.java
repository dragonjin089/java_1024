package kr.kh.spring.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 * @return 
	 */
	@RequestMapping(value = "/")
	public ModelAndView home(ModelAndView mv) {
		mv.setViewName("/main/home");
		return mv;
	}
	@RequestMapping(value = "/ex1")
	public ModelAndView ex1(ModelAndView mv,String name, Integer age) {
		System.out.println("예제 1 = 화면에서 서버로 전달한이름  " +name);
		System.out.println("예제 1 = 화면에서 서버로 전달한이름  " +age);
		
		mv.setViewName("/main/ex1");
		return mv;
	}
	@RequestMapping(value = "/ex2")
	public ModelAndView ex2(ModelAndView mv,String name, Integer age) {
		System.out.println("예제 1 = 화면에서 서버로 전달한이름  " +name);
		System.out.println("예제 1 = 화면에서 서버로 전달한이름  " +age);
		
		mv.setViewName("/main/ex2");
		return mv;
	}
	@RequestMapping(value = "/ex3")
	public ModelAndView ex3(ModelAndView mv) {
		
		mv.setViewName("/main/ex3");
		return mv;
	}
	@RequestMapping(value = "/ex3/{name}/{age}")
	public ModelAndView exNameAge3(ModelAndView mv ,@PathVariable("name")String name,
			@PathVariable("age")int age) {
		System.out.println("예제 3 = 화면에서 서버로 전달한이름  " +name);
		System.out.println("예제 3 = 화면에서 서버로 전달한이름  " +age);
		
		mv.setViewName("/main/ex3");
		return mv;
	}
	@RequestMapping(value = "/ex4")
	public ModelAndView ex4(ModelAndView mv) {
		//서버에서 화면으로 이름과 나이를 전
		// -화면에서 호출할 이름(변수명) 과 값을 지정
		// -addObject메소드를 통해서 
		mv.addObject("name","둘리");
		mv.addObject("age","10000");
		
		mv.setViewName("/main/ex4");
		return mv;
	}
}
