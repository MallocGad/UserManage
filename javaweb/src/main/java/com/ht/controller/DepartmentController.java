package com.ht.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 实现对部门的访问，返回主要为数据
 * @author ht032
 *2019/4/25
 */
@RestController
public class DepartmentController {
	@RequestMapping("/getdepartments")
	public String getDepString() {
		return "部门！！！";
	}
}
