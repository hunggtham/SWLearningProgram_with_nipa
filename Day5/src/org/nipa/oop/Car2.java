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
//Constructor�ȿ� ����Ǿ��ִ� ���� : ���ú���
	//this : ��Ŭ������ ����Ȱ��� �����϶�.��¶�
	public Car2(String name, int price, float ratio) {
		super();
		this.name = name;
		this.price = price;
		this.ratio = ratio;
	}

	public void go() {
		System.out.println(ratio + "������"+price +"¥����"+name+"�� ����");
		
	}
	public void stop() {
		System.out.println(ratio + "������"+price +"¥����"+name+"�� ����");
	}

}
