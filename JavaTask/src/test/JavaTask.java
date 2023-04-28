package test;

public class JavaTask {
	
	public static void main(String[] args) {
		
		int demo []={126, 32, 230, 21, 200};
		
		int repub []= {152, 85, 121, 215, 13};
		
		int total_demo=0;
		
		int total_repub=0;
		
		for(int i=0;i<5;i++) {
			
			total_demo=total_demo+ demo[i];
			total_repub=total_repub+repub[i];
		}
		System.out.println("The total of democratic party is:"+total_demo);
		
		System.out.println("The total of republic party is:"+total_repub);
		
		
		if(total_demo>total_repub) {
			System.out.println("The democratic party won.");
			
		}else {
			System.out.println("The republic party won.");
		}
		
		
		
	}

}
