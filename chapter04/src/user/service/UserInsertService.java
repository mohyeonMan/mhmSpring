package user.service;

import java.util.Scanner;

import lombok.Setter;
import user.bean.UserDTO;
import user.dao.UserDAO;

@Setter
public class UserInsertService implements UserService {
	private UserDTO userDTO;
	private UserDAO userDAO;

	@Override
	public void execute() {
	//데이터
		Scanner scan = new Scanner(System.in);
		System.out.print("이름 입력 : ");
		userDTO.setName(scan.next());
		System.out.print("아이디 입력 : ");
		userDTO.setId(scan.next());
		System.out.print("비밀번호 입력 : ");
		userDTO.setPwd(scan.next());
		
	//DB
		userDAO.write(userDTO);
		
	//응답
		System.out.println("\n\nDB 작성 완료.\n\n");
	}

}
