package com.in28minutes.oops;

public class MotorBikeRunner {

	public static void main(String[] args) {
		MotorBike ducati = new MotorBike();
		MotorBike honda = new MotorBike();

		
		ducati.start();
		honda.start();
		
		ducati.setSpeed(100);
		//System.out.println(ducati.getSpeed());
		
		ducati.increaseSpeed(100);
		honda.increaseSpeed(100);
		
		ducati.decreaseSpeed(50);
		honda.decreaseSpeed(0);
		
		
		//honda.setSpeed(80);
		System.out.println(ducati.getSpeed());
		System.out.println(honda.getSpeed());

	}

}
