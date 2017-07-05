package com.haley.join.dao;

import java.util.List;

import com.haley.join.domain.Join;

public interface JoinDao {
	
	// CRUD
	
	// CREATE : insert
	public int insert(Join join);
	
	// READ : selectAll, selectOne
	public List<Join> selectAll();
	
	public Join selectOne(String email);
	
	// Update 
	public int update(Join join);
	
	// Delete
	public int delete(String email);

}
