package com.ht;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication()//暂时还没有配置数据库所以先排除
public class DocumentApp {

	public static void main(String[] args) {
	
		SpringApplication.run(DocumentApp.class, args);
		
	}
	
	
}
