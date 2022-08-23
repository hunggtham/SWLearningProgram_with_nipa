package org.nipa.oop;

public  abstract class  Shape {

	protected static int count;
	
	//abstract �޼ҵ带 �����ִ� Ŭ������ abstract Ŭ������ �����ؾ��Ѵ�.but, abstract Ŭ������ ��ü ���� �Ұ�
	public Shape() { //default constructor
		
	}
	
	public void doIt() {
		System.out.println("do something...");
	}
	//abstract
	public abstract void draw() ;
	//public void draw(); //body�� ���� �޼ҵ�� abstract �޼ҵ�� �����ؾ��Ѵ�.
	public abstract void erase();
	public int getCount() {
		return count;
	}
}
