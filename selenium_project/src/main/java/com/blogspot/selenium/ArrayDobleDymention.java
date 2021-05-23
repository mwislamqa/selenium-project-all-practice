package com.blogspot.selenium;

public class ArrayDobleDymention {

	public static void main(String[] args) {
		String s[][]= new String [3][3];
	        s[0][0]="a";
			s[0][1]="b";
			s[0][2]="c";
		
		
			s[1][0]="a";
			s[1][1]="b";
			s[1][2]="c";
		
		  s[2][0]="a";
		  s[2][1]="b";
		  s[2][2]="c";
		
		//print row size
			System.out.println(s.length);
			//print column size
			System.out.println(s[0].length);
			
			//print row 2 and column 1 value
			System.out.println(s[2][1]);
			
			// print all 
			
			for(int row=0;row<s.length;row++) {
				for(int column=0;column<s[0].length;column++) {
					System.out.print("  "+s[row][column]);
				}
				System.out.println();
			}
			
			
			
					
		
	

	}

}
