package main;

import membership.FuzzySingleton;
import rules.BallAndBeamPlant;

public class Main {
	public static void main(String [] args) {
		BallAndBeamPlant ini = new BallAndBeamPlant();
		double [] inputValues = {-0.0625, 3}; 
		FuzzySingleton result = (FuzzySingleton) ini.fuzzyInference(inputValues)[0];
		
		System.out.println(result.getValue());
	}
}
