package calc.operation.entity;

//This class contains all the arithmetic operations
public class CalcLogic {
	
	public static int addNo(int num1,int num2)
	{
		return num1+num2;
	}
	public static int subNo(int num1,int num2)
	{
		return num1-num2;
	}
	public static double multiNo(double num1,double num2)
	{
		return num1*num2;
	}
	public static double divNo(double num1,double num2) throws ArithmeticException
	{
		
		if (num2 == 0)
		{
			throw new  ArithmeticException("Divide by zero is not possible");
		}
	
        return num1/num2;
	}

}
