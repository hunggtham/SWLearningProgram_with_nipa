package org.nipa.oop;

public class Taxi extends Car{

	private String color;
	private String number;
	
	public Taxi(String name, int price, float ratio) {
		// TODO Auto-generated constructor stub
		super(name,price, ratio);
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	
	//�Ķ���� 4��¥��
	public Taxi(String name, int price, float ratio, String color) {
		this(name, price, ratio);
		this.color = color;
		this.color = "blue";
	}
	//�Ķ���� 5��¥��
	public Taxi(String name, int price, float ratio, String color, String number) {
		super(name, price, ratio);
		this.color = color;
		this.number = number;
	}
	
	

}
