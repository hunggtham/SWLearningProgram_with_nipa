package org.nipa.sample;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int arr[] = { 1, 2, (int) 3.0 ,4}; //ũ�Ⱑ 4�� �迭�̴�. 
		//int���̹Ƿ�, 3.0�� float���� int�� ĳ����(����ȯ) ���ش�.
		
		int j = 0;
		System.out.println(arr.length); //�迭�� ũ�⸦ ����ϴ� ����̴�. length�� ����Ѵ�.
		System.out.println(arr[j++]); // arr[j++] =>arr[0] �� �ǹ��Ѵ�.
		System.out.println(arr[j++]); //arr[j++] =>arr[1]�� �ǹ��Ѵ�.
		System.out.println(arr[j++]); //arr[j++] =>arr[2]�� �ǹ��Ѵ�.
		System.out.println(arr[j++]); //arr[j++] =>arr[3]�� �ǹ��Ѵ�.
		
		//for���� ������ �迭�� ũ��� ������ �� �ִ�.
		for(int k=0; k<arr.length; k++) {
			System.out.println(arr[k]);
		}
		
	
		String s ="hello world"; //�޸𸮿� s�� ����
		String s1 = new String("hello world"); //String ��ü �����Ͽ� ������ �޸𸮸� �������ش�.
		String s2 = "hello world"; //�޸𸮿� s2�� ����
		
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s2);
		
		
		System.out.println(s.equals(s1)); //s�� s1�� String ��("hello world")�� ���Ѵ�.
		System.out.println(s.equals(s2)); //s�� s1�� String ��("hello world")�� ���Ѵ�.
		System.out.println(s == s1); //s �� s1���� ������ �ּҰ��� ���Ѵ�. �̶�, s1�� String��ü�̹Ƿ� ���� �ּҰ��� �޶� false�� ���´�.
		System.out.println(s == s2); //�ּҰ� ���Ѵ�.s �� s2�� ���� �޸𸮸� ����ϹǷ� �ּҰ��� ���� true���� ���´�.
		System.out.println(s.length()); //���ڿ��� ũ�⸦ �� �� �ִ� �������, .length()�� ����Ѵ�. java api doc �� String Ŭ���� Ȯ���ϸ�ȴ�.
		
		System.out.println(s.charAt(6)); //.charAt(n) : s���ڿ��� n��°�� ��ġ�ϴ� ���ڰ��� ������ �� �ְ��Ѵ�.
		//char : ���ڸ� �����ϱ� ���� ����������
		char c = s.charAt(6);
		System.out.println(c);
		
		
		char c0 = 'a';
		char c1 = 'b';
		
		System.out.println(c0);
		System.out.println(c1);
		
		System.out.println((int)c0); //c0�� �ƽ�Ű�ڵ尪 int�� ����ȯ�Ͽ� ���
		System.out.println((int)c1); //c1�� �ƽ�Ű�ڵ尪 int�� ����ȯ�Ͽ� ���
		System.out.println(c0+c1); //�� �ƽ�Ű�ڵ尪�� ���Ѵ�. ���ڿ��� operator�� �������� �ʱ⶧���� �ƽ�Ű�ڵ尪�� ������ �����Ѵ�.
		System.out.println(s.substring(4,s.length())); //.substring(int index, int num) :���ϴ� �ε������� ������ �����Ͽ� ���ڸ� �����Ѵ�. 
		
		String s4 = s.substring(4,6); //o�� ������ ��µȴ�. ���� ���� �����̹Ƿ�, ������������ ��¿� ���Եȴ�.
		System.out.println(s4.trim().equals("o")); //������ �����ϴ� .trim()�� ����Ͽ� ���� �����ѵ�, s4 �� o��� ���ڰ� �����ϴ��� Ȯ���Ѵ�.
		
	}
	
	

}
