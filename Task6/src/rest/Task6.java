package rest;

 
	class baseClass{
		int x= 220;
		
		baseClass(){
			System.out.println("In the base class....");
			
		}
		
		public void display() {
			System.out.println("In the base class display()");
		}
		
	}
	
	public class Task6 extends baseClass{
		Task6(){
			System.out.println("In the delivevered class..");
		}
		
		public void display(){
			System.out.println("In the derived class display()");
		}
		public static void main(String [] args) {
			baseClass d1=new Task6();
			d1.display();
		}

}
