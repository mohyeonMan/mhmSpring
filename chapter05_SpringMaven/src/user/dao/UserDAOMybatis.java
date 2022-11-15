package user.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import lombok.Setter;
import user.bean.UserDTO;

@Repository
@Transactional
//applicationContext에서 만든 transaction manager로 transaction 관리.
public class UserDAOMybatis implements UserDAO{
	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public void write(UserDTO userDTO) {
		sqlSession.insert("userSQL.write",userDTO);
	}

	@Override
	public List<UserDTO> getUserList() {
		return sqlSession.selectList("userSQL.getList");
	}

	@Override
	public UserDTO checkUser(String id) {
		return sqlSession.selectOne("userSQL.getUser",id);
	}

	@Override
	public void update(Map<String, String> map) {
		sqlSession.update("userSQL.update",map);		
	}

}
