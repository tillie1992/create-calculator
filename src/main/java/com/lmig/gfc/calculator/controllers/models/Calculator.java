package com.lmig.gfc.calculator.controllers.models;

public class Calculator {

	public double add(double firstNumber, double secondNumber) {
		return firstNumber + secondNumber;

	}

	public double subtract(double firstNumber, double secondNumber) {
		return firstNumber - secondNumber;

	}

	public double multiply(double firstNumber, double secondNumber) {
		return  firstNumber * secondNumber;

	}

	public double divide(double firstNumber, double secondNumber) {
		return firstNumber / secondNumber;

	}

	public double exponential(double firstNumber, double secondNumber) {
		return Math.pow(firstNumber, secondNumber);

	}
}
