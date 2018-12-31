package com.gavin.po;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.gavin.entity.User;
import com.gavin.mapper.UserMapper;

public class UserMapperImpl implements UserMapper{
	private SqlSessionFactory ssf = null;
	public UserMapperImpl(SqlSessionFactory ssf) {
		this.ssf = ssf;
	}
	@Override
	public List<User> selectAll() throws Exception {
		SqlSession sqlSession = ssf.openSession();
		UserMapper um = sqlSession.getMapper(UserMapper.class);
		List<User> list = um.selectAll();
		return list;
	}

}
