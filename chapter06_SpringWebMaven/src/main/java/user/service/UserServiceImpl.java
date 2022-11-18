package user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import user.bean.UserDTO;
import user.dao.UserDAO;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserDAO userDAO;
	
	@Override
	public void write(UserDTO userDTO) {
		userDAO.write(userDTO);
	}

	@Override
	public int checkId(String id) {
		return userDAO.checkId(id);
	}

	@Override
	public List<UserDTO> getList() {
		return userDAO.getList();
	}

	@Override
	public UserDTO getUser(String result) {
		return userDAO.getUser(result);
	}

}
