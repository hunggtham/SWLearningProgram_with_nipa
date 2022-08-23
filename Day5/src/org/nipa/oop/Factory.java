package org.nipa.oop;

public class Factory {
	int age;
	
	public Factory() {
		
		
	}
	public static Shape getInstance(int i) {
		Shape s = null;
		if(i ==1) {
			s = new Triangle();
		}else if(i == 2){
			s = new Circle();
		}else {
			s = new Rectangle();
		}
		return s;
	}

}
