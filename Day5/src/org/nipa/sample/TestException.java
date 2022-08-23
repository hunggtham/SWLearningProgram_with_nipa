package org.nipa.sample;

public class TestException {


	public static void main(String[] args) {// throws MyException {
		int i = 0;
		try {
			 i = parse(args[0]);
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(i);
		System.out.println("end of main");

	}
	
	public static int parse(String s) throws MyException {
		int i = Integer.parseInt(s);
		return i;
	}
}
