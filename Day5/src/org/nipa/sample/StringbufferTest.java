package org.nipa.sample;

public class StringbufferTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 Stringbuffer와 String의 차이는, 사용량의 차이이다. String buffer가 String보다 사용량이 더 적어 
		메모리를 적게 쓰기 위한 개발을 할때에는 유용하다.
		*/
		
		
		StringBuffer s = new StringBuffer("Hello");
		StringBuffer s1 = new StringBuffer("Kim");
		System.out.println(s.append(s1));

	}

}
