package test;
import java.util.Scanner;
public class Test5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		int n=sc.nextInt();
		int fact=0;
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				if(i*(i+1)==n)
					fact=i;
			}
			
		}
		if(fact!=0) {
			System.out.println("prolog number");
		}else {
			System.out.println("not prolog number");
		}

	}

}
