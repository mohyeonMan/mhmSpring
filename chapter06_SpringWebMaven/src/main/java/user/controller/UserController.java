package user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import user.bean.UserDTO;
import user.service.UserService;


@Component
@RequestMapping(value = "user")
public class UserController {
	@Autowired
	private UserService userService;
	
	@GetMapping(value = "writeForm")
	public String writeForm() {
		return "/user/writeForm";
	}
	
	@PostMapping(value = "write")
	@ResponseBody //servlet으로 돌아가지 않고 ajax로 돌아가기 위해.
	public void write(@ModelAttribute UserDTO userDTO) {
		userService.write(userDTO);
	}
	
	@PostMapping(value = "checkId")
	@ResponseBody
	public String checkId(@RequestParam String id) {
		return userService.checkId(id)+"";
	}
}


