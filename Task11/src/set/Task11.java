package set;

public class Task11 {
	public static void main(String [] args) {
		try {
			int arr[]=new int[3];
			int x=30/0;
			
			for(int i=0;i<5;i++) {
				System.out.println(arr[5]);
			}
			
			
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic exceptiton found."+e);
				}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array JNdex exceptiton found."+e);
		}
		finally{
			System.out.println("The exception is found.");
		}
		
	}

}
