package  com;
import java.util.Scanner;

public class ThrowKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the age");
		age=sc.nextInt();
		try {
		if(age>=21) {
			System.out.println("you can vote!");
		}
		else {
			throw new Exception("age must be 21");
		}
		}catch(Exception e) {
			System.out.println(e.toString());
			
		}

	}

}
