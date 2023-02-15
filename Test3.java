package test;
import java.util.*;
public class Test3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		int n=sc.nextInt();
		int sum=0;
		
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				sum=sum+i;
			}
		}
		if(sum>n) {
			System.out.println("Abundant number : "+ sum);
		}else {
			System.out.println("not Abundant number :"+ sum);
		}
		
		
	}

}
