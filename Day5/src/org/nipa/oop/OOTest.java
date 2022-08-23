package org.nipa.oop;

public class OOTest {
	static String callme = "it's me";
	static {
		System.out.println("take a break");
	}
	public static void draw(ShapeIF s) {
		s.draw();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShapeIF st = new TriangleImpl();
		draw(st);
		
		ShapeIF sr = new RectangleImpl();
		
		ShapeIF sc = new CircleImpl();

		ShapeIF sArr[] = {st,sc,sr};
		
		TriangleImpl ti = new TriangleImpl();
		
		MyInterface mt = new TriangleImpl();
		

		Singleton one = Singleton.getInstance();
		Singleton two = Singleton.getInstance();
		Singleton three = Singleton.getInstance();
		
		System.out.println("one == two:" + (one == two));
		System.out.println("one equals two:"+ one.equals(two));
		
		System.out.println("two == three:"+(two == three));
		
		// OOTest obj = new OOTest();
		System.out.println(OOTest.callme);

		// MyDate�� ������ �����ϴ�. ���� : public ���� , ���� package �̱� �����̴�.
		MyDate today = new MyDate(); // MyDate��� Ŭ������ ���� today��� ��ü�� �����ϸ�, ��ҹ��ڸ������ϴ� java�� Ư����
										// MyDateö�ڰ� ���ƾ��Ѵ�.
		today.year = 2022;
		today.month = 8;
		today.day = 3;

		// Contants.PI = 3.15F;

		System.out.println(today.year);
		System.out.println(today.month);
		System.out.println(today.day);

		// today��� ��ü�� setYear �޼ҵ带 ���� year���� �����ش�.
		today.setYear(2022);
		// today��� ��ü�� setMonth �޼ҵ带 ���� month���� �����ش�.
		today.setMonth(8);
		// today��� ��ü�� setDay �޼ҵ带 ���� day���� �����ش�.
		today.setDay(3);

		// today��� ��ü���� year,month,day���� ���� �޼ҵ带 ���� �����´�.
		System.out.println(today.getYear());
		System.out.println(today.getMonth());
		System.out.println(today.getDay());

		// Person Ŭ������ p��ü ����
		/*
		 * Person p = new Person(); ��ü �̸��� �ҹ��ڷ� ���°� developer ������ ��������
		 * ����̴�. p.setName("ȫ�浿"); p.setAge(40); p.setMale(true);
		 */

		// �Ķ���� 3��¥�� ������ ȣ��
		Person p = new Person("Tham", 22, true);
		// ������(Constructor)�� ���ؼ� 33�� line�� ���·� ��ü ���� �Ұ�.
		// �������� ����� �־����� ���� ������� �Է��ؾ��Ѵ�.
		System.out.println(p.getName());
		System.out.println(p.getAge());
		System.out.println(p.isMale());

		Person p1 = new Person("Tham", 22, true);
		// ������(Constructor)�� ���ؼ� 33�� line�� ���·� ��ü ���� �Ұ�.
		// �������� ����� �־����� ���� ������� �Է��ؾ��Ѵ�.
		System.out.println(p1.getName());
		System.out.println(p1.getAge());
		System.out.println(p1.isMale());

		System.out.println(p.equals(p1));

		System.out.println(p.toString());
		System.out.println(p1.toString());

		Student s = new Student("Lee", 35, false);
		System.out.println(s.getAge()); // studentŬ������ personŬ������ ����� �޾ұ⶧���� �޼ҵ� ��밡���ϴ�.
		System.out.println(s.getName());
		System.out.println(s.isMale());

		s.setMale(true);

		/*
		 * Student s1 = new Student("Lee",35,false,"computer",12345,"univ");
		 * System.out.println(s1.getNumber());
		 */
		/*
		 * 14.5 �� double�� �νĵȴ�. �׷��Ƿ�, float�� ĳ�������ش�. Car c = new
		 * Car("hyundai", 3000,(float)14.5); c.go(); c.stop();
		 * 
		 * Taxi t = new Taxi("kia", 1000, 20.0F, "red"); t.go();
		 * System.out.println(t.getColor());//
		 */

		// Shape s = new Shape();->��ü(��ü���� example��) �� ���� �� ���� �����̴�. //
		// �߻����̱⶧���� ��������� ����.
		// ��ü������ ���̶���Ʈ. ������

		// Triangle, circle,rect �� shape�� ��ӹ޾����Ƿ� ������ ���� �� �� �ִ�.
//		Shape t = Factory.getInstance(1);;
//		Shape c = Factory.getInstance(2);
//		Shape r = Factory.getInstance(3);

		// array with object
		// Shape arr[] = {t,c,r};

		Shape arr[] = new Shape[6];

		arr[0] = Factory.getInstance(1);
		arr[1] = Factory.getInstance(2);
		arr[2] = Factory.getInstance(3);
		arr[3] = Factory.getInstance(1);
		arr[4] = Factory.getInstance(2);
		arr[5] = Factory.getInstance(3);

		// if count is static -> class level( share with class) , non-static -> object
		// class(no share)
		// static: don't have to make object to use,
		for (int i = 0; i < arr.length; i++) {
			// arr[i].draw();
			// same with draw(arr[i]);
			System.out.println("count : " + arr[i].getCount());// nonstatic : 1 1 1 1 1 1 , static: 6 6 6 6 6 6
		}

//		t.draw();
//		c.draw();
//		r.draw();
//		
//		draw(t);
//		draw(c);
//		draw(r);

		String string = "hello";
		System.out.println(string);
		System.out.println(string.toString());

	}

	// overriding = ��ü�� ���� �� �־���ϴϱ� ����ȭ - > ������ ��Ų��.
	public static void draw(Shape t) {
		t.draw();
	}

}
