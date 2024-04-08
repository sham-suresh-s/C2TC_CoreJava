package com.tnsif.c2tc.dayone;

import java.util.Scanner;

public class Visitors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int guard1, guard2, minval, maxval;
        Scanner in= new Scanner(System.in);
        System.out.println("");
        guard1= in.nextInt();
        guard2= in.nextInt();
        if(guard1>guard2) {
        	minval=guard1;
        }
        else {
        	minval=guard2;
        }
        maxval=guard1+guard2;
        System.out.println(minval+" "+maxval);
	}

}
