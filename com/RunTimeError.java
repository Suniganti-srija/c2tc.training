package com;

public class RunTimeError {

	public static void main(String[] args) {
		System.out.println("hello");
		// TODO Auto-generated method stub
		int a=10;
		int b=0;
		try {
		int c=a/b;
		System.out.println("the division result is");
		}catch(Exception e) {
			//System.out.println("exception");
			//System.out.println(e.getMessage());
			System.out.println(e.toString());
		}

	}

}
