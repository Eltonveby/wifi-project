package com.example.demo;

import org.springframework.stereotype.Component;

@Component("mo")
public class modem {
	
		public void connection2 () {
			System.out.println("Bsnl is  Connecting...");
		System.out.println("Bsnl is Connected");
		}
		
		public void connection1() {
			System.out.println("Airtel is  Connecting...");
		System.out.println("Airtel is Connected");
		}
		

}