package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class Home {
 private String Owner;
 private int doorNo;

@Autowired
@Qualifier("air")
 private Airtel air;
@Autowired
@Qualifier("bs")
private Bsnl bs;
 @Autowired
 @Qualifier("mo")
 private  modem mo;

 
 public String getOwner() {
	 return Owner;
 }
 public void setOwner(String Owner) {
	this.Owner= Owner;
 }
 public int getdoorNo() {
	 return doorNo;
 }
 public void setdoorNo(int doorNo) {
	this.doorNo= doorNo;
 }
 public void Airconnect()
 {
	  mo.connection1();
	 air.con();
  
  
   }
 public void bsconnect()
 {
	 mo.connection2();
	 bs.con();
   
 }
 
 
}
