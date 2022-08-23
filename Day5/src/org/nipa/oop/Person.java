package org.nipa.oop;

//Ŭ���� ��Ī�� ���� ����.
//������ �����ϵ��� public
public class Person extends java.lang.Object {// extends�� �������� ������ (������� ������) ObjectŬ������ ����������
												// ����ϴ� ���̴�.
	// ��, Object�� ��� Ŭ������ �θ��� ���̴�.

	private String name;
	private int age;
	private boolean isMale; // isMale �� false�� ����

	// ������ (Constructor) ,�ٸ�Ŭ�������� �����ؾ��ϹǷ� public �� ����Ѵ�.
	// ��ü�� ���鶧 ȣ���ϴ°�
	public Person(String name, int age, boolean isMale) {
		super();
		this.name = name;
		this.age = age;
		this.isMale = isMale;
	}

	// Getter �� Setter�̴�. �����ʸ��콺Ŭ�� -> Source -> Generate Getters and Setters
	// Ŭ���ϸ� �ѹ��� ���������ϴ�.
	// �޼ҵ�� ����(Action)�̹Ƿ� ����� ����.

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isMale() { // boolean�� �������� is�� ���۵ȴ�(����)
		return isMale;
	}

	public void setMale(boolean isMale) {
		this.isMale = isMale;
	}

	@Override
	public boolean equals(Object obj) {
		boolean flag = false;
		boolean isSameName = false;
		Person p = (Person)obj;
		
		isSameName = this.name.equals(p.getName());
		flag = isSameName;
		
		boolean isSameAge = false;
		isSameAge = this.age ==p.getAge();
		
		boolean isSameGender = isMale == p.isMale();
		/*
		if(isSameName) {
			if(isSameAge) {
				if(isSameGender) {
					flag = true;
				}
			}
		}
		*/
		flag = (isSameName & isSameAge & isSameGender);//return true if true true true, else false
		// & :(bitwise and)- work on bit -> new integer , on boolean : check both side operand
		//&&: operator short-circuits:it doesn't evaluate the right-hand side operand or expression when the left-hand side operand or expression is false
		return flag;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
//		String gender = null;
//		if(isMale) {
//			gender = "Male";
//		}else {
//			gender = "Female";
//		}
		
		return name + " is " + age + " years old and " + (isMale ? "Male" : "Female");
	}
	

}
