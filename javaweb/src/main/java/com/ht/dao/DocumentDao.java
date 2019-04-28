package com.ht.dao;

import java.util.List;
import java.util.Map;

/**
 * 定义文档表查找接口
 * @author ht032
 *2019/4/25
 */
public interface DocumentDao {
	public void addDocument();
	public void deleteDocumentById();
	public void editDocumentById();
	public List<Map<String,Object>> selectAllDocument();
	public void selectDocumentByDepatId();
}
