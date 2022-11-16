package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	//HandlerMapper가 찾아올 위치. 
	@RequestMapping(value="/hello.do", method=RequestMethod.GET)
	public ModelAndView hello() { // 사용자가 만든 콜백메소드 hello.do가 호출되면 자동으로 hello()호출
		ModelAndView mav = new ModelAndView();
		mav.addObject("result", "스프링은 겁나 어렵다.");
		mav.setViewName("/WEB-INF/view/hello"); 	// /view/hello.jsp 스프링설정파일,viewResolver 통해서 생략.
						// WEB-INF안에 넣어서 외부에서 jsp로의 접근을 막는다.
									// /WEB-INF/서블릿이름-servlet.xml
		return mav;
	}
	
	@RequestMapping(value="/hello2.do", method=RequestMethod.GET, produces = "text/html; charset=UTF-8")
	@ResponseBody												// UTF-8 encoding
	public String hello2() {
//		return "Welcome";
		return "환영 안합니다";
		// 문자열을 반환하면 파일명으로 인식한다. (Welcom.jsp)
		// 단순 문자열로 나타내려면 @ResponseBody annotation
	}

	
}
// CallBack method 내가 부르지 않고 운영체제등이 자동으로 부르는 메소드