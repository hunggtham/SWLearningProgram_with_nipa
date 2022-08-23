package org.nipa.oop;

public  class Triangle extends Shape {

	public Triangle() {
		count ++;  
	}

/*�� ��ü ������ �Ұ��ѵ� abstract �� �������ϴ°� ?*/
	
	/*��ü�� ���� �� �ְ� �Ϸ��� abstract �� ���ָ�ȴ�. body�� ���� �޼ҵ�(abstract �� �޼ҵ�)�� body������ش�.*/
	public void draw() { 
		/*draw() ������ -> ����Ŭ������ �ִ� �޼ҵ带 ���� Ŭ�������� �����Ǹ� ���ش�.�̸��� ������, �ٸ� ������ �Ѵ�.
		 * �����Ǵ� ����� ������� �Ѵ�.
		*/
		System.out.println("drawing triangle");
		
	}

	@Override
	public void erase() {
		// TODO Auto-generated method stub
		
	};

		
	
}
