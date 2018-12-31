package com.gavin.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.gavin.entity.User;
import com.gavin.mapper.UserMapper;
import com.gavin.po.UserMapperImpl;

public class MapperTest01 {
	private UserMapperImpl umi = null;
	@Before
	public void init() throws IOException {
		InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
		SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(inputStream);
		umi = new UserMapperImpl(ssf);
	}

	@Test
	public void selectAllUser() throws Exception {
		List<User> list = umi.selectAll();
		for (User user : list) {
			System.out.println(user);
		}
	}
}
