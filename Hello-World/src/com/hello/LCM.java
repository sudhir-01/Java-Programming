package com.hello;

import java.util.Scanner;

public class LCM {
	
	public static int findLCM(int a, int b) {
		
		if(a==0 || b==0) {
			System.out.println("Please enter only non-zero positive integers!!");
			System.exit(1);
		}
		
		int max = (a>=b)?a:b;
		//int i = 1;
		
		while(true) {
			
			//Method 1 --> Incrementing max by 1 each time until we find LCM
			if(max%a==0 && max%b ==0)
				return max;
			max++;
			
			//Method 2[Efficient] --> Incrementing max to its next multiple
//			if(((max*i)%a==0) && ((max*i)%b==0)) 
//				return max*i;
//			i++;
			
		}
	}

	public static void main(String[] args) {
		
		int a,b,lcm;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter two positive integers:");
		a = sc.nextInt();
		b = sc.nextInt();
		
		lcm = findLCM(a, b);
		
		System.out.println("LCM of given numbers is: "+ lcm);
		sc.close();

	}

}
