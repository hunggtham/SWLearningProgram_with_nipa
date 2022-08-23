package org.nipa.demo;

public class function {

	public static void main(String[] args) {
		//function with if else
		/*
		//run configuration -> program argument: 1+ 2 -> plus(1,2) -> 1 + 2 -> 3
		//program argument: 1 x 2 -> ,multiply(1,2) -> 1 x 2 -> 2
		String s0= args[0];
		String s1= args[1];
		String s2= args[2];
		
		int n1= Integer.parseInt(s0);
		int n2= Integer.parseInt(s2);
		
		if(s1.equals("+")) {
			System.out.println(plus(n1,n2));
		}else if(s1.equals("-")) {
			System.out.println(minus(n1,n2));
		
		}else if(s1.equals("x")) {
			System.out.println(multiply(n1, n2));
		}else {}
		*/
		//String test
		
		String s0 = "helloworld";
		String s1 = new String ("helloworld");
		String s2 = "helloworld";
		
		System.out.println(s0);
		System.out.println(s1);
		System.out.println(s2);
		//check value
		System.out.println(s0.equals(s1));//true
		System.out.println(s0.equals(s2));//true
		//check preference
		System.out.println(s0 == s1);//false
		System.out.println(s0 == s2);//true
		
		//System.out.println(s0.substring(4,s0.length()+1));//error indexoutofboundexeption
		String s4 = s0.substring(4,6);
		System.out.println(s4);//ow
		System.out.println(s4.equals("o"));//false
		System.out.println(s4.trim().equals("o"));//false
		
		
		System.out.println("==name==");
		String name = new String("Hello");
		String name1 = new String("Kim");
		
		System.out.println(name+=name1);//HelloKim
		
		System.out.println("==i , j==");
		int i = 10;
		int j = 10;
		
		System.out.println(i == j);//true
		
		System.out.println(s0.length());
		System.out.println(s1.length());
		
		System.out.println("==char==");
		char c = s0.charAt(6);
		System.out.println(c);
		
		char c1 = 'a';
		char c2 = 'b';
		System.out.println(c1);//a
		System.out.println(c2);//b
		System.out.println((int)(c1));//97
		System.out.println((int)c2);//98
		System.out.println(c1+ c2);//195 = 97+98
		System.out.println((char)(c1+c2));//A~
		
	
	}

	public static int plus(int a, int b) {
		return a + b;
	}

	public static int minus(int a, int b) {
		return a - b;
	}

	public static int multiply(int a, int b) {
		return a * b;
	}
}
