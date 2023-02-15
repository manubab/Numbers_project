package test;


 //Find factors ; complete
 //prime number checking
 //Composite number
 //perfect Numbers or not(only factors sum)
 //Abundant Number
 //Deficient number
 //Prong numbers (product of 2 consecutive numbers)



import java.util.Scanner;
public class Test {
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
	}
}