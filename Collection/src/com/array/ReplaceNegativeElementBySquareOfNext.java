package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class ReplaceNegativeElementBySquareOfNext {
   public static void replaceElement(int a[])
   {
	   System.out.println(Arrays.toString(a));
	   for(int i=0; i<a.length;i++)
	   {
		   if(a[i]<0)
		   {
			   a[i]=a[i+1]*a[i+1];
		   }
	   }
	   System.out.println(Arrays.toString(a));
   }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter arr1 size");
		int size= sc.nextInt();
		int a[]=new int[size];
		
		for(int i=0; i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		ReplaceNegativeElementBySquareOfNext.replaceElement(a);
	}
}
