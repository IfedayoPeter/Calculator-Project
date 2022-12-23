package com.project.calculator;

public class Add implements Operate {

	@Override
	public Double getResult(Double... numbers) {
		Double sum = 0.0;

		for (Double num : numbers) {
//			adding up numbers supplied in the numbers array
			sum += num;
		}
		return sum;
	}

}
