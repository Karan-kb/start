package tst2;

import java.util.Scanner;
public class Task3 {
 public static void main(String[] args){
 Scanner input = new Scanner(System.in);
 System.out.println("\n Enter 1 for Addition \n Enter 2 for Subtraction \n Enter 3 for 
Multiplication \n Enter 4 for Division \n Enter 5 for Increment \n Enter 6 for Decrement \n 
Enter your choice:");
 int choice = input.nextInt();
 switch (choice){
 case 1:
 System.out.println("Enter the 1st number:");
 int num1 = input.nextInt();
 System.out.println("Enter the 2nd number:");
 int num2= input.nextInt();
 int result = num1+num2;
 System.out.println("Result is :" + result);
 break;
 case 2:
 System.out.println("Enter the 1st number:");
 num1= input.nextInt();
 System.out.println("Enter the 2nd number:");
 num2 = input.nextInt();
 result= num1-num2;
 System.out.println("Result is :" + result);
 break;
 case 3:
 System.out.println("Enter the 1st number:");
 num1 = input.nextInt();
 System.out.println("Enter the 2nd number:");
 num2 = input.nextInt();
 result = num1*num2;
 System.out.println("Result is :" + result);
 break;
 case 4:
 System.out.println("Enter the 1st number:");
 num1 = input.nextInt();
 System.out.println("Enter the 2nd number:");
 num2 = input.nextInt();
 result = num1/num2;
 System.out.println("Result is :" + result);
 break;
 case 5:
 System.out.println("Enter the number:");
 num1= input.nextInt();
 num1= ++num1;
 System.out.println("Result is :" + num1);
 break;
 case 6:
 System.out.println("Enter the number:");
 num1= input.nextInt();
 num1 = --num1;
 System.out.println("Result is :" + num1);
 break;
 default:
 System.out.println("Invalid input");
 }
 }
}