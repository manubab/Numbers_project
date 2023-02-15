package test;


 //Find factors ; complete
 //prime number checking
 //composite number
 



import java.util.Scanner;
public class Test1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int count=0;
		System.out.println("Enter the number :");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count++;
			}	
		}
		System.out.println(" Numbers of facters : "+count);
		if(count==2) {
			System.out.println("prime number : "+ n);
		}else {
			System.out.println("not prime :"+ n);
		}
		if(count>3) {
			System.out.println("Composite number : "+ count);
		}else {
			System.out.println("natural number : "+ count);
		}
	}
}