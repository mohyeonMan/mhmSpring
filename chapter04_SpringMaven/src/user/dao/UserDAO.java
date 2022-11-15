package user.dao;

import java.util.List;
import java.util.Map;

import user.bean.UserDTO;

public interface UserDAO {

	public void write(UserDTO userDTO);

	public List<UserDTO> getUserList();

	public UserDTO checkUser(String id);

	public void update(Map<String, String> map);

	void delete(Map<String, String> map);

}
