package Pack1;

import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		String str=Integer.toString(n);
		int i=0,j=str.length()-1;
		boolean isPal=true;
		while(i<j) {
			if(str.charAt(i)!=str.charAt(j)) {
				isPal=false;
				break;
			}else {
				i++;
				j--;
			}
		}
		System.out.println(isPal);
	}

}
