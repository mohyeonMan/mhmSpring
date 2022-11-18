package user.dao;

import java.util.List;

import user.bean.UserDTO;

public interface UserDAO {

	public void write(UserDTO userDTO);

	public int checkId(String id);

	public List<UserDTO> getList();

	public UserDTO getUser(String result);

}
