package com.example.demo;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import java.util.*;
@SpringBootApplication
public class WifiProjectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext net1 =SpringApplication.run(WifiProjectApplication.class, args);
		
		Home h=net1.getBean(Home.class);
		
	
		Scanner s =new Scanner(System.in);
	    System.out.println("type air for AIRTEL or bs for BSNL");
	    String si= s.nextLine();
		if(si.equals("air")) {
		 h.Airconnect();
		}
		else if(si.equals("bs")) {
			h.bsconnect();
		}
		 else {
		System.out.println("wrong ");
		 }
	  s.close();
	
	}
	

}
