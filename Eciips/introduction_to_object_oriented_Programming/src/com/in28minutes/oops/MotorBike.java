package com.in28minutes.oops;

public class MotorBike {

	//��������� ���¸� ��Ÿ���� �Լ� (state)
	private int speed; //��� ���� Speed
	
	MotorBike(int speed){ // ������ �ʱⰪ ��ȯ�� ���� �Լ�
		this.speed = speed;
	}
	
	MotorBike(){
		this(5);
		//this.speed = 5; 
		//����Ʈ ����
	};
	
	
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if(speed > 0)
		this.speed = speed;	
	}

	public void increaseSpeed(int howMuch) { // ���� �޼���
		
		setSpeed(this.speed + howMuch);
	}
	
	
	//���ǿ� �ҽ��ڵ������� ���� 0���� ������� �õ��� �� �״�� 100�� �Ǵ� �̽� �߻�
	public void decreaseSpeed(int howMuch) { // ���� �޼���
		
		setSpeed(this.speed - howMuch);
	}
	
	
	
	void start() {
		System.out.println("Bike started");
	}
}