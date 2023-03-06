package edu.learning.logic;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class CalculatorMultiply {
	

	@GetMapping("/multiply/multi")
	public String multiplication(@RequestParam(value = "firstParamForAdd",required = true,defaultValue = "1")double n1,
			@RequestParam(value = "secondParamForAdd",required = true,defaultValue = "2" )double n2
			)
	{
	return "<h1>The multiplication is "+ Calc.multiNo(n1, n2)+"</h1>";
	}

}
