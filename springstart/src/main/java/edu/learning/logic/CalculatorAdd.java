package edu.learning.logic;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class CalculatorAdd {
	
	
	@GetMapping("/addition/add")
	public String addition(@RequestParam(value = "firstParamForAdd",required = true,defaultValue = "1") int n1,
			@RequestParam(value = "SecondParamForAdd",required = true,defaultValue = "2" )int n2
			)
	{
	return "<h1>The sum is "+ Calc.addNo(n1, n2)+"</h1>";
	}
	


}
