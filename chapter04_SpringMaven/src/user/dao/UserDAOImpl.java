package user.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import lombok.Setter;
import user.bean.UserDTO;

//@Component
@Repository //DB와 통신하는 빈객체
@Setter
//public class UserDAOImpl extends JdbcDaoSupport implements UserDAO{
public class UserDAOImpl extends NamedParameterJdbcDaoSupport implements UserDAO{
	@Autowired
	public void setDS(DataSource dataSource) {
		setDataSource(dataSource);
	} // overRide 하지 않기 위해 다른이름의 메소드 안에서 호출
	
	@Override
	public void write(UserDTO userDTO) {
//		String sql="insert into usertable values(?,?,?)";
//		getJdbcTemplate().update(sql, userDTO.getName(),userDTO.getId(),userDTO.getPwd());//Object ... args 매개변수의 갯수제한없음.
		String sql="insert into usertable values(:name,:id,:pwd)";
		
		//NamedParameterJdbcDaoSupport.myBatis처럼 사용. Map으로만 가져와야한다.
		Map<String, String> map = new HashMap<String, String>();
		map.put("name",userDTO.getName());
		map.put("id", userDTO.getId());
		map.put("pwd", userDTO.getPwd());
		//억지로 map에 넣어주기.
		getNamedParameterJdbcTemplate().update(sql, map);
	}
	@Override
	public List<UserDTO> getUserList() {
		String sql="select * from usertable";
		return getJdbcTemplate().query(sql, new BeanPropertyRowMapper<UserDTO>(UserDTO.class)); //하나하나 set 해주는 대신 맵핑.
	}
	public UserDTO checkUser(String id) {
		String sql="select * from usertable where id=:id";
		return getJdbcTemplate().queryForObject(sql, new BeanPropertyRowMapper<UserDTO>(UserDTO.class),id);	
	}
	@Override
	public void update(Map<String, String> map) {
		String sql="update usertable set name=:name, pwd=:pwd where id=:id";
		getJdbcTemplate().update(sql,map);	
	}
	@Override
	public void delete(Map<String, String> map) {
		String sql="delete usertable where id=:id";
		getJdbcTemplate().update(sql, map);	
	}
}