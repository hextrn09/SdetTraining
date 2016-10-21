package com.fanniemae;

public class JenkinsGitEx1{
	public static void main(String[] args) {
		System.out.println("Hiiiiii Welcome to Git and Jenkins");
		
		addNumbers(1,2);
			subtractNumbers(5,3);
	}
	
	public void addNumbers(int a, int b){
		System.out.println("Result of adding " + a + " and " + b + " is: " + (a+b));
	}
	
	public static void subtractNumbers(int a, int b){
		System.out.println("Result of subtracting " + a + " and " + b + " is: " + (a-b));
	}

}