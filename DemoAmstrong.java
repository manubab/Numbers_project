package nit;
import java.util.Scanner;

import test.Test;
public class DemoAmstrong {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		
		Test t=new Test();
	    t.ams(sc.nextInt());
	    sc.close();
		
	}

}
