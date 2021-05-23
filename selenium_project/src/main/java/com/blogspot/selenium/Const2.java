package com.blogspot.selenium;

public class Const2 extends Const{
	
	
	Const2(){
		super();
		System.out.println("child cons defold");
	}
	Const2(int i){
		super(12);
		System.out.println("child 2 cons with arguments:::::::::::::"+i);
		
	}
	
	
	

	public static void main(String[] args) {
		
		Const2 c= new Const2();
		Const2 c1= new Const2(22);
		
	}

}
