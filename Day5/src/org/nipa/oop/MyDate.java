package org.nipa.oop;

//MyDate��� �ϴ� Ŭ������ �����. (user defined)
public class MyDate {

	
	//MyDate�� class member �����̸� , Ŭ������ �Ӽ�(attribute)�̶�� �Ѵ�.
	int year;
	int month;
	int day;
	
	/*(���м�) private�� ���� �տ� �Է��ϸ�  OOTest���� ������(�������ٺҰ�).
	�޼ҵ� �ȿ��� ���� ���ϴ� �����Ϳ� �´� ���� �����ϱ� ���ؼ� private�� �̿��ϴ°��̴�.
	*/
	
	
	//�Ӽ��� �����ϱ� ���� ��� = �޼ҵ�
	public  void setYear(int year) {
		this.year = year;
	}
	
	public void setMonth(int month) {
		this.month = month;
	}
	
	public void setDay(int day) {
		this.day = day;
	}
	
	public int getYear() {
		return year;
	}
	
	public int getMonth() {
		
		return month;
	}
	
	public int getDay() {
		return day;
	}

	

	
	
}
