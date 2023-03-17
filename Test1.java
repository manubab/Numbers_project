package test;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value");
		int n=sc.nextInt();
		int Nang=0;
		
		for(int i=1;i<=n;i++){
			for(int j=0;j<=i;i++) {
				while(n>0) {
					int k=n%10;
					n=n/10;
					Nang=Nang+(k*k*k);
					int count = 0;
					count++;
					System.out.println("amsstong numbers"+count);
				}
				
			}
		
			
		}
	}

}
