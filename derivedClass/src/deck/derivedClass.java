package deck;


	class baseClass{
		int x= 220;
		
		baseClass(){
			System.out.println("In the base class....");
			
		}
		
		public void display() {
			System.out.println("value of x is:"+x);
		}
		
	}
	
	public class derivedClass extends baseClass{
		derivedClass(){
			System.out.println("In the delivevered class..");
		}
		public static void main(String [] args) {
			derivedClass d1=new derivedClass();
			d1.display();
		}
	}


