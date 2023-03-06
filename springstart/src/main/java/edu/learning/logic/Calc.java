package edu.learning.logic;

public class Calc {
	
	public static int addNo(int n1,int n2)
	{
		return n1+n2;
	}
	public static int subNo(int n1,int n2)
	{
		return n1-n2;
	}
	public static double multiNo(double n1,double n2)
	{
		return n1*n2;
	}
	public static double divNo(double n1,double n2) //throws ArithmeticException
	{

//		if (n2 == 0)
//		{
//			throw new  ArithmeticException("Divide by zero is not possible");
//		}
//		else
		return n1/n2;
	}

}
