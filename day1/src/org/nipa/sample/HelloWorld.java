package org.nipa.sample;

public class HelloWorld {

	public static void main(String[] args) {
		// System.out.println("Hello World" + args[0] + args[1]);
		/*
		 * int i = Integer.parseInt(args[0]); int j = Integer.parseInt(args[1]);
		 * System.out.println(i + j);
		 * 
		 * int a = 1; int b = 2;
		 * 
		 * System.out.println(a + b); byte a1 = 1; byte a2 = 2; System.out.println(a1 +
		 * a2);
		 * 
		 * short b1 = 1; short b2 = 2;
		 * 
		 * System.out.println(b1 + b2);
		 * 
		 * long l1 = 1; long l2 = 2; System.out.println(l1 + l2);
		 */
//		short s1 = 1;
//		short s2 = 2;
		//short s3= s1 + s2;
		//cách sửa
//		short s4 = (short)(s1 + s2);// hoặc int s3 = s1+ s2
//		
//		float f=1;
//		System.out.println(f);
//		System.out.println(5/2);
//		System.out.println(5/2.0);
//		System.out.println(5/2F);
//		
		//argument in run as -> run configuration-> program argument : 1 2
		int i = Integer.parseInt(args[0]); 
		int j = Integer.parseInt(args[1]);
		
		System.out.println(plus(i, j));
		System.out.println(plus(args[0],args[1]));
		
		//System.out.println(plus(1.0f,2.0f));
		
		
	}
	
	public static float plus(int i, float f) {
		return i + f;
	}
	
	/*
	public static int plus(int i , int j) {
		return i +j ;
	}
	*/
	
	public static int plus(String i , String j) {
//		int i1 = Integer.parseInt(i);
//		int i2 = Integer.parseInt(j);
//		return i1+ i2;
//		rut gon
		return Integer.parseInt(i)+ Integer.parseInt(j);
	}
	
}
