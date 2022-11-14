package user.dao;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import lombok.Setter;
import user.bean.UserDTO;

//@Setter
//public class UserDAOImpl implements UserDAO{
//	private JdbcTemplate jdbcTemplate;
//	@Override
//	public void write(UserDTO userDTO) {
//		String sql="insert into usertable values(?,?,?)";
//		jdbcTemplate.update(sql, userDTO.getName(),userDTO.getId(),userDTO.getPwd());//Object ... args 매개변수의 갯수제한없음.
//	}
//	@Override
//	public List<UserDTO> getUserList() {
//		String sql="select * from usertable";
//		return jdbcTemplate.query(sql, new BeanPropertyRowMapper<UserDTO>(UserDTO.class)); //하나하나 set 해주는 대신 맵핑.
//	}
//}

@Setter
public class UserDAOImpl extends JdbcDaoSupport implements UserDAO{

	@Override
	public void write(UserDTO userDTO) {
		String sql="insert into usertable values(?,?,?)";
		getJdbcTemplate().update(sql, userDTO.getName(),userDTO.getId(),userDTO.getPwd());//Object ... args 매개변수의 갯수제한없음.
	}
	@Override
	public List<UserDTO> getUserList() {
		String sql="select * from usertable";
		return getJdbcTemplate().query(sql, new BeanPropertyRowMapper<UserDTO>(UserDTO.class)); //하나하나 set 해주는 대신 맵핑.
	}
	public UserDTO checkUser(String id) {
		String sql="select * from usertable where id=?";
		return getJdbcTemplate().queryForObject(sql, new BeanPropertyRowMapper<UserDTO>(UserDTO.class),id);	
	}
	@Override
	public void update(Map<String, String> map) {
		String sql="update usertable set name=?, pwd=? where id=?";
		getJdbcTemplate().update(sql,map.get("name"),map.get("pwd"),map.get("id"));
		
	}
}