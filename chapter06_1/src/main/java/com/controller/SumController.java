package com.controller;


import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bean.SumDTO;

@Controller
public class SumController {
	
	@RequestMapping(value = "/input.do", method = RequestMethod.GET)
//	@GetMapping(value="/input.do")
	public String input() {
		return "/sum/input";
	}
//	@RequestMapping(value = "/result.do", method = RequestMethod.GET)
//	public ModelAndView result(@RequestParam(required = false, defaultValue = "0") int x,
//								@RequestParam(required = false, defaultValue = "0") int y) {
//		ModelAndView mav = new ModelAndView();
//		SumDTO sumDTO =new SumDTO();
//		sumDTO.setX(x);
//		sumDTO.setY(y);
//		mav.addObject("sumDTO",sumDTO);
//		mav.setViewName("/sum/result");
//		
//		return mav;
//	}
	
//	@GetMapping(value = "/result.do")
//	public String result(@RequestParam Map<String, String> map, ModelMap modelMap) {
//		modelMap.put("x", map.get("x"));
//		modelMap.put("y", map.get("y"));	
//		
//		return "/sum/result";
//	}
	
	@GetMapping(value = "/result.do")
	public String result(@ModelAttribute SumDTO sumDTO, Model model) {
		model.addAttribute("x",sumDTO);
		
		return "/sum/result";
	}
}
