package jisu;

import java.util.Scanner;

public class baek2441 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
		for(int i=0; i<num; i++) {
			for(int j=0; j<num; j++) {
				if(j>=i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			} //for-j
			System.out.println();
		} //for-i
	} //main
} //end class
