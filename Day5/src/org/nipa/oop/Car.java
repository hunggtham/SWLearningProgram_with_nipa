package org.nipa.oop;

public class Car {

	//Car class member �����̸� , Ŭ������ �Ӽ�(attribute)�̶�� �Ѵ�.
	private String name;
	private int price;
	private float ratio;
	
	
	//Getters and Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public float getRatio() {
		return ratio;
	}
	public void setRatio(float ratio) {
		this.ratio = ratio;
	}
	
	//Constructor
	public Car(String name, int price, float ratio) {
		super();
		this.name = name;
		this.price = price;
		this.ratio = ratio;
	}
	
	public void go() {
		System.out.println(ratio + "������ " + price + "¥����  " + name + "�� ����");
	}
	
	public void stop() {
		System.out.println(ratio + "������ " + price + "¥����  " + name + "�� ����");
	}

	

}
