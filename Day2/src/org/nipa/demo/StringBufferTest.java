package org.nipa.demo;

public class StringBufferTest {
	public static void main(String[] args) {
		StringBuffer s0 = new StringBuffer("Hello");
		StringBuffer s1 = new StringBuffer("Kim");

		//System.out.println(s0 += s1);//false
		System.out.println(s0.append(s1));
		// if s0, s1 is String( not String Buffer)  s0+=s1 ->  HelloKim
		
	}
}
