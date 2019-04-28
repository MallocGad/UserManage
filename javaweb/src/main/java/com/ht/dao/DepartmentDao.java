package com.ht.dao;

import java.util.List;
import java.util.Map;

/**
 * 定义部门表的查找接口
 * @author ht032
 *2019/4/25
 */
public interface DepartmentDao {
	public void addDepartMent();
	public void deletDepartMentById();
	public void editDepartmentById();
	public List<Map<String,Object>> selectAllDepartment();
}
