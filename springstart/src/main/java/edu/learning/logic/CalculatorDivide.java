package edu.learning.logic;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class CalculatorDivide {
	

	@GetMapping("/divide/div")
	public String division(@RequestParam(value = "firstParamforDivion",required = true,defaultValue = "1") double n1,
			@RequestParam(value = "SecondParamforDivion",required = true,defaultValue = "1" )double n2
			)
	{
	return "<h1>The division is "+ Calc.divNo(n1, n2)+"</h1>";
	}

}
