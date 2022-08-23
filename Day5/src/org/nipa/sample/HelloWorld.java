package org.nipa.sample;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Hello World" + args[0] + args[1]);
		/*
		int i = Integer.parseInt(args[0]);
		int j = Integer.parseInt(args[1]);
		
		int a = 1;
		int b = 2;
		System.out.println(a+b);
		System.out.println(i+j);
		
		byte b1 = 1;
		byte b2 = 2;
		

		System.out.println(b1+b2);
		
		short s1 = 1;
		short s2 = 2;
		
		System.out.println(s1+s2);
		
		long l1 = 1;
		long l2= 2;
		System.out.println(l1+l2);
		*/
		/*
		short s1 = 1;
		short s2 = 2;
		int i = 3;
		short s3 = (short)(s1+s2);
		
		float f = 1;
		
		System.out.println(f);
		System.out.println(5/2F);
		//*/
		
		int i = Integer.parseInt(args[0]);
		int j = Integer.parseInt(args[1]);
		System.out.println(plus(i,j));
		
		System.out.println(plus(args[0], args[1]));
		
		//System.out.println(plus(1.0,3.0));
		
	}
	
	public static float plus(float i, float f) {
		return i + f;
	}
	/*
	public static float plus(int i, float f) {
		return i + f;
	}*/
	
	public static int plus(String s, String s1)
	{
		int i = Integer.parseInt(s);
		int j = Integer.parseInt(s1);
		return i + j;
	}
	
	/*
	public static int plus(int i , int j) {
		return i + j;
	}//*/
	
	
	

}
