package edu.learning.logic;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class CalculatorSub {
	
	
	@GetMapping("/substract/sub")
	public String substraction(@RequestParam(value = "firstParamToSubstract",required = true,defaultValue = "1") int n1,
			@RequestParam(value = "SecondParamToSubstract",required = true,defaultValue = "2" )int n2
			)
	{
	return "<h1>The difference is "+ Calc.subNo(n1, n2)+"</h1>";
	}

}
