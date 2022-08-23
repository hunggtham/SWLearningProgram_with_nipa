package org.nipa.oop;

public class Car2 {
	private String name;
	private int price;
	private float ratio;
	
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
//Constructor안에 선언되어있는 변수 : 로컬변수
	//this : 이클래스에 선언된것을 참조하라.라는뜻
	public Car2(String name, int price, float ratio) {
		super();
		this.name = name;
		this.price = price;
		this.ratio = ratio;
	}

	public void go() {
		System.out.println(ratio + "연비의"+price +"짜리의"+name+"가 간다");
		
	}
	public void stop() {
		System.out.println(ratio + "연비의"+price +"짜리의"+name+"가 섰다");
	}

}
