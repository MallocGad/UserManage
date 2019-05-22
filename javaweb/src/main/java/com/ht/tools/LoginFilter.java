package com.ht.tools;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * @deprecated 通过session实现登录验证
 * @author ht032
 * @since 2019/2/28
 * @deprecated 配置过滤器方式https://blog.csdn.net/weixin_37891479/article/details/79527641
 */
public class LoginFilter implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		

	}

}
