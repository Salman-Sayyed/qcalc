package com.crio.qcalc;

public class QcalcApplication {

	public static void main(String[] args) {
		//SpringApplication.run(QcalcApplication.class, args);
		System.out.println("Starting QCalc..");
       	// StandardCalculator calc = new StandardCalculator();
       	// calc.add(1, 2);
       	// System.out.println(calc.getResult());
		LogicCalculator calc = new LogicCalculator();
		calc.OR(8, 6);
		calc.printResult();
	}

}
