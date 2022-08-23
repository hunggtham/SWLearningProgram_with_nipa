package org.nipa.sample;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int arr[] = { 1, 2, (int) 3.0 ,4}; //크기가 4인 배열이다. 
		//int형이므로, 3.0의 float값을 int로 캐스팅(형변환) 해준다.
		
		int j = 0;
		System.out.println(arr.length); //배열의 크기를 출력하는 방법이다. length를 사용한다.
		System.out.println(arr[j++]); // arr[j++] =>arr[0] 을 의미한다.
		System.out.println(arr[j++]); //arr[j++] =>arr[1]을 의미한다.
		System.out.println(arr[j++]); //arr[j++] =>arr[2]을 의미한다.
		System.out.println(arr[j++]); //arr[j++] =>arr[3]을 의미한다.
		
		//for문의 조건을 배열의 크기로 지정할 수 있다.
		for(int k=0; k<arr.length; k++) {
			System.out.println(arr[k]);
		}
		
	
		String s ="hello world"; //메모리에 s값 저장
		String s1 = new String("hello world"); //String 객체 생성하여 별도의 메모리를 지정해준다.
		String s2 = "hello world"; //메모리에 s2값 저장
		
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s2);
		
		
		System.out.println(s.equals(s1)); //s와 s1의 String 값("hello world")을 비교한다.
		System.out.println(s.equals(s2)); //s와 s1의 String 값("hello world")을 비교한다.
		System.out.println(s == s1); //s 와 s1값이 같은지 주소값을 비교한다. 이때, s1은 String객체이므로 둘의 주소값이 달라 false가 나온다.
		System.out.println(s == s2); //주소값 비교한다.s 와 s2는 같은 메모리를 사용하므로 주소값이 같아 true값이 나온다.
		System.out.println(s.length()); //문자열의 크기를 알 수 있는 방법으로, .length()를 사용한다. java api doc 의 String 클래스 확인하면된다.
		
		System.out.println(s.charAt(6)); //.charAt(n) : s문자열의 n번째에 위치하는 문자값을 리턴할 수 있게한다.
		//char : 문자를 저장하기 위한 형식지정자
		char c = s.charAt(6);
		System.out.println(c);
		
		
		char c0 = 'a';
		char c1 = 'b';
		
		System.out.println(c0);
		System.out.println(c1);
		
		System.out.println((int)c0); //c0의 아스키코드값 int로 형변환하여 출력
		System.out.println((int)c1); //c1의 아스키코드값 int로 형변환하여 출력
		System.out.println(c0+c1); //각 아스키코드값을 더한다. 문자열은 operator를 지원하지 않기때문에 아스키코드값의 덧셈을 리턴한다.
		System.out.println(s.substring(4,s.length())); //.substring(int index, int num) :원하는 인덱스값의 범위를 지정하여 문자를 추출한다. 
		
		String s4 = s.substring(4,6); //o와 공백이 출력된다. 공백 역시 문자이므로, 보이지않지만 출력에 포함된다.
		System.out.println(s4.trim().equals("o")); //공백을 제거하는 .trim()을 사용하여 공백 제거한뒤, s4 에 o라는 문자가 존재하는지 확인한다.
		
	}
	
	

}
