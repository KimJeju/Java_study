package com.in28minutes.oops;

public class MotorBike {

	//오토바이의 상태를 나타내는 함수 (state)
	private int speed; //멤버 변수 Speed
	
	
	
	
	public int getSpeed() {
		return speed;
	}




	public void setSpeed(int speed) {
		this.speed = speed;
	}




	void start() {
		System.out.println("Bike started");
	}
}
