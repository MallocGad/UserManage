package com.ht.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 实现对文档的访问，返回主要为数据
 * @author ht032
 *2019/4/25
 */
@Controller
public class DocumetController {
	@RequestMapping("/hello")
	public String hello() {
		return "index.html";
	}
}
