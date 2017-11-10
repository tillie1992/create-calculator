package com.lmig.gfc.calculator.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.lmig.gfc.calculator.controllers.models.Calculator;

@Controller
public class CalculatorController {

	@RequestMapping("/")
	public String defaultPage() {
		return "calculator";

	}

	@RequestMapping("/calculate")
	public ModelAndView calculate(double firstNumber, double secondNumber, String function) {

		// create an instance of calculator
		// call the add method
		// store the return value in a variable named "answer"

		Calculator calculator = new Calculator();
		double result = 0;
		if (function.equals("+")) {
			result = calculator.add (firstNumber, secondNumber);
		}
		if (function.equals("-")) {
			result = calculator.subtract (firstNumber, secondNumber);
		}
		
		if (function.equals("*")) {
			result = calculator.multiply(firstNumber, secondNumber);
		}
		if (function.equals("/")) {
			result= calculator.divide(firstNumber, secondNumber);
		}
		if (function.equals("^")) {
			result=calculator.exponential(firstNumber, secondNumber);
		}
		
		
		// create a model and view
		// set view name to calculator
		// return the model and view
		ModelAndView mv = new ModelAndView();
		mv.setViewName("calculator");
		// add the sum into the model and view using addObject
		mv.addObject("result", result);

		return mv;

	}

}
