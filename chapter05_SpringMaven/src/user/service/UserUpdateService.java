package user.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.Setter;
import user.bean.UserDTO;
import user.dao.UserDAO;

@Service
public class UserUpdateService implements UserService{
	@Autowired
	private UserDAO userDAO;
	@Override
	public void execute() {
		Scanner scan = new Scanner(System.in);
		System.out.print("\n수정 할 아이디 입력 : ");
		String id = scan.next();
		
		UserDTO userDTO = userDAO.checkUser(id);
		if(userDTO == null) {
			System.out.println("일치하는 아이디가 없습니다.");
			return;
		}else {
			System.out.println("\n\n"+userDTO.getName()+"\t"+userDTO.getId()+"\t"+userDTO.getPwd()+"\n\n");
			
			Map<String, String> map = new HashMap<String, String>();
			map.put("id", id);
			System.out.print("수정 할 이름 : ");
			map.put("name", scan.next());
			System.out.print("수정 할 비밀번호 : ");
			map.put("pwd", scan.next());
			
			userDAO.update(map);
			
			System.out.println("수정 완료.");

		}
		
		
	}

}
