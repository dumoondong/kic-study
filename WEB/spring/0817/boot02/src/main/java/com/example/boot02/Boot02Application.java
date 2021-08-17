package com.example.boot02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class Boot02Application implements CommandLineRunner{

	@Autowired
	private DataSource dataSource;
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public static void main(String[] args) {
		SpringApplication.run(Boot02Application.class, args);
	}
	
	public void run(String... args) throws Exception {
		System.out.println("Hello Spring Boot");
		
		System.out.println(jdbcTemplate);
		
		//현재 시간
		String result = jdbcTemplate.queryForObject("select now() as now", String.class);
		System.out.println("현재시간 : " + result);
		
	}
}
