package test;

public class Test {
	public void ams(int n) {
		int ams=0;
		while(n>0) {	
			int k=n%10;
			n=n/10;
			ams=ams+(k*k*k);
			
	
	}
		if(ams==n) {
			System.out.println("its amstong number");
		}else {
			System.out.println("its not amstong number");
		}
		
	}
	
	
}
		                           
		
		
		
	
	


