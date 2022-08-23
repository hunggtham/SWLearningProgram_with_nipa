package org.nipa.oop;

public class Car {

	//Car class member 변수이며 , 클래스의 속성(attribute)이라고도 한다.
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
		System.out.println(ratio + "연비의 " + price + "짜리의  " + name + "가 간다");
	}
	
	public void stop() {
		System.out.println(ratio + "연비의 " + price + "짜리의  " + name + "가 섰다");
	}

	

}
