package Pack1;

import java.util.Scanner;

public class Assignment {

	public static void main(String[] args) {
		//Addition
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int sum=a+b;
		System.out.println(sum);
		
		//subtraction
		int x=s.nextInt();
		int y=s.nextInt();
		int diff=x-y;
		System.out.println(diff);
		
		//multiplication
		int p=s.nextInt();
		int q=s.nextInt();
		int prod=p*q;
		System.out.println(prod);
		
		//division
		int m=s.nextInt();
		int n=s.nextInt();
		int qt=m/n;
		System.out.println(qt);
	}

}
