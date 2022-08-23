package org.nipa.sample;

import java.io.*;

//import java.lang.ArrayIndexOutOfBoundsException;
public class Test {

	public static void main(String[] args) throws FileNotFoundException {

//		try {
//			int i = Integer.parseInt("#");
//			String s = null;
//			s.length();
//			System.out.println("end of try");
//		}
//		catch (java.lang.NullPointerException e) {
//			e.printStackTrace();
//		} catch (java.lang.NumberFormatException e) {
//			e.printStackTrace();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

		File f = new File("");
		FileInputStream fis = new FileInputStream(f);
		FileOutputStream fos = null;

		String name = null;

		// String name = request.getParameter(name);//use in web
		try {
			if (name.length() > 4) {
			}
		} catch (NullPointerException e) {
			System.out.println("input name, please");
		}

//		
//		if(name == null) {
//			System.out.println("please input name");
//		}else {
//			System.out.println("name is OK");
//			if(name.length()< 4) {
//				
//			}else {
//				
//			}
//		}

		System.out.println("End of main");

	}

	public static int multiply(int i, int j) {
		return i * j;
	}

	public static int plus(int i, int j) {
		return i + j;
	}

	public static int minus(int i, int j) {
		return i - j;
	}
}
