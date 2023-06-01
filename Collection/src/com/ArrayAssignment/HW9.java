package com.ArrayAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class HW9 {
	public static void arrangArray(int a[])
	{
		int l=0;
		int r=a.length-1;
		while(l<r)
		{
			if(a[l]%2==0 &&a[r]%2!=0)
			{
				l++;
				r--;
			}
			else if(a[l]%2!=0 && a[r]%2==0)
			{
				int temp=a[l];
				a[l]=a[r];
				a[r]=temp;
				l++;
				r--;
			}
			else if(a[l]%2==0 && a[r]%2==0)
			{
				l++;
			}
			else if(a[l]%2!=0 && a[r]%2!=0)
			{
				r--; 
			}
		}
		 
		System.out.println(Arrays.toString(a));
		 
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter thye size of array");
	int size= sc.nextInt();
	int a[]= new int[size];
	for(int i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();
	}
	HW9.arrangArray(a);
}
}
