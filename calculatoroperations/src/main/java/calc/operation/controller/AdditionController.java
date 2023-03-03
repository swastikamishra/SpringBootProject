package calc.operation.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import calc.operation.entity.CalcLogic;

@RestController
public class AdditionController {
	
	//This method is responsible for adding two numbers and displaying it in web.
	
	@GetMapping("/addition/add")
	public String addition (@RequestParam(value = "num1",required = true,defaultValue = "1")int num1,
			@RequestParam(value = "num2",required = true,defaultValue = "2" )int num2)
	{
		return "<h1>The addition is "+ CalcLogic.addNo(num1, num2)+"</h1>";
	}
	

	

}
