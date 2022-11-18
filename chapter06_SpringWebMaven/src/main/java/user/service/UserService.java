package user.service;

import java.util.List;

import org.springframework.stereotype.Service;

import user.bean.UserDTO;

public interface UserService {

	public void write(UserDTO userDTO);

	public int checkId(String id);

	public List<UserDTO> getList();

	public UserDTO getUser(String result);

}
