package com.haley.join.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.haley.join.domain.Join;

@Repository // 이 클래스의 객체를 자동으로 생성해달라는 요청
public class JoinDaoImpl implements JoinDao {

	// SQLSession 변수 선언
	@Autowired // 동일한 자료형으로 만들어진 객체가 있으면 자동으로 연결
	private SqlSession session;

	@Override
	public int insert(Join join) {
		/*
		 * <mapper namespace="Join"> <!-- 1. public int insert(Join join) -->
		 * <insert id="insert" parameterType="com.haley.join.domain.Join">
		 */
		return session.insert("Join.insert", join);
	}

	@Override
	public List<Join> selectAll() {
		// TODO Auto-generated method stub
		return session.selectList("Join.selectAll");
	}

	@Override
	public Join selectOne(String email) {
		// TODO Auto-generated method stub
		return session.selectOne("Join.selectOne", email);
	}

	@Override
	public int update(Join join) {
		// TODO Auto-generated method stub
		return session.update("Join.update", join);
	}

	@Override
	public int delete(String email) {
		// TODO Auto-generated method stub
		return session.delete("Join.delete", email);
	}

}
