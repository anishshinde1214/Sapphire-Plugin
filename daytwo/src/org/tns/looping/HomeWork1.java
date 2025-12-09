package org.tns.looping;

import java.util.Scanner;

public class HomeWork1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner Scanner = new Scanner(System.in);
	        System.out.println("Enter the number of rows  ");
	        int rows = Scanner.nextInt();

	        for (int i = 1; i <= rows; i++)
	        {
	            for (int j = rows; j > i; j--)
	            {
	                System.out.print(" ");
	            }
	            for (int k = 1; k <= i; k++)
	            {
	                System.out.print(k + " ");
	            }
	            System.out.println();
	            
		}

	        
	        
	}

}
