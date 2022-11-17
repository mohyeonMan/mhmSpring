package user.service;

import org.springframework.stereotype.Service;

import user.bean.UserDTO;

public interface UserService {

	public void write(UserDTO userDTO);

	public int checkId(String id);

}
