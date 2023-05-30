package com.assignmentTwoDimensional;

import java.util.Scanner;

import com.TwoDimensional.LowerMatrixOfArray;

public class Question12 {
	public static void lowerLeftMatrixOfArray(int a[][])
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(i>=j)
				{
					System.out.print(a[i][j]+ " ");
					sum=sum+a[i][j];
				}
			}
			System.out.println();
		}
		System.out.println("Sum of lower matrices:"+sum);
	}
	public static void upperLeftMatrixOfArray(int a[][])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(i<=j)
				{
					System.out.print(a[i][j]+ " ");
				}
			}
			System.out.println();
		}
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter row size");
	int rSize=sc.nextInt();
	System.out.println("Enter column size");
	int cSize=sc.nextInt();
	int a[][]=new int [rSize][cSize];
	System.out.println("Enter array elements:");
	for(int i=0; i<a.length;i++)
	{
		for(int j=0; j<a[i].length;j++)
		{
			a[i][j]=sc.nextInt();
		}
	}
	for(int x[]:a)
	{
		for(int y:x)
		{
			System.out.print(y+" ");
		}
		System.out.println();
	}
	System.out.println("=====================================");
	System.out.println("Lower left Matrix of array");
	Question12.lowerLeftMatrixOfArray(a);
	System.out.println("======================================");
	System.out.println("Upper left matrix of array");
	Question12.upperLeftMatrixOfArray(a);
}
}
