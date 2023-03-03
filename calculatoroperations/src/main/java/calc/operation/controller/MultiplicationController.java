package calc.operation.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import calc.operation.entity.CalcLogic;


@RestController
public class MultiplicationController {
	
	//This method is responsible for multiplying two numbers and displaying it in web.
	@GetMapping("/multiply/multi")
	public String multiplication(@RequestParam(value = "num1",required = true,defaultValue = "1")double num1,
			@RequestParam(value = "num2",required = true,defaultValue = "2" )double num2
			)
	{
	return "<h1>The multiplication is "+ CalcLogic.multiNo(num1, num2)+"</h1>";
	}

}
