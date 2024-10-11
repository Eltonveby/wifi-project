package com.example.demo;

import org.springframework.stereotype.Component;

@Component("air")
public class Airtel implements Net_connection{
	public void con() {
		System.out.println("Welcom to Airtel,leading telecom company in India");
	}
	

}
