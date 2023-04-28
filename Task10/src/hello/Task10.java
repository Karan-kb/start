package hello;

import java.io.*;


public class Task10 {
	public static void main (String[] args) throws IOException {
		String name;
		int age;
		double height;
		
		
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		
		
		System.out.println("Enter Your Name:");
		name=br.readLine();
		

		System.out.println("Enter Your Age:");
		age=Integer.parseInt(br.readLine());
		

		System.out.println("Enter Your Height:");
		height=Double.parseDouble(br.readLine());
		
		System.out.println("The name is "+ name);
		System.out.println("The age is "+ age);
		System.out.println("The height is "+ height);
		
		
		
	}

}
