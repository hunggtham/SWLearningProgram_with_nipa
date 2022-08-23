package org.nipa.oop;

//MyDate라고 하는 클래스를 만든다. (user defined)
public class MyDate {

	
	//MyDate의 class member 변수이며 , 클래스의 속성(attribute)이라고도 한다.
	int year;
	int month;
	int day;
	
	/*(은닉성) private을 변수 앞에 입력하면  OOTest에서 오류남(직접접근불가).
	메소드 안에서 내가 원하는 데이터에 맞는 값을 적용하기 위해서 private을 이용하는것이다.
	*/
	
	
	//속성에 접근하기 위한 통로 = 메소드
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
