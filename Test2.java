package test;

// perfect number; 

import java.util.Scanner;
public class Test2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum=0;
		System.out.println("Enter the number :");
		int n=sc.nextInt();
		
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				sum=sum+i;
			}	
		}
		if(sum==n) {
			System.out.println("perfect number : "+ sum);
		}else {
			System.out.println("not perfect number : "+ sum);
		}	
	}
}