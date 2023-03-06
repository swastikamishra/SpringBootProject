package edu.learning.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.learning.logic.Calc;

@RestController
public class CalculatorDemo {
    
//	@GetMapping("/calculator")
//	public double calculate(@RequestParam(value = "n1",required = true,defaultValue = "1") double n1,
//			@RequestParam(value = "n2",required = true,defaultValue = "2" )double n2,
//			@RequestParam (value = "operation",required = true) String operation )
//	{
//		if(operation.equalsIgnoreCase("add"))
//		
//		return n1 + n2;
//		
//		else if (operation.equalsIgnoreCase("sub"))
//			
//		return n1 - n2;
//		
//		else 
//			return 0;
//		
////		//return n1+n2;
////		double result;
////		
////		switch (operation)
////		{
////		case "add":
////			result = n1 + n2;
////		case "sub":	
////			result = n1 - n2;
////		default:
////			result= 0;
////			return result;
//			
////		}
//		
//	}
		
	@GetMapping("/calculator/add")
	public String calculate(@RequestParam(value = "n1",required = true,defaultValue = "1") int n1,
			@RequestParam(value = "n2",required = true,defaultValue = "2" )int n2
			)
	{
	return "<h1>The sum is "+ Calc.addNo(n1, n2)+"</h1>";
	}
	}
	
	
	
	
	
	
	


