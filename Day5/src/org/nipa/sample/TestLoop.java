package org.nipa.sample;

public class TestLoop {

	public static void  main(String[] args) {
		// TODO Auto-generated method stub

		int sum=0; //���� ��Ÿ���� ����
		sum = sum +1; // sum = 0���� +1 ���ش�.
		System.out.println(sum);
		
		sum +=1;
		System.out.println(sum);
		
		//sum���� 1~100������ ���� ���Ѵ�.
		for(int i=1; i<=100; i++) {
			sum+=i;
			System.out.println(sum); 
		}
		
		//�� for���� while���� ����Ͽ� ������ ���� ��Ÿ�� �� �ִ�.
		int i= 100;
		int j=1;
		
		//1. j�� ������ i���� �۰ų� ���������� (����)
		while(j<=i) {
			sum +=j;
			j++;
		}
		//2. j�� ������ i+1(101)���� ���������� (�̸�)
		while(j<i+1) {
			sum +=j;
			j++;
		}
		
		
		//���ѷ��� (���� ���� ���Ѿ���)
		while(isTrue()) { //while()��ȣ �ȿ� �޼ҵ� ��� true���� �־�ȴ�.
			System.out.println("plz,kill me");
			
		}
		
		
		//for���� �̿��� * �����ﰢ�� ������� ���
		int t;
		int k;
		for(t=0; t<5; t++) {
			for(k=0; k<=t; k++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
		
	}
	//true�� �����ϴ� �޼ҵ�
	public static boolean isTrue() {
		return true;
	}

}
